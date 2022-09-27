<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
<link rel="stylesheet" href="style.css">
<head>
  <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>EMPLOYEE FORM</title>
<style>
.gradient-custom {

.submit:hover{
border: 1px solid rgb(142, 24, 24);
	background-color: rgb(222, 147, 147);
}
    /* fallback for old browsers */
    background: #6a11cb;
    
    /* Chrome 10-25, Safari 5.1-6 */
    background: -webkit-linear-gradient(to right, rgba(106, 17, 203, 1), rgba(37, 117, 252, 1));
    
    /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
    background: linear-gradient(to right, rgba(106, 17, 203, 1), rgba(37, 117, 252, 1));
    }</style>
</head>

<body class="full-form">
	<section class="vh-100 gradient-custom">
		<div class="container py-5 h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-12 col-md-8 col-lg-6 col-xl-5">
					<div class="card bg-dark text-white" style="border-radius: 1rem;">
						<div class="card-body p-5 text-center">
							<div class="mb-md-5 mt-md-4 pb-5">
								<header>
									<h2 class="head">Employee Register Form</h2>

									<a href="<%=request.getContextPath()%>/list"> </a>

								</header>

								<c:if test="${employee == null}">
									<form action="insert" method="get">
								</c:if>
								<c:if test="${employee != null}">
									<form action="update" method="get">
								</c:if>
								<table class="w-100">

									<tr>
										<td>First Name :</td>
										<td><c:if test="${employee != null}">
												<input type="hidden" name="id"
													value="<c:out value='${employee.id}' />" />
											</c:if> <input type="text"
											placeholder="Please write your first name" name="first_name"
											class="form-control" required
											value="<c:out value='${employee.firstName}' />"></td>
									</tr>
									<tr>
										<td>Last Name :</td>
										<td><input type="text"
											placeholder="Please write your last name" name="last_name"
											class="form-control" required
											value="<c:out value='${employee.lastName}' />"></td>
									</tr>
									<tr>
										<td>User Name :</td>
										<td><input type="text"
											placeholder="Please write your user name" name="user_name"
											class="form-control" required
											value="<c:out value='${employee.userName}' />"></td>
									</tr>
									<tr>
										<td>Address :</td>
										<td><input type="text"
											placeholder="Please write your address" name="address"
											class="form-control" required
											value="<c:out value='${employee.address}' />"></td>
									</tr>
									<tr class="contact">
										<td>Contact No :</td>
										<td><input type="number" id="document"
											placeholder="Please write your contact no" name="contact_no"
											class="form-control" required
											value="<c:out value='${employee.contactNo}' />"> <spna
												id="mobileError">Error mobile no.</spna></td>
									</tr>
									<tr>
										<td>
										<td><br>
											<button type="submit" class="submit">Submit</button>
											<button type="RESET" class="submit">Clear</button></td>
									</tr>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.1/jquery.min.js" ></script>

<script>
	$(document).ready(function() {
		$("#mobileError").hide();
		$("form").submit(function(e) {
			var a = $("#document").val();
			var filter = /^[0-9-+]+$/;
			if (filter.test(a)) {
				$("#mobileError").hide();
				return true;
			} else {
				$("#mobileError").show();
				return false;
			}
		});
	});
</script>
</html>