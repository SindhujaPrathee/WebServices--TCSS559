<%@page import="com.webservice.baggagehandling.util.BaggageHandlingClient"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Baggage Created : 
<%
	out.print(BaggageHandlingClient.callCreateBaggage(
			request.getParameter("rfid"),
			request.getParameter("passengerId"), 
			request.getParameter("sourcePlace"),
			request.getParameter("destinationPlace"), 
			request.getParameter("transit"),
			request.getParameter("departureTime"), 
			request.getParameter("arrivalTime")));
%>

</body>
</html>