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

    caption {
        font-size: 1.5em;
        margin-bottom: 10px;
    }

    th {
        background-color: #f2f2f2;
    }

    tbody tr:nth-child(even) {
        background-color: #f9f9f9;
    }

    td, th {
        padding: 10px;
        border: 1px solid #ddd;
        text-align: left;
    }

    td img {
        display: block;
        margin: 0 auto;
        object-fit: cover;
    }

</style>
<body>
<table border="1">
    <caption><h1>Danh sách khách hàng</h1></caption>
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
            <td><img width="50" height="50" src="${item.image}" alt="Image"></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
