<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>GameShop</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/offcanvas.css" rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="js/ie-emulation-modes-warning.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
	<f:view>
		<style type="text/css">
body{font-weight:bold;}body{background-image: url('img/crysis.jpg') !important;color:red;}</style>
		<!-- Fixed navbar -->
		<nav class="navbar navbar-inverse navbar-fixed-top">
			<span class="nav navbar-form navbar-right"> <h:form>

					<h:outputLink value='#{request.contextPath}/faces/index.jsp'
						styleClass="btn btn-success">Logout</h:outputLink>
				</h:form></span>

			<div class="container">
				<div class="navbar-header"></div>
				<!--/.nav-collapse -->
			</div>
		</nav>

		<div class="container">

			<div class="row row-offcanvas row-offcanvas-right">

				<div class="col-xs-12 col-sm-9">
					<p class="pull-right visible-xs">
						<button type="button" class="btn btn-primary btn-xs"
							data-toggle="offcanvas">Toggle nav</button>
					</p>
					${message}
					<div class="jumbotron">

						<img src="img\GameShop.jpg" class="img-responsive" alt="veeer2"
							width="1000" height="300">
					</div>




				</div>

			</div>

		</div>
	<h1>Aggiungi Prodotto</h1>
	
		<h:form>
			<div>
				Nome:
				<h:inputText value="#{productController.nome}" required="true"
					requiredMessage="Nome obbligatorio" id="nome" />
				<h:message for="nome" />
			</div>
			<div>
				Descrizione:
				<h:inputTextarea value="#{productController.descrizione}"
					required="false" cols="20" rows="5" />

			</div>
			<div>
				Prezzo:
				<h:inputText value="#{productController.prezzo}" required="true"
					requiredMessage="Prezzo obbligatorio"
					converterMessage="Prezzo deve essere un numero" id="prezzo" />
				<h:message for="prezzo" />
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
					action="#{productController.creaProdotto}" />
			</div>
			
		</h:form>
		<h:form>
						 	<h:commandLink styleClass="btn btn-success"
									action="faces/amministrazione.jsp"
									value="Indietro" />
							</h:form>
	</f:view>

</body>
</html>










