<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="white">

	<h1 class="black">Solar System Geek Gift Shop</h1>

	<section class="shoppingCart black">
		<table class="black">
			<tr>
				<th>Name</th>
				<th>Price</th>
				<th>Qty.</th>
				<th>Total</th>
			</tr>

			<c:forEach items="${cart.productMap.values()}" var="item">
				<c:url value="/spaceStore/detail" var="detailURL" />
				<tr>
					<td><a class="product-image" href="${detailURL}?id=${item.id}">
							<img src="<c:url value="/img/${item.imageName}" />" />
					</a></td>

					<td><c:out value="${item.name}" /></td>

					<td><span class="price"><c:out value="${item.price}" /></span></td>
					<td><c:out value="${cart.quantityMap.get(item.id)}" /></td>
					<td><c:out value="${cart.getProductTotal(item)}" /></td>
				<tr>
			</c:forEach>
		</table>

		<div class="lowerRight">
			Grand Total
			<c:out value="  ${cart.total}" />
			<br>
			<c:url value="/spaceStore" var="store" />
			<a href="${store}">Check out</a>
		</div>

	</section>

	<br>

</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />