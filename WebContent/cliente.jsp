<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:view>

		<h2>Dettagli</h2>
		<div>Nome: ${userController.cliente.nome}</div>
		<div>Cognome: ${userController.cliente.cognome}</div>
		<div>Indirizzo: ${userController.cliente.indirizzo}</div>
	</f:view>
</body>
</html>