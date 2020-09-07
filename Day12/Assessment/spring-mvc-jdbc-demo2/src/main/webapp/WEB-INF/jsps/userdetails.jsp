<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container mt-3">
	
		<div class="row">
		
			<div class="col-md-12">
			
				<table class="table" border="1">
	
				
  <thead class="thead-dark">
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Name</th>
      <th scope="col">Gender</th>
      <th scope="col">Category</th>
      <th scope="col">Email</th>
      <th scope="col">Mobile</th>
    </tr>
  </thead>
  <tbody>
  	<c:forEach var="user" items="${userList}">
	<tr>
		<td>${user.userId}</td>
		<td>${user.userName}</td>
		<td>${user.userGender}</td>
		<td>${user.select}</td>
		<td>${user.email}</td>
		<td>${user.phone}</td>
	</tr>	

	</c:forEach>
  </tbody>
</table>
				
			</div>
		
		</div>
		
		
	</div>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	<!--  <table border="1">
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Gender</th>
		<th>Category</th>
		<th>Email</th>
		<th>Mobile</th>
	</tr>
	<c:forEach var="user" items="${userList}">
	<tr>
		<td>${user.userId}</td>
		<td>${user.userName}</td>
		<td>${user.userGender}</td>
		<td>${user.select}</td>
		<td>${user.email}</td>
		<td>${user.phone}</td>
	</tr>	

	</c:forEach>
</table>

-->



</body>
</html>