<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<title>Home Page</title>
		<style type="text/css">
            .error {
                color: red;
                position: fixed;
                text-align: left;
                margin-left: 30px;
            }
		</style>
	</head>
	<body>
		<h1 align="center">Love Calculator</h1>
		<hr/>
		<form:form action="process-homepage" method="get" modelAttribute="userInfo">
			<div align="center">
				<p>
					<label for="yn">Your Name:</label>
					<form:input id="yn" path="userName"/>
					<form:errors id="yn" path="userName" cssClass="error"/>
				</p>
				<p>
					<label for="cn">Crush Name:</label>
					<form:input id="cn" path="crushName"/>
					<form:errors id="cn" path="crushName" cssClass="error"/>
				</p>
				<p>
					<form:checkbox id="check" path="termsAndConditions"/>
					<label>I am agreeing that this is for fun</label>
					<form:errors id="check" path="termsAndConditions" cssClass="error"/>
				</p>
				<input type="submit" value="calculate">
			</div>
		</form:form>
	</body>
</html>
