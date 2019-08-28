<%@page import="com.webservice.baggagehandling.model.BaggageList"%>
<%@page import="com.webservice.baggagehandling.util.BaggageHandlingClient"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Baggage Result</title>
</head>
<body>
<%
	BaggageList baggage = BaggageHandlingClient.callGetBaggageList(request.getParameter("passengerId"));
	out.println("<b><u>Passenger ID:</u></b> " + baggage.getPassengerId());
	out.println("<br><br>");
	out.println("<b><u>Baggages:</u></b><br>");
	for(String rfid : baggage.getRfidList()) {
		out.println(rfid + "<br>");
	}
%>
</body>
</html>