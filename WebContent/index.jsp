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
body{font-weight:bold;}body{background-image: url('img/crysis.jpg') !important;color:red;}
</style>
		<!-- Fixed navbar -->
		<nav class="navbar navbar-inverse navbar-fixed-top">
			<div class="container">
				<div class="navbar-header">
					<h:form>
						<h:outputLink styleClass="navbar-brand" 
							value='#{request.contextPath}/faces/index.jsp'>GameShop</h:outputLink>
					</h:form>
				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li><h:form>
								<h:commandLink styleClass="btn btn-link navbar-btn"
									action="#{productController.mostraElencoProdotti}"
									value="Catalogo" />
							</h:form></li>


					</ul>
					<span class="nav navbar-form navbar-right"> <h:form>

							<h:outputLink
								value='#{request.contextPath}/faces/loginCliente.jsp'
								styleClass="btn btn-success"
								rendered="#{!userController.cliente}">Login</h:outputLink>

							
							<h:outputLink
								value='#{request.contextPath}/faces/loginAmministratore.jsp'
								styleClass="btn btn-link">Amministrazione</h:outputLink>
						</h:form>
					</span>
				</div>
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
					

						<img src="img\GameShop.jpg" class="img-responsive" alt="gameshop"
							width="10000" height="3000">
					</div>

					<div class="container">
						<h2>GAME SHOP</h2>
						<div class="well">Game Shop e' una societa' di vendite online.</div>
					</div>




				</div>

			</div>

		</div>
		<div class="container">
  <h2>Gallery</h2>
           
  <div class="row">
    <div class="col-md-4">
      <a href="img/battlelfield.jpg" class="thumbnail">
        <p>Fps prodotto dalla Dice. Da non perdere!.</p>    
        <img src="img/battlelfield.jpg" alt="Pulpit Rock" style="width:150px;height:150px">
      </a>
    </div>
    <div class="col-md-4">
      <a href="img/fifa.jpg" class="thumbnail">
        <p>Vinvi il mondiale con la tua squadra del cuore.</p>
        <img src="img/fifa.jpg" alt="Moustiers Sainte Marie" style="width:150px;height:150px">
      </a>
    </div>
    <div class="col-md-4">
      <a href="img/MetalGearSolid.jpg" class="thumbnail">
        <p>Il nuovo capitolo della tanto amata saga dal genio di Hideo Kojima.</p>      
        <img src="img/MetalGearSolid.jpg" alt="Cinque Terre" style="width:150px;height:150px">
      </a>
    </div>
  </div>
</div>
		
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
</body>
</html>




