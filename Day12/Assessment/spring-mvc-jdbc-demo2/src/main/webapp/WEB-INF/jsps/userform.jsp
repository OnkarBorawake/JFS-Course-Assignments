<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>  


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="addUser" method="post"><div class="form-control">
	Athlete Name  	<input type="text" name="userName" class="form-control" required/> </div>
	<div class="form-control">
	Gender  		<label for="male">Male</label>	
					<input type="radio" id="male" name="userGender" class="form-control" value="male">
					<label for="female">Female</label>
					<input type="radio" id="female" name="userGender" class="form-control" value="female">
					</div>
	<div class="form-control">
	Category 		<select name="select" id="select" class="form-control" required>
					  <option value="Running">Running</option>
					  <option value="High Jump">High Jump</option>
					  <option value="Hurdles">Hurdles</option>
					  <option value="Relay">Relay</option>
					  <option value="Javelin Throw">Javelin Throw</option>
					  <option value="Shot put">Shot put</option>
					</select></div>
	<div class="form-control">				
	Email			<input type="email" name="email" class="form-control" pattern="^([a-z0-9\.-]+)@([a-z0-9-]+).([a-z]{2,8})(.[a-z]{2,8})?$" required/></div>
<div class="form-control">
	Mobile			<input type="text" id="phone" class="form-control" name="phone" pattern="[7-9]\d{9}$" required></div>
<div class="form-control">	<input type="submit" class="form-control" value="Add" /></div>
</form>

</body>
</html>