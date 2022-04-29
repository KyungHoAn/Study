<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<!-- jQuery, Bootstrap CDN -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" >
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>
	
	<style>
	body{
		padding-top :70px;
	}
	</style>
</head>
<body>
<!-- <nav class="navbar navbar-default"> -->
  <!-- <div class="container-fluid"> -->
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">

      <a class="navbar-brand" href="#">Bootstrap01</a>
      
	<div class="navbar-header">
      <button class="navbar-toggle collapsed" data-toggle="collapse" data-target="#target">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
    </div>
    
      <div class="collapse navbar-collapse" id="target">
      <ul class="nav navbar-nav" >
      
	<li class="dropdown">
	  
	  <a href="#" class="dropdown-toggle" data-toggle="dropdown">
	  	<span>HTML5</span>
	  	<span class="caret"></span>
	  </a>
	  <ul class="dropdown-menu">
	    <li><a href="#">Action</a></li>
	    <li><a href="#">Another action</a></li>
	    <li><a href="#">Something else here</a></li>
	    <li role="separator" class="divider"></li>
	    <li><a href="#">Separated link</a></li>
	  </ul>
	</li>
      
      	<li><a href="#">HTML5</a></li>
      	<li><a href="#">JavaScript</a></li>
      	<li><a href="#">CSS</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
      	<li><a href="#">J2SE</a></li>
      	<li><a href="#">API</a></li>
      </ul>
      </div>
      
  	</div>
  </div>

<div class="container">
	<div class="jumbotron">
	  <h1>Hello, world!</h1>
	  <p>jumbotron 을 이용하여 구현</p>
	  <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a></p>
	</div>
</div>

<div class="container">
  <h1>Containers container</h1>
  <p>Bootstrap requires a containing element to wrap site contents and house our grid system. 
  You may choose one of two containers to use in your projects. 
  Note that, due to padding and more, neither container is nestable.
  </p>
</div>

<div class="container">
  <h1>happy study</h1>
  <p>Bootstrap requires a containing element to wrap site contents and house our grid system. 
  You may choose one of two containers to use in your projects. 
  Note that, due to padding and more, neither container is nestable.
  </p>
</div>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">
        <img alt="Brand" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQxmp7sE1ggI4_L7NGZWcQT9EyKaqKLeQ5RBg&usqp=CAU" width="15%">
      </a>
    </div>
  </div>
</nav>

  
</body>
</html>