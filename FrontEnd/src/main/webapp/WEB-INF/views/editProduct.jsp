<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>



<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>Edit Product</h1>


			<p class="lead">Please update information of Product.</p>
		</div>

		<form:form action="${pageContext.request.contextPath}/admin/product/editProduct" method="post" commandName="product" enctype="multipart/form-data">
			 <form:hidden path="id" value="${product.id }" /> 
			
			<div class="form-group">
				<label for="name">Name</label>
				<form:input path="name" id="name" class="form-control" value="${product.name }" />
			</div>
</>

			<%-- <div class="form-group">
<label for="category">Category</label>
<label class="checkbox-inline"><form:radiobutton path="category" id="category" value="mobile"/>Mobile</label>
<label class="checkbox-inline"><form:radiobutton path="category" id="category" value="laptop"/>Laptop</label>
<label class="checkbox-inline"><form:radiobutton path="category" id="category" value="camera"/>Camera</label>
<label class="checkbox-inline"><form:radiobutton path="category" id="category" value="tablet"/>Tablet</label>
</div>
 --%>
			<%-- <div class="form-group">
				<label for="id">Id</label>
				<form:input path="id" id="id" class="form-control" value="${product.id}"/>
			</div>
 --%>

			<div class="form-group">
				<label for="description">Description</label>
				<form:textarea path="description" id="description"
					class="form-control" value="${product.description }"/>
			</div>

			<div class="form-group">
				<label for="price">Price</label>
				<form:input path="price" id="price" class="form-control" value="${product.price}" />
			</div>

			<div class="form-group">
				<label for="quantity">Quantity</label>
				<form:input path="quantity" id="quantity" class="form-control" value="${product.quantity}" />
			</div>

			<div class="form-group">
				<label for="categoryid">Category Id</label>
				<form:input path="categoryId" id="categoryid" class="form-control" value="${product.categoryId}"/>
			</div>

			<div class="form-group">
				<label for="supplierid">Supplier Id</label>
				<form:input path="supplierId" id="supplierid" class="form-control" value="${product.supplierId}"/>
			</div>
			
			<div class="form-group">
				<label class="control-label" for="image">Upload Picture</label>
				<form:input path="image" id="image" type="file" class="form:input-large" />
			</div>
			

			<br></br>
			<input type="submit" value="submit" class="btn btn-default">
			<a href="<c:url value="/admin/productInventory"/>"
				class="btn btn-default">Cancel</a>
		</form:form>




		<%@include file="/WEB-INF/views/template/footer.jsp"%>