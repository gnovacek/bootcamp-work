<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<c:set var="pageTitle" value="Registration Page"/>
<%@include file="common/header.jspf" %>

<h2>New User Registration</h2>

<c:url var="registrationUrl" value="/register"/>
<form:form method="POST" action="${registrationUrl }" modelAttribute="registration">
	
	<div>
		<form:label path="firstName"> First Name </form:label>
		<form:input path="firstName" placeholder="enter first name"/>
		<form:errors path="firstName" cssClass="error"/>
		<span style="color: red;" >*</span>
	</div><br>
		
	<div>
		<form:label path="lastName">Last Name</form:label>
		<form:input path="lastName" placeholder="enter last name"/>
		<form:errors path="lastName" cssClass="error"/>
		<span style="color: red;" >*</span>
	</div><br>

	<div>
		<form:label path="email">Email</form:label>
		<form:input path="email" placeholder="enter Email"/>
		<form:errors path="email" cssClass="error"/>
		<span style="color: red;" >*</span>
	</div><br>	
	
	<div>
		<form:label path="confirmEmail">Confirm Email</form:label>
		<form:input path="confirmEmail" placeholder="confirm Email address"/>
		<form:errors path="confirmEmail" cssClass="error"/>
		<span style="color: red;" >*</span>
	</div><br>
	
		<div>
		<form:label path="password">Password</form:label>
		<form:input path="password" placeholder="enter password" type="password" />
		<form:errors path="password" cssClass="error"/>
		<span style="color: red;" >*</span>
	</div><br>
	
	<div>
		<form:label path="confirmPassword"> Confirm Password </form:label>
		<form:input path="confirmPassword" placeholder="confirm password" type="password" />
		<form:errors path="confirmPassword" cssClass="error"/>
		<span style="color: red;" >*</span>
	</div><br>	
	
	<div>
		<form:label path="birthDate"> Birthday </form:label>
		<form:input path="birthDate" placeholder="birthdate yyyy-mm-dd"/>
		<form:errors path="birthDate" cssClass="error"/>
		<span style="color: red;" >*</span>	
	</div><br>
	
	<div>
		<form:label path="numOfTickets"> Number of Tickets</form:label>
		<form:input path="numOfTickets" placeholder="enter # of tickets" type="number" min="1" max="10"/>
		<form:errors path="numOfTickets" cssClass="error"/>
		<span style="color: red;" >*</span>
	</div><br>
	
	<div>
		<input class="btn btn-primary" type="submit" value="Submit"/>
	</div>
</form:form>

<%@include file="common/footer.jspf" %>