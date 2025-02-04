<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${action}" method="POST">
		<input type="hidden" value="${contact.id}" name="id">
		<div>
			<label for="nom">Nom :</label>
			<input type="text" name="nom" id="nom" value="${contact.nom}">
		</div>
		<div>
			<label for="prenom">Prénom :</label>
			<input type="text" name="prenom" id="prenom" value="${contact.prenom}">
		</div>
		<div>
			<label for="dateNaissance">Date de naissance :</label>
			<input type="date" name="dateNaissance" id="dateNaissance" value="${contact.dateNaissance}">
		</div>
		<div>
			<label for="telephone">Numéro de téléphone :</label>
			<input type="text" name="telephone" id="telephone"  value="${contact.numTelephone}">
		</div>
		<div>
			<label for="urlReseau">Site Web ou réseaux :</label>
			<input type="text" name="urlReseau" id="urlReseau" value="${contact.urlReseau}">
		</div>
		<div>
			<label for="poste">Poste :</label>
			<input type="text" name="poste" id="poste" value="${(action == 'AjoutContact') ? cookie.poste.value : contact.nomPoste}">
		</div>
		<div>
			<label for="specialite">Spécialité :</label>
			<input type="text" name="specialite" id="specialite" value="${contact.specialite}">
		</div>		
		<input type="submit" value="Enregistrer">
	</form>
</body>
</html>