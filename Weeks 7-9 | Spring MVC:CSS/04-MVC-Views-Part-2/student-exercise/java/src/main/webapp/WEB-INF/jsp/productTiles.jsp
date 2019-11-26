<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Product Tile View" />
</c:import>
<c:url value="/products/tiles" var="base" />
<div id="masonry-page">
	<c:import url="/WEB-INF/jsp/common/filters.jsp">
		<%-- Modify the baseRoute to apply filters to the current route. --%>
		<c:param name="baseRoute" value="${base}" />
	</c:import>



	<!-- Container for all of the Products -->
	<!-- The list of products is available using the `products` variable -->
	<div id="grid" class="main-content">
<c:url value="/products/detail" var="detail" />
		<!-- Standard Product -->

	<c:forEach var="product" items="${products}">
		<c:choose>
			<c:when test="${product.remainingStock == 0 && product.topSeller }">
				<c:set var="className" value="tile sold-out top-seller" />
			</c:when>
			<c:when test="${product.remainingStock == 0 }">
				<c:set var="className" value="tile sold-out" />
			</c:when>
			<c:when test="${product.topSeller}">
				<c:set var="className" value="tile top-seller" />
			</c:when>
			<c:otherwise> 
				<c:set var="className" value="tile " />
			</c:otherwise>
			</c:choose>

		<div class="${className }">
			<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
			<a class="product-image" href="${detail}?id=${product.id}"> 
				<img src="<c:url value="/images/product-images/${product.imageName}" />" />
			</a>
			<div class="details">
				<p class="name">
					<a href="/detail?id=${product.id}">${product.name}</a>
				</p>
				
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
				
				<!-- Add the X remaining product alert if the remaining quantity is greater than 0, but less than or equal to 5 -->
				<c:if test="${product.remainingStock > 0 && product.remainingStock <= 5  }">
						<span class="product-alert">${product.remainingStock} remaining!</span>
					</c:if>
				
					<!-- Add the .top-seller class if the product is considered a Top Seller -->
				<c:if test="${product.topSeller }">
					<div class=" top-seller">
					
			<!-- Add the Top Seller <br/> and product alert if the product is considered a Top Seller -->
						<br />
							<p class="product-alert">Top Seller</p>
					</div>
					</c:if>
			
					<!-- Add the .sold-out class if the Remaining Stock is 0 -->
				<c:if test= "${product.remainingStock == 0 }" >
					<div class=" sold-out">
						<!-- Add the Sold Out banner if the Remaining Stock is 0 -->
						<span class="banner">Sold Out</span>
					</div>
				</c:if>
				
			
				<p class="price">
				<fmt:formatNumber value="${product.price}" type="currency" /></p>
		
			</div>
		</div>	
	</c:forEach>
	</div>
</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />