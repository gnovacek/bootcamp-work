<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Films List"/>

<%@include file="common/header.jspf"%>

<c:url var="formAction" value="/filmResults" />
<form method="GET" action="${formAction}">
<div class="formInputGroup">	
	<label for="minLength">Minimum Length:</label> 
	<input type="text" name="minLength" id="minLength" placeholder="MinLength"/>
	
	<label for="maxLength">Maximum Length:</label> 
	<input type="text" name="maxLength" id="maxLength" placeholder="MaxLength"/> 
	
	<label for="genre">Genre:</label> 
	<select name= "genre">
		<option>Action</option>
		<option>Animation</option>
		<option>Children</option>
		<option>Classics</option>
		<option>Comedy</option>
		<option>Documentary</option>
		<option>Drama</option>
		<option>Family</option>
		<option>Foreign</option>
		<option>Games</option>
		<option>Horror</option>
		<option>Music</option>
		<option>New</option>
		<option>Sci-Fi</option>
		<option>Sports</option>
		<option>Travel</option>
		<option>Mathmagical</option>
	</select>
	<button type="submit" value="submit">Submit</button>
</div>
</form>
<br>

<table class="table">

<tr>
	<td>Title</td> 
	<td>Description</td> 
	<td>Release Year</td> 
	<td>Length</td> 
	<td>Rating</td>
</tr>

<c:forEach var="film" items="${films}">
		<tr>
			<td id="title">${film.title}</td>
			<td id="description">${film.description}</td>
			<td id="releaseYear">${film.releaseYear}</td>
			<td id="length">${film.length}</td>
			<td id="rating">${film.rating}</td>		
		</tr>    	
</c:forEach> 

</table>


<%@include file="common/footer.jspf"%>