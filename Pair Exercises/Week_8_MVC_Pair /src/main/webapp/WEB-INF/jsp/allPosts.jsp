<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class= "white">
	
	<h1 class="black">
	Solar System Geek Forum
	</h1>
	
<!-- forum post from the individual exercise. I did find out we need a thing here from the hw from monday -- thanks Justin!!! 
	I think I found it, but I have no idea why this / works... lol.  Just tried a bunch of stuff until it worked! -->	
	
	
	 <c:url value="/" var="base" /> 

	<div class="black">
	<h2><a href="${base}/newPost">Post a Message</a></h2>
	</div>
		
	<table class="posts">
		<c:forEach items="${allPosts}" var="post">
			<tr class="post">	
				<td class="post">
				<c:out value="${post.subject}"/>
				<br>
				<c:out value="${post.username}"/>
				<c:out value="${post.datePosted}"/>
				
				<br>
				<div>
				<c:out value="${post.message}"/>
				</div>
			<br><br><br>
			</td>
			</tr>
		</c:forEach>
	</table>
			




<br> 

</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />