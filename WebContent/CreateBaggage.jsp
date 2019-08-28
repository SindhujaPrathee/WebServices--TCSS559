<%@page import="com.webservice.baggagehandling.util.BaggageHandlingClient"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create New Baggage</title>
</head>
<body>
<h2>Give required fields for creating new baggage..</h2><br>
<script>
</script>
	<form action="CreateBaggageResult.jsp" method="post">
		Baggage RFID: <input id="rfid" name="rfid" type="text" /><br> 
		PassengerID: <input id="passengerId" name="passengerId" type="text" /><br> 
		Source: <input id="sourcePlace" name="sourcePlace" type="text" /><br> 
		Destination: <input id="destinationplace" name="destinationPlace" type="text" /><br> 
		Transit: <input id="transit" name="transit" type="text" /><br> 
		Departure Time: <input id="departureTime" name="departureTime" type="text" /><br> 
		Arrival Time: <input id="arrivalTime" name="arrivalTime" type="text" /><br> 
		<input type="submit" value="Submit"/>
	</form>

</body>
</html>