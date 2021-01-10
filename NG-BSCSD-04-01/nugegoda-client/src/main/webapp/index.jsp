<%-- 
    Document   : index
    Created on : 10 Jan. 2021, 1:46:21 pm
    Author     : PC
--%>

<%@page import="my.service.NewWebService"%>
<%@page import="my.service.NewWebService_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <%
                NewWebService_Service service = new NewWebService_Service();
                NewWebService proxy = service.getNewWebServicePort();
                
                String output = proxy.hello("Mahela");
                
                out.print(output);
             %>
            
        </h1>
    </body>
</html>
