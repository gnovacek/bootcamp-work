<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="white">
<table class="table">

<tr>

<td>	<img src="img/${param.planetChoice}.jpg" /></td>

   	<td class="black">If you are ${param.earthAge} years old on planet Earth, then you are 
   	<c:out value="${calculator.alienAge}" /> 
   	${param.planetChoice} years old.</td>
  
</tr>
</table>

</section>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />