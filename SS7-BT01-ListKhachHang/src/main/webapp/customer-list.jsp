<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    table {
        border-collapse: collapse;
        width: 100%;
    }

    th, td {
        padding: 8px;
        text-align: left;
        border-bottom: 1px solid #ddd;
    }
</style>
<body>
<table border="1">
    <caption><h1>CustomerList</h1></caption>
    <thead>
    <tr>
        <th>STT</th>
        <th>Name</th>
        <th>Birthday</th>
        <th>Address</th>
        <th>Image</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="item" items="${customerList}" varStatus="loop">
        <tr>
            <td>${loop.index + 1}</td>
            <td>${item.name}</td>
            <td>${item.birthday}</td>
            <td>${item.address}</td>
            <td><img src="${item.image}" alt="Image"></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
