<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; ccharset=US-ASCII">
<title>Aggiungi Prodotto</title>
</head>
<body>
	<h1>Aggiungi Prodotto</h1>
	<f:view>
		<h:form>
			<div>
				Name:
				<h:inputText value="#{productController.nome}" required="true"
					requiredMessage="Nome obbligatorio" id="nome" />
				<h:message for="nome" />
			</div>
			<div>
				Codice:
				<h:inputText value="#{productController.codice}" required="true"
					requiredMessage="Codice obbligatorio" id="codice" />
				<h:message for="codice" />
			</div>

			<div>
				Descrizione:
				<h:inputTextarea value="#{productController.descrizione}"
					required="false" cols="20" rows="5" />

			</div>
			<div>
				Prezzo:
				<h:inputText value="#{productController.prezzo}" required="true"
					requiredMessage="Prezzo obbligatorio"
					converterMessage="Prezzo deve essere un numero" id="prezzo" />
				<h:message for="prezzo" />
			</div>
			<div>
				Quantita:
				<h:inputText value="#{productController.quantitaMagazino}"
					required="true" requiredMessage="Quantita obbligatoria"
					converterMessage="Quantita deve essere un numero"
					id="quantitaMagazino" />
				<h:message for="quantitaMagazino" />
			</div>
			<div>
				<h:commandButton value="Submit"
					action="#{productController.creaProdotto}" />
			</div>
			<h:commandLink action="#{productController.listaProdotti}"
				value="lista prodotti" />
		</h:form>
	</f:view>

</body>
</html>










