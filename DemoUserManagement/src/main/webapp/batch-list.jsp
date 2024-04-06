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
			<h3 class="text-center">List of Batches</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/new1" class="btn btn-success">Add
					New Batch</a>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>Batch Name</th>
						<th>Batch Time</th>
						<th>Batch Type</th>
						<th>Instructor</th>
						<th>Location</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
				
			
	
				
	<c:forEach var="batch" items="${listBatch}">

	<tr>
    <td><c:out value="${batch.id}" /></td>
    <td><c:out value="${batch.batch_name}" /></td>
    <td><c:out value="${batch.session_time}" /></td>
   <td><c:out value="${batch.session_type}" /></td>
    <td><c:out value="${batch.instructor}" /></td>
    <td><c:out value="${batch.location }" /></td>
    
    <td>
       <a href="edit1?id=<c:out value='${batch.id}'/>">Edit</a>
       
        &nbsp;&nbsp;&nbsp;&nbsp; 
        <a href="delete?id=${batch.id}">Delete</a>
    </td>
</tr>
					</c:forEach>
		
				</tbody>

			</table>
		</div>
	</div>
</body>
</html>