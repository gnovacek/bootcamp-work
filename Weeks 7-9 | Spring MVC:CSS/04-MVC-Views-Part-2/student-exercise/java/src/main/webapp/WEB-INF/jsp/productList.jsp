<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Product List View" />
</c:import>
<c:url value="/products" var="base" />
<div id="card-page">
	<c:import url="/WEB-INF/jsp/common/filters.jsp">
		
		<c:param name="baseRoute" value="${base}" />
	</c:import>

	<div class="main-content">
		<!-- Container for Sorting Choices
         
         Each link should take the user to this current page and use any combination of the following
         querystring parameters to sort the page:
            - sortOrder (string) - PriceLowToHigh,PriceHighToLow,RatingHighToLow
    	-->
    	
    	<!-- this doesn't work..... -->
		<div id="sorting-options">
			<h3>Sort By</h3>
			<ul>
				<li><a href="${base}/?sortOrder=PriceLowToHigh">Price - Low to High</a></li>
				<li><a href="${base}/?sortOrder=PriceHighToLow">Price - High to Low</a></li>
				<li><a href="${base}/?sortOrder=RatingHighToLow">Rating - High to Low</a></li>
			</ul>
		</div>

		<!-- Container for all of the Products -->
		<!-- The list of products is available using the `products` variable -->
		<div id="grid">
			
			<!-- 
			The following HTML shows different examples of what HTML could be rendered based on different rules. 
			For purposes of demonstration we've written it out so you can see it when you load the page up. 
			-->
			
		<c:forEach var="product" items="${products}">
			<!-- Standard Product -->
			<c:choose>
			<c:when test="${product.remainingStock == 0 }">
				<c:set var="className" value="tile sold-out" />
			</c:when>
			<c:otherwise> 
				<c:set var="className" value="tile " />
			</c:otherwise>
			</c:choose>

			<div class="${className }">
				<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
				
				<a class="product-image" href="products/detail?id=${product.id}"> 
			
					<img src="<c:url value="/images/product-images/${product.imageName}" />" />
				</a>
				
					<!-- Include this if the product is considered a Top Seller -->
				<c:if test="${product.topSeller }">
					<span class="banner top-seller">Top Seller!</span>
				</c:if>
				
				<div class="details">
					<p class="name">
						<c:out value="${product.name }" /> 
					</p>
		
		
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
		
			
					<!-- Include this if the remaining quantity is greater than 0, but less than or equal to 5 -->
					<c:if test="${product.remainingStock > 0 && product.remainingStock <= 5  }">
						<span class="product-alert">Only ${product.remainingStock} left!</span>
					</c:if>
					
					
					<c:if test="${product.remainingStock == 0 }">
					<!-- Include this if the remaining quantity is 0 -->
					<span class="banner"><c:out value="Sold Out" /></span>
					</c:if>
					
					<p class="price"> 
						<fmt:formatNumber value="${product.price}" type="currency" />
					</p>
				</div>
			</div>
		</c:forEach>
	</div>	
	</div>
</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />