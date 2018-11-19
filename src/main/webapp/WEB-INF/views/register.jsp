<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Create an account for the Task Manager</title>

<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/cosmo/bootstrap.min.css" rel="stylesheet">
<link href="login.css" rel="stylesheet">
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<!-- All the files that are required -->
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<link href='http://fonts.googleapis.com/css?family=Varela+Round'
	rel='stylesheet' type='text/css'>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.13.1/jquery.validate.min.js"></script>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<link href="login.css" rel="stylesheet">


</head>
<body>


	<nav class="navbar navbar-light bg-light float-right">
		<a href="register" class="navbar-brand">Register</a> <a
			href="tasklist" class="navbar-brand">Task Manager</a> 
			<a href = "signin" class="navbar-brand">Sign In</a>
		<form class="form-inline"></form>
	</nav>

	<!-- REGISTRATION FORM -->
	<div class="text-center" style="padding: 50px 0">
		<div class="logo">register</div>
		<!-- Main Form -->
		<div class="login-form-1">
			<form action="signup" id="register-form" class="text-left">
				<div class="login-form-main-message"></div>
				<div class="main-login-form">
					<div class="login-group">

						<div class="form-group">
							ID: ${userid} <input type="hidden" name="userid" value="${userid}">
						</div>
						<div class="form-group">
							<div class="form-group">
								<label for="uname" class="sr-only">Full Name</label> <input
									type="text" class="form-control" id="reg_fullname" name="uname"
									placeholder="full name">
							</div>

							<label for="uemail" class="sr-only">Email address</label> <input
								type="text" class="form-control" id="reg_username" name="uemail"
								placeholder="email address">
						</div>
						<div class="form-group">
							<label for="upassword" class="sr-only">Password</label> <input
								type="password" class="form-control" id="reg_password"
								name="upassword" placeholder="password">
						</div>
						<div class="form-group">
							<label for="reg_password_confirm" class="sr-only">Password
								Confirm</label> <input type="password" class="form-control"
								id="reg_password_confirm" name="reg_password_confirm"
								placeholder="confirm password">
						</div>


						<div class="form-group login-group-checkbox">
							<input type="checkbox" class="" id="reg_agree" name="reg_agree">
							<label for="reg_agree">i agree with <a href="#">terms</a></label>
						</div>
					</div>
					<button type="submit" class="login-button">
						<i class="fa fa-chevron-right"></i>
					</button>
				</div>
				<div class="etc-login-form">
					<p>
						already have an account? <a href="signin">login here</a>
					</p>
				</div>
			</form>
		</div>
		<!-- end:Main Form -->
	</div>







	<!--   <div class = "container">
<h1>Sign up to use the Task Manager</h1>
<form action = "signup">
ID: ${userid} <input type ="hidden" name = "userid" value ="${id}">
Name: <input type = "text" name = "uname" placeholder = "Name"> <br>
Email: <input type = "text" name = "uemail" placeholder = "Email Address"><br>
Password:  <input type = "text" name = "upassword"><br>
<input type = "submit" class = "btn btn-primary" value = "register">
</form>
</div> -->

</body>
</html>