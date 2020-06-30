<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>List</title>
</head>
<body>
<h1>Danh sach hoc sinh 0w0</h1>
<table>
    <thead>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>phone</th>
        <th>address</th>
        <th>email</th>
        <th>delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="student" items="${StudentList}">
    <tr>
        <td><a href="/list/${student.id}">${student.id}</a></td>
        <td>${student.name}</td>
        <td>${student.phone}</td>
        <td>${student.address}</td>
        <td>${student.email}</td>
        <td><a href="/delete/${student.id}">X</a></td>
    </tr>
    </c:forEach>
    </tbody>
</table>
<br/>
<a href="/add">Add student</a>
</body>
</html>
