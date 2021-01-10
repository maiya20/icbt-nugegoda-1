<%-- 
    Document   : login
    Created on : 23 Dec. 2020, 12:24:35 pm
    Author     : PC
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
      <label for="fname">Username :</label>
      <input type="text" id="username" name="username"><br><br>
      <label for="lname">Password :</label>
      <input type="password" id="password" name="password"><br><br>
      <input type="submit" value="Login">
    </form>
    </body>
</html>
