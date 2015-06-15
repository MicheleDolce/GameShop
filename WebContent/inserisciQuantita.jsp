<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserisci quantità</title>
</head>
<body>
<c:if test="${clienteController.isLoggedIn}">
<f:view>
<h1>Inserisci Quantita' Prodotto</h1>
		<hr></hr>
		<h2>Prodotto Selezionato: ${prodottoController.prodotto.nome}</h2>
		<h:form>

			<div>
				Quantita':
				<h:inputText value="#{rigaOrdineController.quantita}"
					required="true" requiredMessage="la quantita e' obbligatoria"
					validatorMessage="la quantita del prodotto è troppo bassa"
					id="quantita" >
					<f:validateLongRange minimum="1"/>
					</h:inputText>
				<h:message for="quantita" />
			</div>


			<p>
				<h:commandButton value="Aggiungi All'Ordine"
					action="#{rigaOrdineController.creaRigaOrdine}">
				</h:commandButton>
			</p>


		</h:form>

</f:view>
</c:if>
</body>
</html>