<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>

<html>

<head>

	<%@ include file="head.jsp" %>

</head>

<body>

	<div class="container">
	
	<jsp:include page="navBar.jsp"/>
	
		<%
				  
			String errorGeneral = (String)request.getAttribute("errorGeneral");
				    
			if(errorGeneral != null){
				  
		%>
		
		<div class="row">
		
			<div class="col-12">
				  
				<div class="alert alert-danger" role="alert">
  				  
					<%=errorGeneral %>
					
				</div>
				
			</div>
				  
		</div>
				  
				  
				  <%
				  
				    }
				  
				  %>
	
	
		<div class="row">
		
			<div class="col-6">

				<form action="<%=request.getContextPath()%>/nuevoProducto" method="post"> 
								
				  <div class="form-group">
				  
				    <label for="exampleInputEmail1">Descripci&oacute;n</label>
				    
				    <input name="descripcion" type="text" class="form-control" id="exampleInputEmail1">
				  
				  </div>
				  
				  <%
				  
				  	String errorDescripcion = (String)request.getAttribute("errorDescripcion");
				    
				    if(errorDescripcion != null){
				  
				  %>
				  
				  <div class="alert alert-danger" role="alert">
  				  
				  	<%=errorDescripcion %>
				  
				  </div>
				  
				  
				  <%
				  
				    }
				  
				  %>
				  
				  <div class="form-group">
				  
				    <label for="exampleInputEmail2">Precio</label>
				    
				    <input name="precio" type="number" class="form-control" id="exampleInputEmail2">
				  
				  </div>
				  
				  <%
				  
				  	String errorPrecio = (String)request.getAttribute("errorPrecio");
				    
				    if(errorPrecio != null){
				  
				  %>
				  
				  <div class="alert alert-danger" role="alert">
				  
				  	<%=errorPrecio %>
				  
				  </div>
				  
				  
				  <%
				  
				    }
				  
				  %>
				  
				  <div class="form-group">
				  
				    <label for="exampleInputEmail3">C&oacute;digo</label>
				    
				    <input name="codigo" type="text" class="form-control" id="exampleInputEmail3">
				  
				  </div>
				  
				  <%
				  
				  	String errorCodigo = (String)request.getAttribute("errorCodigo");
				    
				    if(errorCodigo != null){
				  
				  %>
				  
				  <div class="alert alert-danger" role="alert">
				  
				  	<%=errorCodigo %>
				  
				  </div>
				  
				  
				  <%
				  
				    }
				  
				  %>
				  
				  <button type="submit" class="btn btn-primary">Nuevo Producto</button>
				 				  
				</form>
				
			</div>
				
		</div>
				
	</div>

</body>

</html>