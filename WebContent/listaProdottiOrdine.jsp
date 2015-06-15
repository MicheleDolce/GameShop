
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>lista prodotti ordine</title>
</head>
<body>
		
<f:view>					
	<h1>Lista Prodotti</h1>
		<h:form>			  
			<table border="1">
				<tr>
					<th>Nome</th>	<th>Prezzo</th>		<th>			</th>
				</tr>
				<c:forEach var="prodotto" items="#{productController.listaProdotti}">
					<tr>
						<td><h:commandLink
								action="#{productController.trovaProdotto}"
								value="#{prodotto.nome}">
								<f:param name="codice" value="#{prodotto.codice}" />
							</h:commandLink></td>
						<td>${prodotto.prezzo}</td>
						<td><h:commandButton value="Aggiungi all'ordine" action="#{productController.prodottoPerOrdine}">
									<f:param name="codice" value="#{prodotto.codice}"/>
								</h:commandButton></td>
					</tr>
				</c:forEach>

				

			<li> 	<a href="<c:url value="faces/areaUtente.jsp" />">Torna al menu' Cliente</a> </li>
				
			</table>
		</h:form>
				
				

			
</f:view>

</body>
</html>