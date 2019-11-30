<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="white">
<table class="table">

<tr>

<td>	<img src="img/${param.planetChoice}.jpg" /></td>

   	<td class="black">Traveling by ${param.travelType} you will reach ${param.planetChoice} 
   	in 	<c:out value="${calculator.alienTravelTime}" />  years.  You will be 
   	<c:out value="${calculator.ageAfterTravel}" /> 
   	years old. 
   	
   	
   	</td>
   	
   	
   	
 
  
</tr>
</table>

</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />