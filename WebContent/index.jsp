<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Fake Artist</title>
</head>
<body>

<div id="welcome">Welcome to Fake Artist</div>



<form action="StartGame" method="post">

Number of Players?

<select name="numOfPlayers">
	
	<option value="3" selected>3</option>
	<option value="4">4</option>
	<option value="5">5</option>
	<option value="6">6</option>
	<option value="7">7</option>
	<option value="8">8</option>
</select>
	<div id="start"><input type="submit" value="Submit"></div>
</form>

</body>
</html>