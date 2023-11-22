<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 11/22/2023
  Time: 2:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form style="max-width: 400px; margin: 0 auto;" action="/student" method="post">
    <input type="hidden" value="update" name="action">
    <h1>Update Student</h1>
    <div>
        <label for="studentCode">Student Code:</label>
        <input type="text" id="studentCode" name="studentCode" value="${student.studentCode}"
               style="width: 100%; padding: 6px; border: 1px solid #ddd; border-radius: 4px;">
    </div>
    <div>
        <label for="studentName">Student Name:</label>
        <input type="text" id="studentName" name="name" value="${student.name}"
               style=" width: 100%; padding: 6px; border: 1px solid #ddd; border-radius: 4px;">
    </div>
    <div>
        <label for="address">Address:</label>
        <input type="text" id="address" name="address" value="${student.address}"
               style=" width: 100%; padding: 6px; border: 1px solid #ddd; border-radius: 4px;">
    </div>
    <div>
        <label for="age">Age:</label>
        <input type="number" id="age" name="age" value="${student.age}"
               style=" width: 100%; padding: 6px; border: 1px solid #ddd; border-radius: 4px;">
    </div>
    <div>
        <label for="classroom">Classroom:</label>
        <input type="text" id="classroom" name="classroom" value="${student.classroom}"
               style=" width: 100%; padding: 6px; border: 1px solid #ddd; border-radius: 4px;">
    </div>
    <div>
        <label>Gender:</label>
        <select name="sex">
            <option value="true" ${student.sex ? "selected" : ""}>nam</option>
            <option value="false" ${!student.sex ? "selected" : ""}>nu</option>
        </select>
    </div>
    <div>
        <button type="submit"
                style="padding: 8px 16px; background-color: #4CAF50; color: white; border: none; border-radius: 4px; cursor: pointer;">
            Update
        </button>
    </div>
</form>
</body>
</html>
