<%@page import="java.util.List"%>
<%@page import="ar.com.educacionit.domain.Producto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>

<html>

<head>

<jsp:include page="head.jsp"/>

</head>

<body>

<jsp:include page="navBar.jsp"/>

	<div class="container">
	
	<%-- OK --%>
	
		<div class="row">
		
			<div class="arlet alert-success">Productos Dados de Alta</div>
			
				<table class="table">
			
				  <thead>
				  
				    <tr>
				      <th scope="col">Id</th>
				      <th scope="col">Descripci&oacute;n</th>
				      <th scope="col">Precio</th>
				      <th scope="col">C&oacute;digo</th>
				      <th scope="col"></th>
				    </tr>
				    
				  </thead>
				  				  
				  <%
				  
				  List<Producto> productos = (List<Producto>)request.getAttribute("listadoOk");
				  
				  %>
				  
				  <%
				  
				  	for (Producto producto : productos) {
					
				  %>
				  
				 	<tbody>
				  
					    <tr>
					      <th scope="row"><%=producto.getId()%></th>
					      <th scope="row"><%=producto.getDescripcion()%></th>
					      <th scope="row"><%=producto.getPrecio()%></th>
					      <th scope="row"><%=producto.getCodigo()%></th>
					      
					      <th>
					      	<button type="button" class="btn btn-outline-primary">Editar</button>
					      	<button type="button" class="btn btn-outline-secondary">Eliminar</button>			      
					      </th>
					      
					    </tr>
				    
				  	</tbody>
				  
				  <%
				  
				  	}
				  
				  %>
				  
				</table>
		
		</div>
		
		<%-- FAIL --%>
	
		<div class="row">
		
			<div class="alert alert-danger">Productos con Errores</div>
			
				<table class="table">
			
				  <thead>
				  
				    <tr>
				      <th scope="col">Id</th>
				      <th scope="col">Descripci&oacute;n</th>
				      <th scope="col">Precio</th>
				      <th scope="col">C&oacute;digo</th>
				      <th scope="col"></th>
				    </tr>
				    
				  </thead>
				  				  
				  <%
				  
				  List<Producto> productosFail = (List<Producto>)session.getAttribute("listadoFail");
				  
				  %>
				  
				  <%
				  
				  	for (Producto producto : productosFail) {
					
				  %>
				  
				 	<tbody>
				  
					    <tr>
					      <th scope="row"><%=producto.getId()%></th>
					      <th scope="row"><%=producto.getDescripcion()%></th>
					      <th scope="row"><%=producto.getPrecio()%></th>
					      <th scope="row"><%=producto.getCodigo()%></th>
					      
					      <th>
					      	<button type="button" class="btn btn-outline-primary">Editar</button>
					      	<button type="button" class="btn btn-outline-secondary">Eliminar</button>			      
					      </th>
					      
					    </tr>
				    
				  	</tbody>
				  
				  <%
				  
				  	}
				  
				  %>
				  
				</table>
				
			</div>
				
			<%
			
				if(!productosFail.isEmpty()){
			
			%>
		
		<div class="row">
		
			<form action="<%=request.getContextPath()%>/generarArchivoErrorServlet" method="post" target="_new">
		
			<button type="submit" class="btn btn-primary">General Listado de Error</button>
		
		</form>
		
		</div>
		
		<%
			
				}
			
		%>
	
	</div>

</body>

</html>