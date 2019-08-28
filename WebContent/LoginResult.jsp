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

<%
	if(BaggageHandlingClient.callLoginRequest(request.getParameter("userName"), request.getParameter("passWord"))) {
		session.setAttribute("sessionToken", true);
		%>
			<jsp:forward page="AdminPage.jsp"></jsp:forward>
		<%
		
	} else {
		out.print("Invalid username/password");
	}
%>


</body>
</html>