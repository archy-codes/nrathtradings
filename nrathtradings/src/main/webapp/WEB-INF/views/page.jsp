<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags"%>

<mvc:url var="css" value="/resources/css" />
<mvc:url var="js" value="/resources/js" />
<mvc:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<title>WELCOME TO NRATH TRADINGS - ${title}</title>
<link href="${css}/bootstrap.css" rel="stylesheet">
<link href="${css}/myapp.css" rel="stylesheet">

<script>
	window.contextRoot = '${title}';
</script>

</head>

<body>
     <%@include file="./shared/navbar.jsp" %>
	<div class="main-wrapper">

		<!-- when the user click home , home page will display -->
		<c:if test="${userClickHome == true }">
			<%@include file="home.jsp"%>
		</c:if>

		<!-- when the user click about , about page will display -->
		<c:if test="${userClickAbout == true }">
			<%@include file="about.jsp"%>
		</c:if>
		
		 <!-- when the user click services , services page will display -->
         <c:if test="${userClickServices == true }">
            <%@include file="services.jsp" %>
         </c:if>
         
          <!-- when the user click projects , projects page will display -->
         <c:if test="${userClickProjects == true }">
            <%@include file="projects.jsp" %>
         </c:if>
         
           <!-- when the user click gallery , gallery page will display -->
         <c:if test="${userClickContact == true }">
            <%@include file="gallery.jsp" %>
         </c:if>
         
          <!-- when the user click home , home page will display -->
         <c:if test="${userClickContact == true }">
            <%@include file="contact.jsp" %>
         </c:if>
	</div>
	
	<%@include file="./shared/footer.jsp" %>
	
	<script src="${js}/jquery.min.js"></script>
	<script src="${js}/bootstrap.min.js"></script>
	<script type="${js}/myapp.js"></script>
</body>

</html>
