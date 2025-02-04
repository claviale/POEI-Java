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
	<H1>Configuration de l'application</H1>
	<p>Saisissez une valeur par défaut pour les champs suivants :</p>
	<form action="configuration" method="POST">
		<label for="poste">Poste :</label>
		<input type="text" name="poste" id="poste" value="${param.poste == null ? cookie.poste.value : param.poste}">
		<input type="submit" value="Ajouter la valeur par défaut">
	</form>
	<p> ${message }</p>
	<p>Vous avez accédé à cette page ${visites} fois.</p>
	<div>
		<a href="Accueil">Retour à l'accueil</a>
	</div>
</body>
</html>