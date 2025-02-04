<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include  file="fragments/entete.jspf" %>
	<h1>Accueil</h1>
	<h4>Pour rechercher un contact, saisissez son numéro identifiant :</h4>
	<form action="contacts" method="GET">
		<input type="number" name="id">
		<input type="submit" value="Rechercher">
	</form>
	<br>
	<form action="AjoutContact" method="GET">
		<input type="submit" value="Ajout d'un contact">
	</form>
	<br>
	<form action="configuration" method="GET">
		<input type="submit" value="Configuration">
	</form>


</body>
</html>