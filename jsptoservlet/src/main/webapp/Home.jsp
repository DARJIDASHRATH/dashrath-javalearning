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
    }
    </style>
</head>

<body class="full-form">
	<section class="vh-100 gradient-custom">
		<div class="container py-5 h-100">
			<div class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-12 col-md-8 col-lg-6 col-xl-5">
					<div class="card bg-dark text-white" style="border-radius: 1rem;">
						<div class="card-body p-5 text-center">
							<div class="mb-md-5 mt-md-4 pb-5">
								<header>
									<h2 class="head">Employee Register Form</h2><br>
									<a href="<%=request.getContextPath()%>/list"> </a>
								</header>						
									<form action="${redirection}" method="get">				
								<table class="w-100">
									<tr>
										<td>First Name :</td>
										<td><c:if test="${employee != null}">
												<input type="hidden" name="id"
													value="<c:out value='${employee.id}' />" />
											</c:if> <input type="text" pattern="[a-zA-Z^\s]+"
 											placeholder="E.g. Dashrath" name="first_name"
											class="form-control" required
											value="<c:out value='${employee.firstName}' />"></td>
									</tr>
									<tr>
										<td>Last Name :</td>
										<td><input type="text" pattern="[a-zA-Z^\s]+" 
											placeholder="E.g. Darji" name="last_name"
											class="form-control" required
											value="<c:out value='${employee.lastName}' />"></td>
									</tr>
									<tr>
										<td>User Name :</td>
										<td><input type="text" 
											placeholder="E.g. DashrathDarji" name="user_name"
											class="form-control" required
											value="<c:out value='${employee.userName}' />"></td>
									</tr>
									<tr>
										<td>Address :</td>
										<td><input type="text"
											placeholder="E.g. Ahmedabad" name="address"
											class="form-control" required
											value="<c:out value='${employee.address}' />"></td>
									</tr>
									<tr class="contact">
										<td>Contact No :</td>
										<td><input type="tel"  id="document" onkeydown="return checkPhoneKey(event.key)"
											placeholder="E.g. 9662325594" name="contact_no"
											class="form-control" required 
											value="<c:out value='${employee.contactNo}' />"> </td>
									</tr>
									<tr>
										<td>
										<td><br>
											<button type="submit" class="submit">Submit</button>
											<button type="RESET" class="submit">Clear</button></td>
									</tr>
								</table>
								</form>						
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
function checkPhoneKey(key) {
	  return (key >= '0' && key <= '9') ||
	    ['+','(',')','-','ArrowLeft','ArrowRight','Delete','Backspace',' '].includes(key);
	}
</script>
</html>