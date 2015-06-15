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
<h1>Ordine non Evaso!</h1>
	<h2>La quantita' in magazzino e' insufficiente per procedere
		all'evasione dell'ordine</h2>
	<hr></hr>

	<ul><li><h:form>
							
				<h:commandLink action="faces/amministrazione.jsp" value="Torna al Menu amministratore"/>
				</h:form>
				</li>
				</ul>
</f:view>
</body>
</html>