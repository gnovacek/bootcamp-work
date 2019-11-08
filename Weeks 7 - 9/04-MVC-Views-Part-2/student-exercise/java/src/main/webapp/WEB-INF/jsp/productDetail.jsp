<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Product Details" />
</c:import>

<!-- Container for the Product -->
<!-- The current product is available using the `product` variable -->
<div id="product-detail">
	<img src="<c:url value="/images/product-images/${product.imageName}" />" />
	
	
	<div class="product-description">
		<h3><c:out value="${product.name}" /></h3>

		<!-- .filled will make the star solid -->
		<div class="rating">
					<c:if test="${product.averageRating <= 1 }">
						<span class="filled">&#9734;</span> 
						<span>&#9734;</span>
						<span>&#9734;</span> 
						<span>&#9734;</span> 
						<span>&#9734;</span>
					</c:if>
				
					<c:if test="${product.averageRating >= 2 && product.averageRating < 3 }">
						<span class="filled">&#9734;</span> 
						<span class="filled">&#9734;</span>
						<span>&#9734;</span> 
						<span>&#9734;</span> 
						<span>&#9734;</span>
					</c:if>
				
					<c:if test="${product.averageRating >= 3 && product.averageRating < 4 }">
						<span class="filled">&#9734;</span> 
						<span class="filled">&#9734;</span>
						<span class="filled">&#9734;</span> 
						<span>&#9734;</span> 
						<span>&#9734;</span>
					</c:if>
				
					<c:if test="${product.averageRating >= 4 && product.averageRating < 5 }">
						<span class="filled">&#9734;</span> 
						<span class="filled">&#9734;</span>
						<span class="filled">&#9734;</span> 
						<span class="filled">&#9734;</span> 
						<span>&#9734;</span>
					</c:if>
					
					<c:if test="${product.averageRating == 5 }">
						<span class="filled">&#9734;</span> 
						<span class="filled">&#9734;</span>
						<span class="filled">&#9734;</span> 
						<span class="filled">&#9734;</span> 
						<span class="filled">&#9734;</span>
					</c:if>
				</div>

		<!-- Include this if the product has a Remaining Stock of 5 or less -->
		<c:if test="${product.remainingStock > 0 && product.remainingStock <= 5  }">
			<p class="alert-remaining">BUY NOW! Only ${product.remainingStock} left!</p>
		</c:if>
		
		<p class="description">
			<c:out value="${product.description}"></c:out>
		</p>
		
		<p class="price">
			<fmt:formatNumber value="${product.price}" type="currency" />
		</p>

	<c:if test="${product.remainingStock > 0}">
		<!-- If item is in stock -->
		<button class="action">Add to Cart</button>
	</c:if>
	
		<!-- OR if item is out of stock -->
	<c:if test="${product.remainingStock == 0}">
		<button disabled>Sold Out</button>
	</c:if>
	</div>
</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />