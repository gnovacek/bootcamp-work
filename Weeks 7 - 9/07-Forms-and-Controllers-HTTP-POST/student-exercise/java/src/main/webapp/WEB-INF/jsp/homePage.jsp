<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Squirrel Cigar Parties for Dummies</title>
	<style>
	
	.littleStar {
		height: 50px;
	}
	
	</style>	
	</head>
	<body>
		<h1>Welcome to the Party</h1>
	
	
		<h3>How can I possibly have a squirrel party as lit as this?????</h3>
		<br>
		<c:url var="party" value="/img/squirrelParty.jpg" />
		<img src="${party}">
		
		<h3>It's not as hard as you think!</h3>
		<h3>Just read this:</h3>
		
		<c:url var="book" value="/img/BookCover.png" />
		<img src="${book}">
		
		
		<h4>Have you already read the book?  Let us know what you think!</h4>
		 <ul>
            <li><a href="reviewForm">Submit a Review</a></li>             
        </ul>
		
		
		<h2>Browse Our Reviews</h2>
			<ul>
			<c:forEach items="${allReviews}" var="review">
				
					<li><c:out value="${review.title}"/> (<c:out value="${review.username}"/>)</li>
					<li><c:out value="${review.dateSubmitted}"/></li>
					
					<c:forEach begin="1" end="${review.rating}" step="1">
					<img class="littleStar" src="img/starTransparent.png" />
					</c:forEach>
					
					<li><c:out value="${review.text}"/></li>
					<br>
					<hr>
			</c:forEach>
			</ul>
	
		
	</body>
</html>