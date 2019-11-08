<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="common/header.jsp">
	<c:param name="title" value="FizzBuzz"></c:param>
</c:import>

<!DOCTYPE html>
<html>
<head>
<title>FizzBuzz</title>

<style>
.fizz {
	color: blue;
}

.buzz {
	color: red;
}

.fizzbuzz {
	color: green;
	font-size: 24px;
}
</style>
</head>
<body>

	<nav id="page-options">
		<ul>
			<c:set var="numberOfItems" value="20" />
			<c:url var="fizzBuzzRoute" value="fizzBuzz.jsp">
				<c:param value="${ numberOfItems }" name="number" />
			</c:url>
			<li><a href="<c:out value="${ fizzBuzzRoute }" />"><c:out
						value="${ numberOfItems }" /></a></li>

			<c:set var="numberOfItems" value="50" />
			<c:url var="fizzBuzzRoute" value="fizzBuzz.jsp">
				<c:param value="${ numberOfItems }" name="number" />
			</c:url>
			<li><a href="<c:out value="${ fizzBuzzRoute }" />"><c:out
						value="${ numberOfItems }" /></a></li>

			<c:set var="numberOfItems" value="100" />
			<c:url var="fizzBuzzRoute" value="fizzBuzz.jsp">
				<c:param value="${ numberOfItems }" name="number" />
			</c:url>
			<li><a href="<c:out value="${ fizzBuzzRoute }" />"><c:out
						value="${ numberOfItems }" /></a></li>
		</ul>
	</nav>


	<c:forEach begin="1" end="${ param.number }" var="number">
		<c:choose>
			<c:when test="${number % 3 == 0 && number % 5 == 0}">
				<c:set var='rowClassAttribute' value='fizzbuzz' />
			</c:when>

			<c:when test="${number % 3 == 0}">
				<c:set var='rowClassAttribute' value='fizz' />
			</c:when>

			<c:when test="${number % 5 == 0}">
				<c:set var='rowClassAttribute' value='buzz' />
			</c:when>
			<c:otherwise>
				<c:set var='rowClassAttribute' value='' />
			</c:otherwise>
		</c:choose>

		<ul class="${rowClassAttribute}">
			<c:choose>
				<c:when test="${ number % 15 == 0 }">
					<li><c:out value= "FizzBuzz!"/></li> 
				</c:when>

				<c:when test="${ number % 3 == 0 }">
					<li> <c:out value="Fizz!" /></li> 
				</c:when>

				<c:when test="${ number % 5 == 0 }">
					<li> <c:out value="Buzz!" /></li> 
				</c:when>

				<c:otherwise>
					<li><c:out value="${number}" /></li>
				</c:otherwise>
			</c:choose>
		</ul>
	</c:forEach>



	<c:import url="common/footer.jsp"></c:import>
</body>
</html>

