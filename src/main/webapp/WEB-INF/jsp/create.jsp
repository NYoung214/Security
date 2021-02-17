<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Create An Account</title>
	<link rel="stylesheet"  href="/css/style.css">
</head>
<body>
	<div class="container">
		<p class="error center boxed">FOR TESTING PURPOSES ONLY</p>
		<form:form action="create" method="post" modelAttribute="user" cssClass="form">
			<h2>Create An Account</h2>
			
			<p class="error center">${error}</p>
			<table>
				<tr>
					<td><form:label path="username" cssClass="label">Username:</form:label></td>
					<td><form:input name="username" path="username" cssClass="input" placeholder="Johhny"/></td>
					<td><form:errors path="username" cssClass="error"/></td>
				</tr>
				<tr>
					<td><form:label path="password" cssClass="label">Password:</form:label></td>
					<td><form:input path="password" type="password" cssClass="input" placeholder="Password"/></td>
					<td><form:errors path="password" cssClass="error"/></td>
				</tr>
				<tr>
					<td><form:label path="email" cssClass="label">Email:</form:label></td>
					<td><form:input path="email" cssClass="input" placeholder="Johhny@email.com"/></td>
					<td><form:errors path="email" cssClass="error"/></td>
				</tr>
				<tr>
				      <td><form:label path="role" cssClass="label">Role:</form:label></td>
				      <td>
						User <form:radiobutton path="role" value="USER"/>  
						Admin <form:radiobutton path="role" value="ADMIN"/>  
			          </td>
				  </tr>
				  <tr>
				  		<td><input type="submit" name="submit" class="submit" value="Submit"/></td>
						<td><a href="login" class="back">Back To Login</a></td>
				  </tr>
				
			</table>
		</form:form>
		
	</div>
	<!-- 	TODO: 
			username
			password
			email
			role (either ADMIN or USER)
	  -->

</body>
</html>