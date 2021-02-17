<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Login</title>
	<link rel="stylesheet"  href="/css/style.css">
</head>
<body>
<div class="container">
	<h2>Login</h2>
	<p class="error">${SPRING_SECURITY_LAST_EXCEPTION.message}</p>
	<p class="success">${success}</p>
	<p class="error">${error}</p>
	<form action="login" method="post">
		<table>
			<tr>
				<td><label class="label">Username:</label></td>
				<td><input type="text" name="username" placeholder="Username" class="input"/></td>
			</tr>
			<tr>
				<td><label class="label">Password:</label></td>
				<td><input type="password" name="password" placeholder="Password" class="input"/></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" class="submit" value="Submit"/></td>
				<td><a href="create" class="back">Create an Account</a></td>
			</tr>
			
		</table>
	</form>
</div>


</body>
</html>