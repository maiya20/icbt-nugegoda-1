<%-- 
    Document   : index
    Created on : 19 Dec. 2020, 5:02:30 pm
    Author     : PC
--%>

<%@page import="com.icbt.mywebapp.Student"%>
<%@page import="com.icbt.mywebapp.WebHelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
       <!-- <script>
            var text = "test123";
            alert(text);
        </script>-->
    </head>
    <body>
        
        <%
        Student[] students = WebHelper.getStudents();
       
       out.print("<ul>");
        for (Student student : students){
            out.print("<li>" + student.getName() + "</li>");
        }
        out.print("</ul>");
        
        out.print("<br/>");
        out.print("<table border=1>");
        out.print("<tr><th>Student ID</th><th>Name</th><th>NIC</th></tr>");
        for(Student student : students){
            out.print("<tr>");
            out.print("<td>"+student.getId()+"</td>");
            out.print("<td>"+student.getName()+"</td>");
            out.print("<td>"+student.getNic()+"</td>");
            out.print("</tr>");
        }
        %>
        
        
    </body>
</html>
