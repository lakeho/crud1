<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Detail</title>
</head>
<body>
<h1>ID: ${Student.id}</h1>
<h1>Name: ${Student.name}</h1>
<h1>Phone number: ${Student.phone}</h1>
<h1>Address: ${Student.address}</h1>
<h1>Email: ${Student.email}</h1>

<form:form modelAttribute="Student" method="post" action="/list/${Student.id}">
    Name: <form:input path="name"/><br/>
    Phone: <form:input path="phone"/><br/>
    Address: <form:input path="address"/><br/>
    Email: <form:input path="email"/><br/>
    <button type="submit">Update</button>
</form:form>
</body>
</html>
