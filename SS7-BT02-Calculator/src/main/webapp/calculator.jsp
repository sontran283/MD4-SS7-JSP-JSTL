<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 11/21/2023
  Time: 10:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Calculator</h1>
<hr>
<form action="calculatorServlet" method="post">
    <p>
        <input type="text" name="numberA" placeholder="nhập vào số thứ nhất"> <br> <br>
        <input type="text" name="numberB" placeholder="nhập vào số thứ hai">
    </p>
    <hr>
    <select>
        <option></option>
    </select>
    <p>
        <input type="submit" value="+" name="action">
        <input type="submit" value="-" name="action">
        <input type="submit" value="*" name="action">
        <input type="submit" value="/" name="action">
    </p>
    <hr>
</form>
</body>
</html>
