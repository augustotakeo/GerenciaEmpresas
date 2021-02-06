<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/cadastro" var="linkServletNewCompany"/>
   

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro</title>
</head>
<body>

	<form action = "${linkServletCompany }" method = "post">
		Empresa: <input type = "text" name = "nome">
		Data de Abertura: <input type = "text" name = "data"> <br />
		Proprietario: <input type = "text" name = "proprietario">
		CNPJ: <input type = "text" name = "CNPJ"> <br />
		Numero de colaboradores: <input type = "text" name = "numColaboradores"> <br />
	</form>

</body>
</html>