<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class= "white">
	
	<h1 class="black">
	Alien Travel Calculator
	</h1>
	
<c:url var="formAction" value="/alienTravelResult" />

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
		
  <label for="travelType">Choose a Transportation Mode</label>
		<select name="travelType">
			<option value="walking">Walking</option>
			<option value="car">Car</option>
			<option value="train">Bullet Train</option>
			<option value="boeing">Boeing747</option>
			<option value="concorde">Concorde</option>
		</select>
		<br>
  
  	<label for="earthAge">Enter Your Earth Age</label>
  	<input type="text" name="earthAge" />
  	
  	<br>
  	
  	<input type="Submit" name="Calculate Travel Time" value="Calculate Travel Time"/>
  </form>  

<br> 
<br> 

</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />