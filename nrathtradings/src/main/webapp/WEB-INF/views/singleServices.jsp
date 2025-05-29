<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="wrapper-multiPage">
	<div class="card">
		<div class="card-body">
			<h1>OUR SIDE MENU HERE</h1>
		</div>
	</div>
	<c:forEach items="${categoryInfo}" var="category">
		<div class="card">
			<h1 class="display-1">SINGLE PAGE ACCOUNT</h1>
			<h1>${category.headerOne}</h1>
			<p>${category.firstDescription}</p>
			<h1>${category.headerTwo}</h1>
			<p>${category.secondDescription}</p>
		</div>
	</c:forEach>

	<div class="d-grid gap-2 col-6 mx-auto">
		<a class="btn btn-primary" type="button" href="${contextRoot}/services">Back to Services</a>
	</div>
</div>

