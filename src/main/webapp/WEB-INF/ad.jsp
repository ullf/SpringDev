<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<body>
<jsp:include page="menu.jsp" />
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
<table style="width:30%; text-align:center">
<tr>
    <th>Ad name</th>
    <th>Category</th>
    <th>Phone number</th>
    <th>Description</th>
</tr>
<c:forEach items="${ads}"  var = "ad">
    <tr>
        <td><c:out value = "${ad.adname}"/></td>
        <td><c:out value = "${ad.category}"/></td>
        <td><c:out value = "${ad.phone}"/></td>
        <td><c:out value = "${ad.description}"/></td>
    </tr>
</c:forEach>
</table>
</body>

</html>