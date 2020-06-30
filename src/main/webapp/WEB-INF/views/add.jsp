<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Detail</title>
</head>
<body>
<form:form modelAttribute="NewStudent" method="post" action="/add">
    Name: <form:input path="name"/><br/>
    Phone: <form:input path="phone"/><br/>
    Address: <form:input path="address"/><br/>
    Email: <form:input path="email"/><br/><br/>
    <button type="submit">Add</button>
</form:form>
</body>
</html>
