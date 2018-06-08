<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Fake Artist</title>
</head>
<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.no-icons.min.css" rel="stylesheet">
<link href="//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css" rel="stylesheet">
<link rel="stylesheet" href="artistStyle.css" />
<%@ page import="controller.*" %>
<%@ page import="model.Game" %>
<%@ page import="model.Player" %>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<% Game game = (Game)session.getAttribute("game"); 
int roundNum = (int)session.getAttribute("roundNum"); 
%>

<body>

<!-- show the word for now -->
<div id="nameTitle">
Click on Your Name
<br>
<br>
<b>Do NOT click on anyone else's name!!!</b>
</div>
<br>
<div id="nameButtons">
	<c:forEach var="i" begin="0" end="${game.getNumOfPlayers()-1}">
		<form name="Reveal" action="RevealServlet" method="POST">
			
			
			<input type="submit" name="playerName" value="${game.getPlayer(i).getName()}" class="btn btn-primary"/>
				
			<br>
			<br>
		</form>
	</c:forEach>
	
	<form name="Reveal" action="ContinueServlet" method="POST">
	<input type="submit" value="New Round" class="btn btn-danger"/>
	</form>
	
	<div id="showRound">
		The Round Number is <b><%=roundNum %></b>
	</div>
</div>
</body>
</html>