<%-- 
    Document   : index
    Created on : 10 Jan. 2021, 1:46:21 pm
    Author     : PC
--%>


<%@page import="my.service.Student"%>
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
                
              
                Student student = proxy.getStudent("01");
                
                out.print("<p> ID : "+ student.getId()+ "</p>");
                out.print("<p> Name : "+ student.getName() + "</p>");
                out.print("<p> NIC : "+ student.getNic()+ "</p>");
                
                proxy.addStudent(student);
             %>
            
        </h1>
    </body>
</html>
