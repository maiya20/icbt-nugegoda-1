


<%@page import="my.service.User"%>
<%@page import="com.icbt.nugegoda.client.Utils"%>
<%@page import="java.util.UUID"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%  
            String username  = "";
            String password = "";

            if(request.getParameter("username") != null) {
                username  = request.getParameter("username");
            }

            if(request.getParameter("password") != null) {
                password  = request.getParameter("password").toString();
            }
            
            //When username and password are provided as POST paramters
            
            User user = Utils.authenticate(username, password);
            
            if(user != null) {
                
                String sessionId = UUID.randomUUID().toString().toString().replace("-", "").toUpperCase();
                
                //Create and include it in response
                Cookie cookie = new Cookie("sesid", sessionId);
                response.addCookie(cookie);
                
                //Include username in session
              
                session.setAttribute(sessionId, user);
 
                out.print("Welcome " + user.getFirstName());
            } else {
                //When username and password are not provided as POST paramters
                String userText = null;
                      
                //Check each cookie from request
                for (Cookie cookie : request.getCookies()) {
                    //Check sesid cookie
                    if (cookie.getName().equals("sesid")) {
                        String sessionId = cookie.getValue();
                        
                        //Load the username from session
                        user = (User)session.getAttribute(sessionId);
                        userText = user.getFirstName();
                    }
                }
                
                if (userText == null) {
                    response.sendRedirect("login.jsp");
                } else {
                    out.print("Welcome " + userText);
                } 
            }


        %>
    </body>
</html>
