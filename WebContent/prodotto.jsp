<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Prodotto</title>
</head>
<body>
	<f:view>
		<h1>${productController.prodotto.nome}</h1>
		<h2>Dettagli</h2>
		<div>Codice: ${productController.prodotto.codice}</div>
		<div>Prezzo: ${productController.prodotto.prezzo}</div>
		<div>Descrizione: ${productController.prodotto.descrizione}</div>
		<li><h:form>
					<h:commandLink
						action="#{productController.mostraElencoProdotti}"
						value="Torna a elenco prodotti" />
				</h:form></li>
	</f:view>
</body>
</html>