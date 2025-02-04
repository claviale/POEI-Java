<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Une JSP qui doit être cachée si on utilise son URL directe</p>
	<p>Prenom : ${prenom}</p>
	<p>Age : ${age}</p>
	<p>Bonhomme : ${bonhomme.id} - ${bonhomme.nom} - ${bonhomme.age}</p>
</body>
</html>