<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	    <%@ include file="Menu.jsp" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CREATE LEAD</title>
</head>
<body>
	<H2>CREATE NEW LEAD</H2>

	<form action="savelead" method="post">
		<pre>
			First Name  <input type="text" name="firstname"/>
			Second Name <input type="text" name="secondname"/>
			Email       <input type="email" name="email"/>
			MobileNumber<input type="number" name="mobilenumber"/>
			</br>
					<input type="submit" value="save"/>
		</pre>
	</form>
	${msg}
</body>
</html>