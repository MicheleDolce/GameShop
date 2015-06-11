<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<f:view>
		<h:form>
			<div>Nome: <h:inputText value="#{userController.nome}" required="true"
									requiredMessage="campo obbligatorio" id="nome" />
									<h:message for="nome" /></div>
			<div>Cognome: <h:inputText value="#{userController.cognome}" required="true"
									requiredMessage="nick obbligatorio" id="cognome" />
									<h:message for="campo obbligatorio" /></div>
			<div>Giorno di nascita: <h:inputText value="#{userController.giornoDiNascita}" required="true"
									requiredMessage="campo obbligatorio" id="giornoDiNascita" />
									<h:message for="cognome" /></div>
			<div>Mese di nascita: <h:inputText value="#{userController.meseDiNascita}" required="true"
									requiredMessage="campo obbligatorio" id="meseDiNascita" />
									<h:message for="cognome" /></div>
			<div>Anno di nascita: <h:inputText value="#{userController.meseDiNascita}" required="true"
									requiredMessage="campo obbligatorio" id="annoDiNascita" />
									<h:message for="annoDiNascita" /></div>
			<div>Indirizzo: <h:inputText value="#{userController.indirizzo}" required="true"
									requiredMessage="campo obbligatorio" id="indirizzo" />
									<h:message for="annoDiNascita" /></div>
			<div>Email: <h:inputText value="#{userController.email}" required="true"
									requiredMessage="campo obbligatorio" id="email" />
									<h:message for="annoDiNascita" /></div>
			<div>
				<h:commandButton value="Submit"  action="#{userController.registraUtente}"/>
			</div>
		</h:form>
	</f:view>
</body>
</html>