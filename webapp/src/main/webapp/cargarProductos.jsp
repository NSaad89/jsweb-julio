<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>

<html>

<head>

	<jsp:include page="head.jsp"></jsp:include>
	
</head>

<body>

	<jsp:include page="navBar.jsp"/>
	
	<%
	
		String mensajeError = (String) request.getAttribute("errorParser");
	
		if(mensajeError != null){
	
	%>
	
	<div class="alert alert-danger" role="alert">
	
	<%=mensajeError %>
	
	</div>

	<%
	
	}
	
	%>


	<div class="container">
		
			<div class="row">
			
				<div class="col-6">

					<form action="<%=request.getContextPath()%>/parseArchivoServlet" method="post"
					enctype="application/x-www-form-urlencoded">
					
  						<div class="form-group">
  						
    						<label for="exampleFormControlFile1">Seleccione Archivo de Productos</label>
    						
    						<input name="file" type="file" class="form-control-file" id="exampleFormControlFile1">
  						
  						</div>
  						
  						<button type="submit" class="btn btn-primary">Cargar Archivo</button>
					
					</form>					
				
				</div>
				
			</div>
			
		</div>

</body>

</html>