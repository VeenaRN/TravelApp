<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Admin Dashboard</title>
<style>
body {
	background-image: url('images/tempimg.jpg');
	background-size: cover;
}

.content {
	color: black;
	text-align: center;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
}
</style>
</head>
<body>
	<jsp:include page="adminlinks.jsp" />
	<div class="container mt-4">
		<div class="content">
			<h2>Welcome Admin</h2>
			<p>Manage your cabs, bookings, customers.</p>
		</div>
	</div>
</body>
</html>
