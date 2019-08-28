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
Baggage Status Updated : 
<%
	out.print(BaggageHandlingClient.callUpdateStatus(request.getParameter("rfid"), request.getParameter("status")));
%>
</body>
</html>