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


<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>


<body>
<c:if test="${userController.loggato}">
	<f:view>


		<style type="text/css">
body {
	font-weight: bold;
}

body {
	background-image: url('img/crysis.jpg') !important;
	color: red;
}
</style>
		<!-- Fixed navbar -->
		<nav class="navbar navbar-inverse navbar-fixed-top">
			<span class="nav navbar-form navbar-right"> <h:form>

					<div>
						<h:commandLink action="#{userController.logOut}" value="LogOut" />
					</div>
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

		
			<h1>Inserisci Quantita' Prodotto</h1>
			<hr></hr>
			<h2>Prodotto Selezionato: ${prodottoController.prodotto.nome}</h2>
			<h:form>

				<div>
					Quantita':
					<h:inputText value="#{rigaOrdineController.quantita}"
						required="true" requiredMessage="la quantita e' obbligatoria"
						validatorMessage="la quantita del prodotto e' troppo bassa"
						id="quantita">
						<f:validateLongRange minimum="1" />
					</h:inputText>
					<h:message for="quantita" />
				</div>


				<p>
					<h:commandButton value="Aggiungi All'Ordine"
						action="#{rigaOrdineController.creaRigaOrdine}">
					</h:commandButton>
				</p>


			</h:form>
	
		<!--/row-->

		<hr>
		<footer>
			<p>&copy; JuggerDonuts Company 2015</p>
		</footer>
		<!--/.container-->
		<!-- Bootstrap core JavaScript
    ================================================== -->
		<!-- Placed at the end of the document so the pages load faster -->
		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
		<script src="js/ie10-viewport-bug-workaround.js"></script>
		<script src="js/offcanvas.js"></script>


	</f:view>
		</c:if>
</body>
</html>