<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class= "white">
	
	<h1 class="black">
	Alien Weight Calculator
	</h1>
	
<c:url var="formAction" value="/alienWeightResult" />

<form method="GET" action="${formAction}">
  <label for="planetChoice">Choose a Planet</label>
		<select name="planetChoice">
			<option value="mercury">Mercury</option>
			<option value="venus">Venus</option>
			<option value="earth">Earth</option>
			<option value="mars">Mars</option>
			<option value="jupiter">Jupiter</option>
			<option value="saturn">Saturn</option>
			<option value="uranus">Uranus</option>
			<option value="neptune">Neptune</option>
		</select>
		<br>
  
  	<label for="earthWeight">Enter Your Earth Weight</label>
  	<input type="text" name="earthWeight" />
  	
  	<br>
  	
  	<input type="Submit" name="Calculate Weight" value="Calculate Weight"/>
  </form>  

<br> 
<br> 

</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />