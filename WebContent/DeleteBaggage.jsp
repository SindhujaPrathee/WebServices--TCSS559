<%@page import="com.webservice.baggagehandling.util.BaggageHandlingClient"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Baggage</title>
</head>
<body>
<h2>Give valid RFID Baggage Tag ID for deleting</h2><br>
<script>
</script>
	<form action="DeleteBaggageResult.jsp">
		Baggage RFID: <input id="rfid" name="rfid" type="text" /><br> 
		<input type="submit" value="Submit"/>
	</form>

</body>
</html>