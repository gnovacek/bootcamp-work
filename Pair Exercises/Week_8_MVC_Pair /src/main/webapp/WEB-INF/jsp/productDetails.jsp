<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class= "white">
	
	<h1 class="black">
	Solar System Geek Gift Shop 
	</h1>

	<section class="productDetails">
			<span class="productPic"><img src="<c:url value="/img/${product.imageName}" />" /></span>
				<span class="productName"><c:out value="${product.name}"/></span>
				<br>
				<span class="price"><c:out value="${product.price}"/></span>
				<br>
				<span class="desc"><c:out value="${product.description}"/></span>
			<br><br><br>
			
	</section>
	
	
	<c:url var="formAction" value="/shoppingCart" />

	<form method="POST" action="${formAction}">
	<input type="hidden" name="id" value="${product.id}" />
  	<label for="quantity">Quantity to buy</label> 	
  	<input type="text" name="quantity" id="quantity"/>
  <br>
  <br>
  	<input type="submit" name="submit" value="Add to Cart"/>
  </form>  
	

</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />