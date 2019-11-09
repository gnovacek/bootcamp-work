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
		<table>
			<c:forEach var="recipe" items="${recipes}">
				<tr>
					<a href='recipeDetails?recipeId=${recipe.recipeId}'> <img style="width: 30%"
						src="<c:url value = 'img/recipe${recipe.recipeId}.jpg'/>" />
				</a>
				</tr>
			</c:forEach>
		</table>

<table class="shaded"> 
		<tr id="noshade">
		<c:forEach var="recipe" items="${recipes}">
		<td>${recipe.name}</td>
		</c:forEach>
		</tr>
		
		<tr class="padding">
		<c:forEach var="recipe" items="${recipes}">
		<td><c:out value="${recipe.ingredients.size()}"/> ingredients</td>
		</c:forEach>
		</tr>
</table>
			
    </section>
</body>
</html>