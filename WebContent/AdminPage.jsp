<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Page</title>
</head>
<style>
body  {
    background-image: url("https://cdn-image.travelandleisure.com/sites/default/files/styles/1600x1000/public/1513880281/airport-luggage-fees-INTRNTL1217.jpg?itok=aeUknODu");
    height: 100%; 
    background-position: center top;
    background-repeat: no-repeat;
    background-size: 1600px 760px;
}
</style>
<body>
	<%
		if (session.getAttribute("sessionToken") == null || !(boolean) session.getAttribute("sessionToken")) {
	%>
	<jsp:forward page="AdminError.jsp"></jsp:forward>
	<%
		} else {
	%>
	
	Welcome Admin!<br><br><br>
	
	<a href="CreateBaggage.jsp" style="color:white">Create New Baggage</a><br>
	<a href="DeleteBaggage.jsp" style="color:white">Delete Baggage</a><br>
	<a href="UpdateStatus.jsp" style="color:white">Update Baggage Status</a><br>
	<a href="UpdateCarousel.jsp" style="color:white">Update Carousel Number</a><br>
	
	<%
		}
	%>

</body>
</html>