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
	<c:if test="${piece == 0 }">
		<p>Vous êtes notre grand gagnant !! Félicitations !</p>
	</c:if>
	
	<ul>
		<c:forEach var="perso" items="${personnages}">
			<li>${perso}</li>
		</c:forEach>
	</ul>
</body>
</html>