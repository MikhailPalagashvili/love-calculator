<%--
  Created by IntelliJ IDEA.
  User: Owner
  Date: 1/6/2021
  Time: 10:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<title>Home Page</title>
	</head>
	<body>
		<h1 align="center">Love Calculator</h1>
		<hr/>
		
		<form:form action="process-homepage" method="get" modelAttribute="userInfo">
			<div align="center">
				<p>
					<label for="yn">Your Name:</label>
					<form:input id="yn" path="userName"/>
				</p>
				<p>
					<label for="cn">Crush Name:</label>
					<form:input id="cn" path="crushName"/>
				</p>
				<input type="submit" value="calculate">
			</div>
		</form:form>
	</body>
</html>
