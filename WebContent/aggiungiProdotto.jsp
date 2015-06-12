<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aggiungi Prodotto</title>
</head>
<body>
	<h1>Aggiungi Prodotto</h1>
	<f:view>
		<h:form>
			<div>
				Nome:
				<h:inputText value="#{productController.nome}" required="true"
					requiredMessage="Nome obbligatorio" id="nome" />
				<h:message for="nome" />
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
				<h:inputText value="#{productController.quantitaMagazzino}"
					required="true" requiredMessage="Quantita obbligatoria"
					converterMessage="Quantita deve essere un numero"
					id="quantitaMagazzino" />
				<h:message for="quantitaMagazzino" />
			</div>
			<div>
				<h:commandButton value="Submit"
					action="#{productController.creaProdotto}" />
			</div>
			
		</h:form>
		<h:form>
					<h:commandLink
						action="#{productController.mostraElencoProdottiAmministratore}"
						value="Vedi elenco prodotti" />
				</h:form>
	</f:view>

</body>
</html>










