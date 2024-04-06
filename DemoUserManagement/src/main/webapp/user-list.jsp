<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Participant Management Application</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: blue">
			<div>
				<a href="#" class="navbar-brand">Participant
					Management Application </a>
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
	<br>

	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center">List of Participants</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/newuser" class="btn btn-success">Add
					New User</a>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Age</th>
						<th>Email</th>
						<th>Phone</th>
						<th>Batch ID</th>
						<th>Address</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
				
<c:forEach var="user" items="${listUser}">

<tr>
    <td><c:out value="${user.participant_id}" /></td>
    <td><c:out value="${user.name}" /></td>
    <td><c:out value="${user.age}" /></td>
    <td><c:out value="${user.email}" /></td>
    <td><c:out value="${user.phone}" /></td>
    <td><c:out value="${user.batchid}" /></td>
    
   <td><c:out value="${user.address}" /></td>
    <td>
         <a href="edituser?participant_id=<c:out value='${user.participant_id}'/>">Edit</a>
        &nbsp;&nbsp;&nbsp;&nbsp; 
        <a href="deleteuser?participant_id=${user.participant_id}">Delete</a>
    </td>
</tr>
					</c:forEach>
		
				</tbody>

			</table>
		</div>
	</div>
</body>
</html>