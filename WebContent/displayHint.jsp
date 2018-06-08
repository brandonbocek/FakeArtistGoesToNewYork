<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Your Hint</title>
</head>
<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.no-icons.min.css" rel="stylesheet">
<link href="//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css" rel="stylesheet">
<link rel="stylesheet" href="artistStyle.css" />
<%@ page import="controller.*" %>
<%@ page import="model.Game" %>
<%@ page import="model.Player" %>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<body>

<%
Player player = (Player)session.getAttribute("player");
String hintToDisplay = (String)session.getAttribute("hintToDisplay");

%>

<div id="hint">
	<%=player.getWordToSee()%>
</div>

<div id="viewNumber" >
You have seen this <%=player.getNumOfViews() %> time(s) this round
</div>

<div id="sound">
<c:choose>
	<c:when test="${player.getNumOfViews() > 1}">
	
		<audio controls autoplay>
		  <source src="WhatAreYouDoing.wav" type="audio/ogg">
		</audio>
	</c:when>
</c:choose>
</div>

<div id="backButton">
	<form name="Reveal" action="noEmail.jsp" method="POST">
		<input type="submit" value="Back" class="btn btn-info"/>
	</form>
</div>


</body>
</html>