<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include  file="fragments/entete.jspf" %>
	<h1>Accueil</h1>
	<h4>Pour voir les détails d'un contact, saisissez son numéro identifiant :</h4>
	<form action="contacts" method="GET">
		<input type="number" name="id">
		<input type="submit" value="Rechercher">
	</form>
	<h4>Pour filtrer les résultats des contacts :</h4>
	<form action ="Accueil" method="get">
		<input type="text" name="filtre" >
		<input type="submit" value="Filtrer">
	</form>
	<h4>Liste des contacts déjà existants :</h4>

	<table border="1">
		<thead>
            <tr>
            	<th>Numéro</th>
                <th>Nom</th>
                <th>Prénom</th>
                <th>Poste</th>
                <th></th>
                <th></th>
            </tr>
		<tbody>
			<c:forEach var="contact" items="${contacts}">
            <tr>
            	<td>${contact.id}</td>
                <td>${contact.nom}</td>
                <td>${contact.prenom}</td>
                <td>${contact.nomPoste}</td>
                <td>
                    <form action="ModificationContact" method="GET">
						<input type="hidden" name="id" value="${contact.id}">
						<input type="submit" value="Modifier">
					</form>
				</td>
				<td>
					<form action="SuppressionContact" method="POST">
						<input type="hidden" name="id" value="${contact.id}">
						<input type="submit" value="Supprimer">
					</form>
                </td>
            </tr>
			</c:forEach>
		</tbody>
	</table>
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