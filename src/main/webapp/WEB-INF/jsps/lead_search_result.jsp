<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="Menu.jsp" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ALL Details</title>
</head>
<body>
	<h2>List All Leads</h2>
	
	<table>
		<tr>
			<th>First Name</th>
			<th>Second Name</th>
			<th>Email</th>
			<th>Mobile Number</th>
			<th>Delete Record</th>
			<th>Update Record</th>
		</tr>
		  
		 <c:forEach var="lead" items="${leads}">
		
				 <tr>
					<td>${lead.firstname}</td>
					<td>${lead.secondname}</td>
					<td>${lead.email}</td>
					<td>${lead.mobilenumber}</td>
					<td><a href="delete?id=${lead.id}">Delete</a></td>
					<td><a href="update?id=${lead.id}">Update</a></td>
					
				 </tr> 
		
		 </c:forEach>
	</table>
</body>
</html>