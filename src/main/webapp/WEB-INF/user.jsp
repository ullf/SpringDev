<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<body>
<jsp:include page="menu.jsp" />
<h1>Add a new user</h1>
<form:form action="adduser" method="POST" modelAttribute="user">
    Username: <form:input path = "username" /><br />
    Password: <form:input path = "userpassword" type="password" /><br />
    <input type = "submit" value = "register" />
</form:form>

<form:form action="authuser" method="POST" modelAttribute="user">
    Username: <form:input path = "username" /><br />
    Password: <form:input path = "userpassword" type="password" /><br />
    <input type = "submit" value = "login" />
</form:form>

<form:form action="logout" method="POST" modelAttribute="user">
    <input type = "submit" value = "logout" />
</form:form>


</body>

</html>