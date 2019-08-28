<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Baggage Handling System</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
<h2>Give valid RFID Baggage Tag ID for status information..</h2><br>

	<form action="baggage_lookup.jsp">
		Baggage RFID: <input name="rfid" type="text" /></br> 
		<input type="submit" value="Submit">
	</form>


</body>
</html>