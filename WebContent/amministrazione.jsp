
<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>area amministrazione</title>
</head>
<body>
	<h1>Area amministrazione</h1>
	<ul>
		<li><a href='<c:url value="/faces/aggiungiProdotto.jsp" />'>Aggiungi
				prodotto al catalogo</a></li>

		<li><a
			href='<c:url value="/faces/recuperaIndirizzoCliente.jsp" />'>Recupera
				indirizzo cliente</a></li>
	</ul>

</body>
</html>