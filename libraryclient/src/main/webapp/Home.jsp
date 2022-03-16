<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<header>
		<div class="p-3 mb-2 bg-info">
			<h1>Header goes here</h1>
		</div>
	</header>
	
	<div class="p-3 mb-2">
		<div class="container mt-5">
			<div class="p-3 mb-2 bg-secondary text-white">
				<h2>Librarian Login</h2>
			</div>
			<br>
			<form action="login">
			
				<div class="form-group row">
					<label for="Username" class="col-sm-4 col-lg-3 col-form-label">User Id:</label> 
					<div class="col-sm-6 col-lg-5"><input type="text"
						class="form-control" id="username" aria-describedby="Userid"
						name="uid" placeholder="Enter UserId" required autocomplete="off">
					</div>
				</div>
				<div class="form-group row">
					<label for="InputPassword1" class="col-sm-4 col-lg-3 col-form-label">Password:</label> 
					<div class="col-sm-6 col-lg-5"><input type="password"
						class="form-control" id="InputPassword1"
						placeholder="Enter Password" name="password" required>
					</div>
				</div>
				<div class="text-center">
				<button type="submit" class="btn-sm"  >Login</button>
				</div>
			</form>
		</div>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
	<footer>
		<div class="p-3 mb-2 bg-info"><h5 align="center">Footer goes here</h5></div>
	</footer>
</body>
</html>