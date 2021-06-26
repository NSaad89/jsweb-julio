<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>

<html>

<head>

<jsp:include page="head.jsp"></jsp:include>

</head>

<body>

	<div class="container">
		
			<div class="row">
			
				<div class="col-6">


					<form action="<%=request.getContextPath()%>/loginServlet" method="get">
					
					  <div class="form-group">
					  
					    <label for="exampleInputEmail1">Username</label>
					    <input name="username" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
					    					  
					  </div>
					  
					  <div class="form-group">
					  
					    <label for="exampleInputEmail2">Password</label>
					    <input name="password" type="password" class="form-control" id="exampleInputEmail2" aria-describedby="emailHelp">
					    					  
					  </div>
					  
					  <button type="submit" class="btn btn-primary">Buscar</button>
					  
					</form>
				
				</div>
				
			</div>
			
		</div>

</body>

</html>