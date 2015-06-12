<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<f:view>
		<h:form>
			<div>
				ID:
				<h:inputText value="#{productController.id}" required="true"
					requiredMessage="Codice obbligatorio" id="codice" />
				<h:message for="codice" />
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
					action="#{productController.modificaQuantita}" />
			</div>
		</h:form>
	</f:view>
</body>
</html>