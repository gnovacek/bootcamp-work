<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Customers List"/>

<%@include file="common/header.jspf"%>

<c:url var="formAction" value="/customerResults" />
<form method="GET" action="${formAction}">
<div class="formInputGroup">
	<label for="searchTerm">Search by Name:</label> 
	<input type="text" name="searchTerm" id="searchTerm" placeholder="Search"/>
	<label for="sort">Sort:</label> 
	<select name="sort" id="sort">
		<option value="last_name">Last Name</option>
		<option value="email">Email</option>
		<option value="activebool">Active</option>
	</select>
	<button type="submit" value="submit">Search</button>
</div>
</form>


<table class="table">
<tr>
	<th>Name</th>
	<th>Email</th>
	<th>Active</th>
</tr>

<tr>
<c:forEach var="customer" items="${customers}">
		<tr>
			<td id="name">${customer.firstName} ${customer.lastName}</td>
			<td id="email">${customer.email}</td>
			<td id="active">
			<c:if test="${customer.active == true}" >
				<c:out value="Yes" /> 
			</c:if>
			<c:if test="${customer.active == false}" >
				<c:out value="No" /> 
			</c:if>
			</td>	
		</tr>    	
</c:forEach> 
</tr>
</table>
<%@include file="common/footer.jspf"%>