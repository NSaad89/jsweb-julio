<%@page import="ar.com.educacionit.domain.Producto"%>
<%@page import="java.util.Collection"%>
<html>

<body>

<%

		// codigo java

		Collection<Producto> productos = (Collection<Producto>)request.getAttribute("productos");

		// Dinámico
		// Out -> Es como el Syso pero convierte a HTML lo que escribo

		out.print("<ul>");

		for(Producto p : productos){
	
			out.print("<li>");
			out.print(p.getCodigo());
			out.print(" - ");
			out.print(p.getDescripcion());
			out.print("</li>");
	
		}

		out.print("</ul>");
		
%>

<a href="<%=request.getContextPath()%>/index.jsp">Volver a inicio</a>

</body>

</html>