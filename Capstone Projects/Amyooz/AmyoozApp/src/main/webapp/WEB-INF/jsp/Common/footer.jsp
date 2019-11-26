<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%! 
   int pageCount = 0;
   void addCount() {
      pageCount++;
   }
%>

<% addCount(); %>
<html>
<body>
	<div class="footer">

		<footer>
			<h3>&#169 2019 Amyooz</h3>
			<h4>
				Amyooz site has been visited
				<%=pageCount%>
				times.
			</h4>
		</footer>

	</div>
</body>
</html>