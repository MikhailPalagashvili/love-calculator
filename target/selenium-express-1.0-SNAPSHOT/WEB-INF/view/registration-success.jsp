<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<title>Registration Success</title>
	</head>
	<body>
		<div align="center">
			<h1>Registration Success</h1>
			<h2>The details you entered are:</h2><br/>
			Name: ${userReg.name}<br/>
			User Name: ${userReg.userName}<br/>
			Password: ${userReg.password}<br/>
			Country: ${userReg.countryName}<br/>
			Hobbies:
			<c:forEach var="temp" items="${userReg.hobbies}"> ${temp} </c:forEach>
			<br/>
			Gender: ${userReg.gender}<br/>
			Email: ${userReg.communicationDTO.email}<br/>
			Phone Number: ${userReg.communicationDTO.phoneNumber}
	</body>
	</div>
</html>
