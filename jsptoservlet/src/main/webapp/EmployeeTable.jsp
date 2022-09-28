<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<head>
<title>FORM</title>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<style>
.table {
	width: 100%;
	margin-bottom: 1rem;
	color: #dae0e7;
}

.button-right {
	display: flex;
	flex-direction: row-reverse;
}

.fit-content {
	min-width: fit-content;
}

.gradient-custom {
	/* fallback for old browsers */
	background: #6a11cb;
	/* Chrome 10-25, Safari 5.1-6 */
	background: -webkit-linear-gradient(to right, rgba(106, 17, 203, 1),
		rgba(37, 117, 252, 1));
	/* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
	background: linear-gradient(to right, rgba(106, 17, 203, 1),
		rgba(37, 117, 252, 1));
}
</style>
</head>
<body>
	<script>
		function deleteConform(url) {
			var doc;
			var result = confirm("Are you sure you want to delete?");
			if (result == true) {
				window.open("delete?id=" + url, "_self");
			}
		}
	</script>
	<section class="vh-100 gradient-custom">
		<div class="container py-5 h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-12 col-md-8 col-lg-6 col-xl-5 fit-content">
					<div class="card bg-dark text-white" style="border-radius: 1rem;">
						<div class="card-body p-10 text-center">
							<div class="mb-md-5 mt-md-4 pb-5">
								<h3>Employee List</h3>
								<header>
									<a href="<%=request.getContextPath()%>/list" class="nav-link"></a>
								</header>
								<hr>
								<a href="<%=request.getContextPath()%>/new" class="button-right">
									<button class="btn btn-primary">Add</button>
								</a> <br>
								<table class="table table-bordered">
									<thead>
										<tr>
											<th>ID</th>
											<th>First Name</th>
											<th>Last Name</th>
											<th>User Name</th>
											<th>Address</th>
											<th>Contact No</th>
											<th>Actions</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="Employee" items="${listemployee}">
											<tr>
												<td><c:out value="${Employee.id}" /></td>
												<td><c:out value="${Employee.firstName}" /></td>
												<td><c:out value="${Employee.lastName}" /></td>
												<td><c:out value="${Employee.userName}" /></td>
												<td><c:out value="${Employee.address}" /></td>
												<td><c:out value="${Employee.contactNo}" /></td>
												<td><a href="edit?id=<c:out value='${Employee.id}'/>">Edit</a>
													&nbsp;&nbsp;&nbsp;&nbsp; <a onclick="deleteConform('${Employee.id}')" id="index"
													>Delete</a>
												</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>