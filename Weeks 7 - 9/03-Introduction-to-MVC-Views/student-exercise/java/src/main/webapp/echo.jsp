<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="common/header.jsp">
	<c:param name="title" value="Echo"></c:param>
</c:import>

<!DOCTYPE html>
<html>
<head>
<title>Echo</title>
</head>

<body>

	<nav id="page-options">
		<ul>
			<c:set var="routeCount" value="10" />
			<c:set var="routeWord" value="Echo" />
			<c:url var="echoRoute" value="echo.jsp">
				<c:param value="${ routeCount }" name="count" />
				<c:param value="${ routeWord }" name="word" />
			</c:url>
			<li><a href="<c:out value="${ echoRoute }" />">${ routeWord }
					${ routeCount }</a></li>

			<c:set var="routeCount" value="20" />
			<c:set var="routeWord" value="Hello!" />
			<c:url var="echoRoute" value="echo.jsp">
				<c:param value="${ routeCount }" name="count" />
				<c:param value="${ routeWord }" name="word" />
			</c:url>
			<li><a href="<c:out value="${ echoRoute }" />">${ routeWord }
					${ routeCount }</a></li>

			<c:set var="routeCount" value="50" />
			<c:set var="routeWord" value="Goodbye!" />
			<c:url var="echoRoute" value="echo.jsp">
				<c:param value="${ routeCount }" name="count" />
				<c:param value="${ routeWord }" name="word" />
			</c:url>
			<li><a href="<c:out value="${ echoRoute }" />">${ routeWord }
					${ routeCount }</a></li>
		</ul>
	</nav>

	<ul>
		<c:forEach begin="1" end="${ param.count }" var="counter">
			<li style="font-size: ${ param.count - counter + 1 }px"><c:out
					value="${ param.word }" /></li>
		</c:forEach>
	</ul>

	<c:import url="common/footer.jsp"></c:import>

</body>
</html>