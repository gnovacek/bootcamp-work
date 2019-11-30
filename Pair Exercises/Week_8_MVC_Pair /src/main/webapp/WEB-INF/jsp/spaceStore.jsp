<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="white">

	<h1 class="black">Solar System Geek Gift Shop</h1>

	<table>
		<c:forEach items="${allProducts}" var="product">
			<tr>
			<c:url value="/spaceStore/detail" var="detailURL" />
			<td>
			<a class="product-image" href="${detailURL}?id=${product.id}"> <img
				src="<c:url value="/img/${product.imageName}" />" /></a>
			</td>
			<td>
			<span class="productName"><c:out value="${product.name}" /></span>
			</td>
			<td>
			<span class="price"><c:out value="${product.price}" /></span>
			</td>
		</tr>
		</c:forEach>
	</table>
	

	<br>

</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />