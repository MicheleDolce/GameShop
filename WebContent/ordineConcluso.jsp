<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ordine aggiunto</title>
</head>
<body>
<f:view>
<h1>Ordine aggiunto con successo</h1>
	<hr></hr>

<h:form>
	<div>
						<h:commandLink action="/faces/areaUtente.jsp"
							value="Area utente" />
					</div></h:form>
</f:view>
</body>
</html>