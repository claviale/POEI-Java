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
	<p>Détail du contact n° ${contact.id} </p>
	<fieldset>
		<p>Nom : ${contact.nom}   </p>
		<p>Prénom : ${contact.prenom} </p>
		<p>Date de naissance : ${contact.dateNaissance}</p>
		<p>Numéro de téléphone : ${contact.numTelephone}</p>
		<p>Site web : ${contact.urlReseau}</p>
		<p>Poste : ${contact.nomPoste}</p>
		<p>Spécialité : ${contact.specialite}</p>
	</fieldset>
	<br>
		<form action="ModificationContact" method="GET">
		<input type="hidden" name="id" value="${contact.id}">
		<input type="submit" value="Modifier le contact">
	</form>
	<br>
	<form action="SuppressionContact" method="post">
		<input type="hidden" name="id" value="${contact.id}">
		<input type="submit" value="Supprimer le contact">
	</form>
	<br>
	<div>
	<a href="Accueil">Retour à l'accueil</a>
	</div>
</body>
</html>