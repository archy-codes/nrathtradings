<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="services-header">
	<div class="headerServicesImg">
		<img alt="" src="${images}/servicesimages/servicesHeaderCover.jpg"
			class="coverServicesHeader" />
	</div>
	<div class="servicesHeading">
		<div class="servicesMidDiv">
			<h1 class="display-2 fw-bold text-light">OUR SERVICES</h1>
			<p class="text-muted">
				SERVICES / <a href="${contextRoot}/home" class="text-white">HOME</a>
			</p>
			<div class="getMoreInfo pt-3">
				<p class="text-light">rotect your people and your assets with
					our industrial safety services</p>
				<a class=" btn btn-primary" href="${contextRoot}/projects">OUR
					PROJECTS</a> <a class=" btn btn-primary" href="${contextRoot}/contact">CONTACT
					US</a>
			</div>
		</div>
	</div>
</div>
<div class="wrapper-services">
	<c:forEach items="${categories}" var="category">
		<div class="card ">
			<div class="card-header bg-white border border-0">
				<img alt="" src="${images}/servicesimages/birckWork.jpg"
					class="servicesImages">
			</div>
			<div class="card-body">
				<h4>${category.categoryName}</h4>
			</div>
			<div class="card-footer text-center bg-white border border-0">
				<a href="${contextRoot}/show/${category.id}/category/det">READ MORE</a>
			</div>
		</div>

	</c:forEach>

</div>