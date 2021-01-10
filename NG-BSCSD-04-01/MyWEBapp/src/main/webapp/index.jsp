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

<script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script> 
       
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.22/css/jquery.dataTables.css">
<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.js"></script>


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
        out.print("<table id='student-list' class='display'>");
        out.print("<thead><tr><th>Student ID</th><th>Name</th><th>NIC</th></tr></thead>");
        out.print("<tbody>");
        for(Student student : students){
            out.print("<tr>");
            out.print("<td>"+student.getId()+"</td>");
            out.print("<td>"+student.getName()+"</td>");
            out.print("<td>"+student.getNic()+"</td>");
            out.print("</tr>");
        }
        out.print("</tbody>");
        out.print("</table>");
        %>
        
        <script>
            $(document).ready( function () {
                $('#student-list').DataTable();
            } );
        </script>
    </body>
</html>
