<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar empresa</title>
</head>
<body>
	<form action="/gerenciador/editar-empresa" method="post">
		
		<input type="hidden" name="id" value="${empresa.id}">
		
		<label for="nome">Nome da empresa</label>
		<input type="text" id="nome" name="nome" placeholder="Insira o nome aqui" value="${empresa.nome}">
		
		<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" var="data"/>
		
		<label for="data">Data de abertura</label>
		<input type="text" id="data" name="data" placeholder="DD/MM/YYYY" value="${data}">
		
		<button type="submit">Confirmar edição</button>
	</form>
</body>
</html>