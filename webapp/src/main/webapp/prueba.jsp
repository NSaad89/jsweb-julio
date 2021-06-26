<%-- DIRECTIVAS --%>

<%@page import="java.util.Set"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>

<html>

	<head>
		
		<jsp:include page="head.jsp"></jsp:include>

	</head>

		<%
		
		//SCRIPLET
		
			Map<Long, String> mapPaises = new HashMap<>();
			mapPaises.put(1L, "Argentina");
			mapPaises.put(2L, "Brasil");
			mapPaises.put(3L, "Chile");
			mapPaises.put(4L, "Peru");
			
		%>
		
	<body>

		<div class="container">
		
			<div class="row">
			
				<div class="col-12">

					<select>
					
						<%
						
							Set <Map.Entry<Long, String>> paises = mapPaises.entrySet();
						
							for(Map.Entry<Long, String> entry : paises){
								
						%>
								
								<%-- EXPRESSION --%>
								
								<option value = "<%=entry.getKey()%>"> <%=entry.getKey()%> - <% out.print(entry.getValue()); %> </option>
								
						<%
								
							}
						
						%>
					
					</select>
					
				</div>
					
			</div>
					
		</div>

	</body>
	
</html>