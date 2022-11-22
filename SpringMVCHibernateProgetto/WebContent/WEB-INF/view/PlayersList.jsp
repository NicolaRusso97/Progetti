<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista Giocatori</title>
</head>
<body>
	<div id="wrapper">
		<div = id="Header">
			<h1>LISTA GIOCATORI SOFIFA</h1>
		</div>
	</div>
	<div id="container">
		<div id="content">
			<table>
				<tr>
					<th>NOME</th>
					<th>RUOLO</th>
					<th>OVERALL</th>
					<th>NAZIONE</th>
					<th>LINK</th>
				</tr>
				<c:forEach var="tempPlayers" items="${players}">
					<tr>
						<td>${tempPlayers.nome}</td>
						<td>${tempPlayers.ruolo}</td>
						<td>${tempPlayers.overall}</td>
						<td>${tempPlayers.nazione}</td>
						<td>${tempPlayers.link}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>

</body>
</html>