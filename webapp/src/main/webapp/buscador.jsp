<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>

<html>

<head>

	<jsp:include page="head.jsp"></jsp:include>
	
</head>

<body>

	<div class="container">
	
	<jsp:include page="navBar.jsp"/>
		
			<div class="row">
			
				<div class="col-6">


					<form action="<%=request.getContextPath()%>/buscarProducto" method="post">
					
					  <div class="form-group">
					  
					    <label for="exampleInputEmail1">C&oacute;digo Producto</label>
					    <input name="codigo" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
					    <small id="emailHelp" class="form-text text-muted">C&oacute;digo del producto</small>
					  
					  </div>
					  
					  <button type="submit" class="btn btn-primary">Buscar</button>
					  
					</form>
				
				</div>
				
			</div>
			
		</div>

</body>

</html>