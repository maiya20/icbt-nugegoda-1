<%-- 
    Document   : login
    Created on : Dec 20, 2020, 1:57:46 PM
    Author     : tharik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="home.jsp" method="post">
            <label for="username">Username :</label>
            <input type="text" id="username" name="username"><br><br>
            <label for="password">Password :</label>
            <input type="password" id="password" name="password"><br><br>
            <input type="submit" value="Login">
        </form>
    </body>
</html>
