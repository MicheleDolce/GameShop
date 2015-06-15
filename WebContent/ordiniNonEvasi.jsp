<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ordini Non Evasi</title>
</head>
<body>
<f:view>
<h1>-----Lista Ordini-----</h1>
		<hr></hr>
		<h:form>
			<table border="1">
				<tr>
					<th>Data Apertura</th>
					<th>Data Chiusura</th>
					<th>			 </th>

				</tr>
				<c:forEach var="ordine" items="#{ordineController.listaOrdini}">
					<tr>
						<td>${ordine.dataApertura}</td>
						<td>${ordine.dataChiusura}</td>
						<td><h:commandLink value="Evadi Ordine"
								action="#{ordineController.evadiOrdine}">
								<f:param name="id" value="#{ordine.id}" />
							</h:commandLink></td>

					</tr>
				</c:forEach>
			</table>
			
			
		</h:form>
		<ul><li><h:form>
							
				<h:commandLink action="#{ordineController.tornaAlMenuAmministratore}" value="Torna al Menu amministratore"/>
				</h:form>
				</li>
				</ul>
</f:view>
</body>
</html>