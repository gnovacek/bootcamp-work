<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Squirrel Cigar Parties for Dummies</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<style>
.littleStar {
	height: 50px;
}

.white {
	color: white;
}

body {
	margin: 0 auto;
	padding: 50px;
}

h3, h2, h4 {
	text-align: center;
}

.jumbotron {
	text-align: center;
}


.title {
	font-size: 28px;
	text-decoration: bold; 
	color: green; 
}

.bookpic, .partypic, .newReview {
	display: block;
  margin-left: auto;
  margin-right: auto;
  
}


</style>
</head>

<body>

	<div class="jumbotron jumbotron-fluid">
		<div class="container">
			<h1 class="display-4">Welcome to the Party</h1>
			<p class="lead">A celebration of literature that lasts a lifetime.  <br>"Squirrel Cigar Parties for Dummies" will remain a true classic for centuries.</p>
			
				<button type="button" class="btn btn-primary">
		<a class="white" href="https://www.cigars.com/">Join the movement.</a>
	</button>
			
			
		</div>
	</div>

	<h3>How can I possibly have a squirrel party as lit as this?????</h3>
	<br>
	<c:url var="party" value="/img/squirrelParty.jpg" />
	<img class="partypic" src="${party}">

	<h3>It's not as hard as you think!</h3>
	<h3>Just read this:</h3>

	<c:url var="book" value="/img/BookCover.png" />
	<img class="bookpic" src="${book}">

	<br><br>
	<h4>Have you already read the book? Let us know what you think!</h4>
	
	<button type="button" class="newReview btn btn-primary">
		<a class="white" href="reviewForm">Submit a Review</a>
	</button>


	<br><br><br>
	<h2>Browse Our Reviews</h2>
	<div class="reviews">
	<c:forEach items="${allReviews}" var="review">

		<span class="title"> <c:out value="${review.title}" /></span> (<c:out value="${review.username}" />)
					<c:out value="${review.dateSubmitted}" />
	<br>
		<c:forEach begin="1" end="${review.rating}" step="1">
			<img class="littleStar" src="img/starTransparent.png" />
		</c:forEach>
<br>
		<c:out value="${review.text}" />
		<br>
		<hr>
	</c:forEach>
</div>

</body>
</html>