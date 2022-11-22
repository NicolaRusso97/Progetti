<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modifica Giocatori</title>
</head>
<body>
	<div id="wrapper">
		<div id="Header">
			<h1>MODIFICA GIOCATORE</h1>
		</div>
	</div>
	<div id="container">
		<div id="content">
			<form:form action="savePlayers" modelAttribute="player" method="POST">
				<form:hidden path="id" />
				<table>
					<tbody>
						<tr>
							<td><label>NOME:</label>
							<td><form:input path="nome" /></td>
						</tr>
						<tr>
							<td><label>RUOLO:</label>
							<td><form:input path="ruolo" /></td>
						</tr>
						<tr>
							<td><label>OVERALL:</label>
							<td><form:input path="overall" /></td>
						</tr>
						<tr>
							<td><label>LINK:</label>
							<td><form:input path="link" /></td>
						</tr>
						<tr>
							<td><label>NAZIONE:</label>
							<td><form:input path="nazione" /></td>
						</tr>
						<tr>
							<td><label></label></td>
							<td><input type="submit" value="Save" class="save" /></td>
						</tr>
					</tbody>
				</table>
			</form:form>
		</div>
	</div>

</body>
</html>