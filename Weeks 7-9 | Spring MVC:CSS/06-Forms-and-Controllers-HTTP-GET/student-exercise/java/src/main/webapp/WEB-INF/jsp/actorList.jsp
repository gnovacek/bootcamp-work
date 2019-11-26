<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Actors List"/>

<%@include file="common/header.jspf"%>
<!-- Form goes here -->

<c:url var="formAction" value="/actorResults" />

<form method="GET" action="${formAction}">
  	<label for="lastName">Search Actor By Last Name</label>
  	<input type="text" name="lastName" placeholder="Search" />
  	
  	<input type="Submit" placeholder="Submit"/>
  </form>  

<table class="table">
<tr>
<th>Name</th>
</tr>
<c:forEach items="${actors}" var="actor">
<tr>
    <!-- What do we print here for each actor? -->
   	<td>${actor.firstName }</td>
   <td>${actor.lastName }</td>
</tr>
</c:forEach>
</table>
<%@include file="common/footer.jspf"%>