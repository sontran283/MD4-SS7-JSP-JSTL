<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 11/22/2023
  Time: 8:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Danh sach hoc sinh</h2> <br>
<a href="student?action=add">Add New Student</a> <br>

<table border="1" cellspacing="0">
    <thead>
    <tr>
        <th>MSV</th>
        <th>Name</th>
        <th>Age</th>
        <th>Sex</th>
        <th>Class</th>
        <th>Address</th>
        <th colspan="2">action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${students}" var="item">
        <tr>
            <td>${item.studentCode}</td>
            <td>${item.studentName}</td>
            <td>${item.age}</td>
            <td>${item.sex ? "nam" : "nu"}</td>
            <td>${item.classRoom}</td>
            <td>${item.address}</td>
            <td>
                <a href="student?action=update&id=${student.studentCode}">Update</a>
                <a href="student?action=delete&id=${student.studentCode}">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
