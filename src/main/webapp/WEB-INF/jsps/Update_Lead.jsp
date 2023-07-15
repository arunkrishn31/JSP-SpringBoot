<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file="Menu.jsp" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UPDATE LEAD</title>
</head>
<body>
	<H2>UPDATE NEW LEAD</H2>

	<form action="updateLead" method="post">
		<pre>
						<input type="hidden" name="id" value="${lead.id}"/> //b'coz we need a id to update 
			First Name  <input type="text" name="firstname" value="${lead.firstname}"/>
			Second Name <input type="text" name="secondname" value="${lead.secondname}"/>
			Email       <input type="email" name="email" value="${lead.email}"/>
			MobileNumber<input type="number" name="mobilenumber" value="${lead.mobilenumber}"/>
			</br>
					<input type="submit" value="Update"/>
		</pre>
	</form>
	${msg}
</body>
</html>