<%@page import="com.webservice.baggagehandling.util.BaggageHandlingClient"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>
</head>
<body>
<h2>Give valid username and password to access services..</h2><br>
<script>
</script>
	<form action="LoginResult.jsp" method="post">
		UserName: <input id="userName" name="userName" type="text" /><br> 
		Password: <input id="passWord" name="passWord" type="password" /><br> 
		<input type="submit" value="Submit"/>
	</form>

</body>
</html>