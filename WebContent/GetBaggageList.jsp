<%@page import="com.webservice.baggagehandling.util.BaggageHandlingClient"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get My Baggage List</title>
</head>
<body>
<h2>Give valid passenger ID for baggage list.. </h2><br>
<script>
</script>
	<form action="GetBaggageListResult.jsp">
		PassengerID: <input id="passengerId" name="passengerId" type="text" /><br> 
		<input type="submit" value="Submit"/>
	</form>

</body>
</html>