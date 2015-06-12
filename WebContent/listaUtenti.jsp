
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista utenti</title>
</head>
<body>
<f:view>
		<h1>Lista Utenti</h1>
		<h:form>
			<table>
				<tr>
					<th>Id</th><th>Email</th>
				</tr>
				<c:forEach var="utente" items="#{userController.listaUtenti}">
					<tr>
						<td><h:commandLink
								action="#{userController.trovaUtente}"
								value="#{utente.id}">
								<f:param name="id" value="#{utente.id}" />
							</h:commandLink></td>
						<td>${utente.email}</td>
					</tr>
				</c:forEach>

				<li><a href='<c:url value="/faces/index.jsp" />'>Torna a
						schermata di login</a></li>
			</table>
		</h:form>
		</f:view>
</body>
</html>