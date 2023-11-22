<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 11/22/2023
  Time: 2:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh sach sinh vien</h1>

<a href="student?action=add">Them moi sinh vien</a> <br>
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
            <td>${item.name}</td>
            <td>${item.address}</td>
            <td>${item.age}</td>
            <td>${item.classroom}</td>
            <td>${item.sex ? "nam" : "nu"}</td>
            <td>
                <a href="student?id=${item.studentCode}&action=update">update</a>
                <a onclick="return confirm('ban co chac chan muon xoa khong?')" href="student?id=${item.studentCode}&action=delete">delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
