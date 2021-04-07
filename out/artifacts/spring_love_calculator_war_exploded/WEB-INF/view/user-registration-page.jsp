<%--
  Created by IntelliJ IDEA.
  User: Owner
  Date: 1/6/2021
  Time: 9:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<title>Register</title>
	</head>
	<body>
		<h1 align="center">Please register here</h1>
		<div align="center">
			<form:form action="registeration-success" method="get" modelAttribute="userReg">
				<label>User:</label>
				<form:input path="name"/>
				<br/>
				<label>User Name:</label>
				<form:input path="userName"/>
				<br/>
				<label>Password:</label>
				<form:input path="password"/>
				<br/>
				<label>Country:</label>
				<form:select path="countryName">
					<form:option value="usa" label="Usa"></form:option>
					<form:option value="russ" label="Russia"></form:option>
					<form:option value="asia" label="China"></form:option>
					<form:option value="canada" label="Canada"></form:option>
				</form:select>
				<br/>
				<label>Hobbies:</label>
				Programming: <form:checkbox path="hobbies" value="programming"/>
				Sports: <form:checkbox path="hobbies" value="sports"/>
				Reading: <form:checkbox path="hobbies" value="reading"/>
				Travel: <form:checkbox path="hobbies" value="travel"/>
				<br/>
				<label>Gender:</label>
				Male: <form:radiobutton path="gender" value="male"/>
				Female: <form:radiobutton path="gender" value="female"/>
				<br/>
				<input type="submit" value="register">
			</form:form>
		</div>
	</body>
</html>
