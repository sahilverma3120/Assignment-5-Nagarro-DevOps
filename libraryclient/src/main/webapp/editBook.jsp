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
			<h2 align="right">
				Welcome User
				<button class="btn btn-primary btn-md "
					onclick="location.href='index.jsp';">Logout</button>
			</h2>
		</div>

</header>
	<div class="p-3 mb-2">
		<div class="container mt-5">
				<h2 align="center">Edit Book Details</h2>
			<form action="edit">
				<div class="form-group row">
					<label for="bcode" class="col-sm-4 col-lg-3 col-form-label">Book Code</label>
					<div class="col-sm-6 col-lg-5">
					 <input type="text"
						class="form-control" id="bcode" aria-describedby="bcode"
						name="bcode" value='<%=request.getParameter("bookcode")%>'>
				</div>
				</div>
				<div class="form-group row">
					<label for="bname" class="col-sm-4 col-lg-3 col-form-label">Book Name</label> 
					<div class="col-sm-6 col-lg-5">
					<input type="text"
						class="form-control" id="bname"
						value='<%=request.getParameter("bookname")%>' name="bname">
				</div>
				</div>
				<div class="form-group row">
					<label for="author" class="col-sm-4 col-lg-3 col-form-label">Author</label>
					<div class="input-group mb-3 col-sm-6 col-lg-5">
						<select class="custom-select" id="inputGroupSelect02"
							name='select'required>
							<option selected>Choose Author</option>
							<option value="Robert Cecil">Robert Cecil</option>
							<option value="Andy Hunt">Andy Hunt</option>
							<option value="Erich Gamma">Erich Gamma</option>
							<option value="E.M.Forste">E.M.Forster</option>
						</select>
					</div>
				</div>
				<div class="form-group row">
					<label for="date" class="col-sm-4 col-lg-3 col-form-label">Added On</label> 
					<div class="col-sm-6 col-lg-5">
					<input type="text"
						class="form-control" id="date" aria-describedby="date" name="date"
						value='<%=request.getParameter("adddate")%>'>
				</div>
				</div>
				<button type="submit" class="btn btn-primary">Submit</button>
				<button type="reset" class="btn btn-danger">Cancel</button>
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
		<div class="p-3 mt-2 bg-info"><h5 align="center">Footer goes here</h5></div>
	</footer>
</body>
</html>

