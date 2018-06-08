<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Enter Info</title>
</head>

<%@ page import="controller.*" %>
<%@ page import="model.Game" %>
<%@ page import="model.Player" %>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<% Game game = (Game)session.getAttribute("game"); 
%>

<body>
	<form action="BeginFirstRound" method="post">
		<c:forEach var="i" begin="1" end="${game.getNumOfPlayers()}">
		
			<input name="fname${i}" type="text" placeholder="First Name">
			<input name="email${i}" type="text" placeholder="something@email.com">
			<br>
			<br>
		
		</c:forEach>
		<input type="submit" value="Submit">
	</form>
</body>
</html>