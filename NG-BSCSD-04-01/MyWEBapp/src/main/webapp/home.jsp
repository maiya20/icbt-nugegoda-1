<%-- 
    Document   : home
    Created on : 23 Dec. 2020, 11:11:57 am
    Author     : PC
--%>

<%@page import="com.icbt.mywebapp.UserSession"%>
<%@page import="java.util.UUID"%>
<%@page import="com.icbt.mywebapp.Utils"%>
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
            if(Utils.authentication(username, password)) {
                
                String sessionId = UUID.randomUUID().toString().toString().replace("-", "").toUpperCase();
                
                //Create and include it in response
                Cookie cookie = new Cookie("sesid", sessionId);
                response.addCookie(cookie);
                
                //Include username in session
                UserSession userSession = new UserSession(username, "test login");
                session.setAttribute(sessionId, userSession);
 
                out.print("Welcome " + username);
            } else {
                //When username and password are not provided as POST paramters
                String userText = null;
                      
                //Check each cookie from request
                for (Cookie cookie : request.getCookies()) {
                    //Check sesid cookie
                    if (cookie.getName().equals("sesid")) {
                        String sessionId = cookie.getValue();
                        
                        //Load the username from session
                        UserSession userSession = (UserSession)session.getAttribute(sessionId);
                        userText = userSession.getUsername();
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
