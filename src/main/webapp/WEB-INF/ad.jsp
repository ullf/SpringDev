<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>

<body>

<h1>Add a new ad</h1>
<form:form action="adAdd" method="POST" modelAttribute="ad">
    Name: <form:input path = "adname" /><br />
    Category: <form:input path = "category" /><br />
    Phone: <form:input path = "phone" /><br />
    Description: <form:input path = "description" /><br />
    <input type = "submit" value = "add ad" />
</form:form>

<h1>Update information about ad</h1>
<form:form action="adUpdate" method="POST" modelAttribute="ad">
    Id of the ad: <form:input path = "id" /><br />
    Name: <form:input path = "adname" /><br />
    Category: <form:input path = "category" /><br />
    Phone: <form:input path = "phone" /><br />
    Description: <form:input path = "description" /><br />
    <input type = "submit" value = "update info" />
</form:form>

<h1>Delete ad</h1>
<form:form action="adDelete" method="POST" modelAttribute="ad">
    Id of the ad: <form:input path = "id" /><br />
    <input type = "submit" value = "delete ad" />
</form:form>

<h1>List of ads</h1>
<c:forEach items="${ads}"  var = "ad">
    Name: <c:out value = "${ad.adname}"/><p>
    Category: <c:out value = "${ad.category}"/><p>
    Phone: <c:out value = "${ad.phone}"/><p>
    Description: <c:out value = "${ad.description}"/><p>
</c:forEach>
</body>

</html>