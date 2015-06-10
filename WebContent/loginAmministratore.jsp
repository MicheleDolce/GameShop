<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Login amministratore</title>
</head>
<body>
<f:view>
<h:form>
    <div>User: <h:inputText value="#{administratorController.nome}"  
                     required="true" 
                     requiredMessage="nick obbligatorio" 
                     id="nome" > <f:validator validatorId="validatoreUserLoginAmministratore" /> </h:inputText>  <h:message for="nome" />
                    
	</div>
    <div>Password: <h:inputText value="#{administratorController.password}" 
                     required="true" 
                     requiredMessage="password obbligatoria" 
                     id="password"/>   <h:message for="password" />
	</div>
    
	<div>
		<h:commandButton value="Submit"  action="/faces/aggiungiProdotto.jsp"/>
	</div>
	<li><a
		href= "index.html">Torna alla home</a></li>
</h:form>
</f:view>
	
	
</body>
</html>