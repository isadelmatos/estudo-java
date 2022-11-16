<%@page import="java.util.List, br.com.gerenciador.servlet.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Empresas</title>
</head>
<body>
	
	<c:if test="${not empty empresa}">
		<p>Empresa ${empresa} cadastrada com sucesso</p>
	</c:if>
	
	<h1>Empresas cadastradas</h1>
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			<li>
				${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
				<a href="/gerenciador/mostra-empresa?id=${empresa.id}">Editar</a>
				<a href="/gerenciador/remover-empresa?id=${empresa.id}">Remover</a>
			</li>
		</c:forEach>
	</ul>
</body>
</html>