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
<h1>-----Lista Ordini-----</h1>
		<hr></hr>
		<h:form>
			<table border="1">
				<tr>
					<th>Data Creazione</th>
					<th>Data Chiusura</th>
					<th>Data Evasione</th>
					<th>ID ordine	  </th>
				</tr>
				<c:forEach var="ordine" items="#{ordineController.listaOrdini}">
					<tr>
						<td>${ordine.dataApertura}</td>
						<td>${ordine.dataChiusura}</td>
						<td>${ordine.dataEvasione}</td>
						<td><h:commandLink
								action="#{ordineController.trovaOrdine}"
								value="#{ordine.id}">
								<f:param name="id" value="#{ordine.id}" />
							</h:commandLink></td>
						
					</tr>
				</c:forEach>
			</table>
			<p><h:commandLink action="/faces/areaUtente.jsp"
							value="Torna all'area utente" />
					
				
			</p>
		</h:form>

</f:view>
</body>
</html>