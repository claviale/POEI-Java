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
	<h2>Formulaire d'Identification</h2>
    <form action="connexion" method="POST">
        <div>
            <label for="username">Identifiant :</label>
            <input type="text" id="username" name="username" required>
        </div>
        <div>
            <label for="password">Mot de passe :</label>
            <input type="password" id="password" name="password" required>
        </div>
        <div>
        	<input type="checkbox" id="rememberMe" name="rememberMe" /> 
        	<label for="rememberMe">Se souvenir de moi</label>
        </div>
        <div>
            <button type="submit">Se connecter</button>
        </div>
    </form>
    <p>${errorMessage}</p>
</body>
</html>