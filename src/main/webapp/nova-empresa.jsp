<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Empresa cadastrada</title>
</head>
<body>
	<c:if test="${not empty empresa}">
		<p>Empresa ${empresa} cadastrada com sucesso</p>
	</c:if>
	
	<c:if test="${empty empresa}">
		<p>Falha ao cadastrar</p>
	</c:if>
</body>
</html>