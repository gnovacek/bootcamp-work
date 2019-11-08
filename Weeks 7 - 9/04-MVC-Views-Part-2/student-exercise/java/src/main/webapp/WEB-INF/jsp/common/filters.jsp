<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Container for Filter Choices
        Each link should take the user to this current page and use any combination of the following
        querystring parameters to filter the page:
        - maxPrice (number)
        - minPrice (number)
        - minRating (number)
        - category (string) - Home, Apparel, Jewelry, Garden

        NOTE: A parameter is passed to this view that is called `baseRoute`. `baseRoute`
        refers to the page that the filters should be associated with. For instance, if you are on the products
        page, the value of the `baseRoute` should be the route for products and on the tiles page, should be the
        route for tiles.
        -->
<div id="filter-options">
	<h3>Refine By</h3>
	<ul>
		<li><a href="${baseRoute}?maxPrice=25">Under $25</a></li>
		<li><a href="${baseRoute}?minPrice=25&maxPrice=50">$25 to $50</a></li>
		<li><a href="${baseRoute}?minPrice=50">$50 &amp; Above</a></li>
	</ul>
	<p>Avg. Review</p>
	<ul>
		<li>
			<a class="rating" href="${baseRoute}?minRating=4">
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span>&#9734;</span> &amp; Up
			</a>
		</li>
		<li>
			<a class="rating" href="${baseRoute}?minRating=3">
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span> &amp; Up
			</a>
		</li>
		<li>
			<a class="rating" href="${baseRoute}?minRating=2">
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span> &amp; Up
			</a>
		</li>
		<li>
			<a class="rating" href="${baseRoute}?minRating=1">
				<span class="filled">&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span> &amp; Up
			</a>
		</li>
	</ul>
	<p>Category</p>
	
	<!-- this is my best guess, even though it's wrong  -->
	<ul>
		<li><a href="${baseRoute}?category=Home">Home</a></li>
		<li><a href="${baseRoute}?category=Apparel">Apparel</a></li>
		<li><a href="${baseRoute}?category=Jewelry">Jewelry</a></li>
		<li><a href="${baseRoute}?category=Garden">Garden</a></li>
	</ul>
</div>
