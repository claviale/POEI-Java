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
	<p>Modification du contact n° ${contact.id} </p>
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

	<div>
	<a href="Accueil">Retour à l'accueil</a>
	</div>
</body>
</html>