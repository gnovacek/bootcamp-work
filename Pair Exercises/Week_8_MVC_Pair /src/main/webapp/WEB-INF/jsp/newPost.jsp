<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class= "white">
	
	<h1 class="black">
	New Geek Post
	</h1>
	
<c:url var="formAction" value="/newPost" />

<form method="POST" action="${formAction}">

  
  <label for="username">Username</label>
  	<input type="text" name="username" />
  
  <br>
  <br>
  	<label for="subject">Subject</label>
  	<input type="text" name="subject" />
  <br>
  <br>
  	<label for="message">Message</label> 	
  	<textarea name="message" rows="5" cols="50"></textarea>
  	
  <br>
  <br>
  	<input type="submit" name="submit" value="Submit!"/>
  </form>  

<br> 
<br> 

</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />