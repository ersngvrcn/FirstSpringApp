<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/css"></c:import>
</head>
<body>
	<div class="container">
	
		<div class="row">
			<div class="col-sm-4"></div>
			<div class="col-sm-4">
			<h1>Admin Login</h1>
				<form action="/login" method="post">
				  <div class="form-group">
				    <label for="exampleInputEmail1">Email address</label>
				    <input name = "umail" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
				  </div>
				  <div class="form-group">
				    <label for="exampleInputPassword1">Password</label>
				    <input name= "upass" type="password" class="form-control" id="exampleInputPassword1">
				  </div>
				  <div class="form-group form-check">
				    <input name = "remember" type="checkbox" class="form-check-input" id="exampleCheck1">
				    <label class="form-check-label" for="exampleCheck1">Check me out</label>
				  </div>
				  <button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>
			<div class="col-sm-4"></div>
		</div>

	</div>
<c:import url="/js"></c:import>
</body>
</html>