<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="pageTitle" value="Login Page"/>
<%@include file="common/header.jspf" %>

<h2>Login</h2>


<c:url var="loginUrl" value="/login"/>
<form:form method="POST" action="${loginUrl }" modelAttribute="login">
		
	<div>
		<form:label path="email">Email</form:label>
		<form:input path="email" placeholder="email"/>
		<form:errors path="email" cssClass="error"/>
		<span style="color: red;" >*</span>
	</div><br>
	
	<div>
		<form:label path="password">Password</form:label>
		<form:input path="password" placeholder="password" type="password" />
		<form:errors path="password" cssClass="error"/>
		<span style="color: red;" >*</span>
	</div><br>


	<div>
		<input class="btn btn-primary" type="submit" value="Submit"/>
	</div>
	
</form:form>

<%@include file="common/footer.jspf" %>
