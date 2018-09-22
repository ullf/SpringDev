<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<body>
<jsp:include page="../menu.jsp" />
<h1>Add a new company</h1>
<form:form action = "../companyadd" method = "POST" modelAttribute="company">
Name: <form:input path = "compname" /><br />
Address: <form:input path = "address" /><br />
Description: <form:input path = "description" /><br />
<input type = "submit" value = "Add company" />
</form:form>

<h1>Update information about company</h1>
<form:form action = "../companyupdate" method = "POST" modelAttribute="company">
Id of a company: <form:input path = "id" /><br />
Name: <form:input path = "compname" /><br />
Address: <form:input path = "address" /><br />
Description: <form:input path = "description" /><br />
<input type = "submit" value = "update info" />
</form:form>

<h1>Delete company</h1>
<form:form action = "../companydelete" method = "POST" modelAttribute="company">
Id of a company: <form:input path = "id" /><br />
<input type = "submit" value = "delete company" />
</form:form>

<h1>List of companies</h1>
<table style="width:30%; text-align:center">
<tr>
    <th>Company name</th>
    <th>Address</th>
    <th>Description</th>
</tr>
<c:forEach items="${companies}"  var = "compies">
<tr>
    <td><c:out value = "${compies.compname}"/></td>
    <td><c:out value = "${compies.address}"/></td>
    <td><c:out value = "${compies.description}"/></td>
</tr>
</c:forEach>
</table>
</body>
</html>
