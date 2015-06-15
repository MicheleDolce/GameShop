<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nuovo ordine</title>
</head>
<body>
<c:if test="${userController.loggato}">
<f:view>

		
			<h1>-----Riepilogo Ordine-----</h1>
			
			<hr></hr>
			<div>
				<table border="1">
					<tr>
						<th>Nome Prodotto</th>
						<th>Quantita'</th>
						<th>Prezzo</th>
					</tr>
					<c:forEach var="rigaOrdine"
						items="#{userController.ordineTemp.righeOrdine}">
						<tr>
							<td>${rigaOrdine.prodotto.nome}</td>
							<td>${rigaOrdine.quantita}</td>
							<td>${rigaOrdine.prezzoUnitario}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
			<ul>
				<li><h:form>
						<h:commandLink action="#{productController.mostraElencoProdottiOrdine}"
							value="Inserisci Prodotto" />
					</h:form></li>

				<c:if test="${userController.ordineTemp.righeOrdine[0] != null}">
					<li><h:form>
							<h:commandLink action="#{ordineController.confermaOrdine}"
								value="Termina Ordine" />
						</h:form></li>
				</c:if>
			</ul>
			

</f:view>
</c:if>
</body>
</html>