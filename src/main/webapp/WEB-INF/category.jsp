<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>

<form:form action="categoryAdd" method="POST" modelAttribute="category">
Category name: <form:input path = "catname" /><br>
    <input type="submit" value="add category" /><br>
</form:form>

<table style="width:30%; text-align:center">
<tr>
    <th>Id</th>
    <th>Name</th>
</tr>
<c:forEach items="${categories}" var="cat">
<tr>
    <td><c:out value="${cat.id}" /></td>
    <td><c:out value="${cat.catname}" /></td>
</tr>
</c:forEach>
</table>
</html>