<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
<meta name="viewport" content="width=device-width" />
<title>Recipe Table View</title>
<link rel="stylesheet" href="css/site.css" />
</head>
<body>
	<header>
		<h1>MVC Exercises - Views Part 2: Models</h1>
	</header>
	<nav>
		<ul>
			<li>List Layout</li>
			<li><a href="recipeTiles">Tile Layout</a></li>
			<li><a href="recipeTable">Table Layout</a></li>
		</ul>

	</nav>
	<section id="main-content">

		<!-- Use the request attribute "recipes" (List<Recipe>) -->
		<h1>Recipes</h1>
		
			<c:forEach var="recipe" items="${recipes}">
				<tr>
					<a href='recipeDetails?recipeId=${recipe.recipeId}'> <img style="width: 30%"
						src="<c:url value = 'img/recipe${recipe.recipeId}.jpg'/>" />
				</a>
				</tr>
			</c:forEach>
			
		<table>
			<tr>
				<th>Name</th>
				<!-- individual for each loops in each of the places here, like I thought of last night -->
			<c:forEach var="recipe" items="${recipes}">
					<td>${recipe.name}</td>
			</c:forEach>
			</tr>
			
			<tr>
				<th>Type</th>
				<c:forEach var="recipe" items="${recipes}">
					<td>${recipe.recipeType}</td>
				</c:forEach>
			</tr>
			
			<tr>
				<th>Cook Time</th>
				<c:forEach var="recipe" items="${recipes}">
					<td>${recipe.cookTimeInMinutes} min</td>
				</c:forEach>
			</tr>
			
			<tr>
				<th>Ingredients</th>
				<c:forEach var="recipe" items="${recipes}">
						<td><c:out value="${recipe.ingredients.size()}" /> ingredients</td>
				</c:forEach>
			</tr>
			
			<tr>
				<th>Rating</th>
				<c:forEach var="recipe" items="${recipes}">
					<td>${recipe.averageRating}</td>
				</c:forEach>
			</tr>
					
		
		</table>
	</section>
</body>
</html>