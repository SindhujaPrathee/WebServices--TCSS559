<%@page import="com.webservice.baggagehandling.util.BaggageHandlingClient"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Baggage Lookup</title>
</head>
<body>
Baggage Info:
<%
	out.print(BaggageHandlingClient.callGetCurrentStatus(request.getParameter("rfid")));
%>
</body>
</html>