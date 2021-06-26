<%@page import="ar.com.educacionit.domain.Producto"%>
<%@page import="java.util.Collection"%>
<html>

<head>

	<jsp:include page="head.jsp"/>

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

		// codigo java

		Collection<Producto> productos = (Collection<Producto>)request.getAttribute("productos");

		// Dinámico
		// Out -> Es como el Syso pero convierte a HTML lo que escribo

// 		out.print("<ul>");

		for(Producto p : productos){
	
// 			out.print("<li>");
// 			out.print(p.getCodigo());
// 			out.print(" - ");
// 			out.print(p.getDescripcion());
// 			out.print("</li>");
	
// 		}

// 		out.print("</ul>");
		
%>
			  
			 	<tbody>
			  
				    <tr>
				      <th scope="row"><%=p.getId()%></th>
				      <td><%=p.getDescripcion()%></td>
				      <td><%=p.getPrecio()%></td>
				      <td><%=p.getCodigo()%></td>
				    </tr>
			    
			  	</tbody>
			  
			  <%
			  
			  	}
			  
			  %>
			  
			</table>

<a href="<%=request.getContextPath()%>/index.jsp">Volver a inicio</a>

</div>

</div>

</div>

</body>

</html>