<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Bienvenue sur une application hyper sécurisée!</p>
	<a href="prive">Consulter les informations  privées.</a>
	
	<form action="index" method="POST">
		<input type="text" name="username">
		<input  type="submit" value="Se connecter">
	</form>
	<p>${message }</p>
</body>
</html>