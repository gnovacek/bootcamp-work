<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
<meta name="viewport" content="width=device-width" />
<title>Recipe List View</title>
<link rel="stylesheet" href="css/site.css" />
</head>
<body>
	<header>
		<h1>MVC Exercises - Views Part 3: Detail Views</h1>
	</header>
	<nav>
		<ul>
			<li>List Layout</li>
			<li><a href="recipeTiles">Tile Layout</a></li>
			<li><a href="recipeTable">Table Layout</a></li>
		</ul>

	</nav>
	<section>
	<img style="width: 20%; 
	float: left; 
	padding: 10px; "
		src="<c:url value = 'img/recipe${recipe.recipeId}.jpg'/>" />
				
				
		
	<div class="infoByPicture">
	<h4><c:out value="${recipe.name}"/></h4>
	<c:out value="${recipe.recipeType}"/>

	<p><c:out value="Cook Time ${recipe.cookTimeInMinutes} minutes"/><p>
	<p><c:out value="${recipe.description}"/><p>
	</div>
	<br>
	<h3><c:out value="Ingredients"/></h3>
		<ul>
		<c:forEach var="entry" items="${recipe.ingredients}">
		
			<li class="ingredientDetails"><c:out value="${entry.getQuantity()} ${entry.getName()}" /></li>
		</c:forEach>
		</ul>
		
		<hr>
		
	<h3><c:out value="Preparation"/></h3>
		<ol>
		<c:forEach var="entry" items="${recipe.preparationSteps}">
			<li class="ingredientDetails"><c:out value="${entry}" /></li>
		</c:forEach>
		</ol>
	
	<br>
	</section>

</body>
</html>