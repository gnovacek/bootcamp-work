<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Submit a Review</title>
</head>
<body>
	
	<h1>Submit a New Review</h1>
	<h2>Please be nice though!</h2>
	
<section>
<c:url var="formAction" value="/reviewForm" />

<form method="POST" action="${formAction}">
 
<!--  make all 4 inputs required -->
  
  <label for="username">Username:</label>
  	<input type="text" name="username" />
  
  
  <label for="rating">Rating:</label>
		<select name="rating">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
		</select>
		<br>
  	<label for="title">Review Title:</label>
  	<input type="text" name="title" />
  	<br>
  	  <label for="text">Review Text:</label>
  	<input type="text" name="text" />
  	
  
  	
  	<input type="Submit" name="Submit" value="Submit"/>
  </form>  

<br> 
<br> 

</section>


<!-- After the user's form submission passes server-side validation, the post can be submitted. Once the submission is processed, the user is redirected to the Home Page.  -->

</body>
</html>

