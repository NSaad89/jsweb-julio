<%@page import="ar.com.educacionit.domain.Producto"%>
<%@page import="java.util.Collection"%>
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
	
		<div class="col-12">
		
			<table class="table">
			
			  <thead>
			  
			    <tr>
			      <th scope="col">Id</th>
			      <th scope="col">Descripci&oacute;n</th>
			      <th scope="col">Precio</th>
			      <th scope="col">C&oacute;digo</th>
			    </tr>
			    
			  </thead>
			  
			  <%
			  
			  Collection<Producto> pds = (Collection<Producto>)session.getAttribute("productos");
			  
			  %>
			  
			  <%
			  
			  	for (Producto producto : pds) {
				
			  %>
			  
			 	<tbody>
			  
				    <tr>
				      <th scope="row"><%=producto.getId()%></th>
				      <td><%=producto.getDescripcion()%></td>
				      <td><%=producto.getPrecio()%></td>
				      <td><%=producto.getCodigo()%></td>
				    </tr>
			    
			  	</tbody>
			  
			  <%
			  
			  	}
			  
			  %>
			  
			</table>
		
		</div>
		
		<div class="col-12">
		
			<a href="<%=request.getContextPath()%>/logoutServlet">Logout</a>
		
		</div>
	
	</div>

</div>

</body>

</html>