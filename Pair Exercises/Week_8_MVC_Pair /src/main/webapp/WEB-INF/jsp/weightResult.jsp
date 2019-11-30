<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="white">
<table class="table">

<tr>

<td>	<img src="img/${param.planetChoice}.jpg" /></td>

   	<td class="black">If you are ${param.earthWeight} lbs on planet Earth, then you are 
   	<c:out value="${calculator.alienWeight}" /> lbs on
   	${param.planetChoice}.</td>
  
</tr>
</table>

</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />