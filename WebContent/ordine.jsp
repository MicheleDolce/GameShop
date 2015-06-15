<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:view>
	<h1>-----Dettagli Ordine-----</h1>
			<hr></hr>
			<div>
				<table border="1">
					<tr>
						<th>Nome Prodotto</th>
						<th>Quantita'</th>
						<th>Prezzo</th>
					</tr>
					<c:forEach var="rigaOrdine" items="#{ordineController.ordine.righeOrdine}">
						<tr>
							<td>${rigaOrdine.prodotto.nome}</td>
							<td>${rigaOrdine.quantita}</td>
							<td>${rigaOrdine.prezzoUnitario}</td>
						</tr>
					</c:forEach>
				</table>
			</div>

			<ul><li>
			<h:form>
				<div>
						<h:commandLink action="#{ordineController.ordiniCliente}"
							value="Torna alla lista ordini" />
					</div></h:form></li>
			</ul>



</f:view>
</body>
</html>