<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Area utente</title>
</head>
<body>

	<f:view>

		<h> AREA UTENTE </h>
		<h1>-----Benvenuto-----</h1>
			<hr></hr>

			<h2>
				<b><u>Menu' Cliente</u></b>
			</h2>

			<h3>${userController.cliente.id}
				${userController.cliente.cognome}</h3>
			<div>
				<b>Email:</b> ${userController.cliente.email}
			</div>
			<p>
				<h:form>
					<h:commandLink action="#{ordineController.creaOrdine}"
						value="Crea Ordine" />
					<div>
						<h:commandLink action="#{ordineController.ordiniCliente}"
							value="I miei Ordini" />
					</div>
					<div>
						<h:commandLink action="#{productController.mostraElencoProdotti}"
							value="Catalogo Prodotti" />
					</div>
					<div>
						<h:commandLink action="#{userController.logOut}"
							value="LogOut" />
					</div>
				</h:form>
			</p>
				
	
	</f:view>
</body>
</html>