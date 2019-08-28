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
Deleted Baggage : 
<%
	out.print(BaggageHandlingClient.callDeleteBaggage(request.getParameter("rfid")));
%>

</body>
</html>