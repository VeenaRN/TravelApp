<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Participants Management Application</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
	
	
	<style>
    body {
        background-image:url("../images/5094386.jpg"); /* Replace 'path_to_your_image.jpg' with the actual path to your image */
        background-size: cover;
        background-repeat: no-repeat;
        background-attachment: fixed;
        margin:0;
        padding:0;
    }
</style>
</head>
<body>
<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: blue">
			<div>
				<a href="https://www.xadmin.net" class="navbar-brand"> Participant Management Application </a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Participants</a></li>
			</ul>
			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/batches"
					class="nav-link">Batches</a></li>
			</ul>
			<ul class="navbar-nav">
            <li><a href="<%=request.getContextPath()%>/Login.jsp"
                class="nav-link">Logout</a></li>
        </ul>
			
			
			
		</nav>
	</header>
	
<h2>Welcome</h2>
</body>
</html>