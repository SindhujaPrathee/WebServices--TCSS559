<%@page import="com.webservice.baggagehandling.util.BaggageHandlingClient"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Weather Description</title>
</head>
<body>
Current Weather Description:
<%
	out.print(BaggageHandlingClient.getWeather());
%>

</body>
</html>