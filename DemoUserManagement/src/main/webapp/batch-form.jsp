<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
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
    /* Add custom styles here */
    body {
        background-color:rgb(147, 175, 214); /* Light gray background */
    }

    .card {
        margin-top: 20px; /* Add margin to the card */
        background-color: #fff; /* White background */
        border-radius: 10px; /* Rounded corners */
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* Box shadow */
    }

    .card-body {
        padding: 20px; /* Add padding to the card body */
    }

    .form-group {
        margin-bottom: 20px; /* Add margin between form groups */
    }

    button[type="submit"] {
        background-color: #007bff; /* Blue submit button */
        color: #fff; /* White text */
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
<br>
<div class="container col-md-5">
    <div class="card">
        <div class="card-body">
            <c:if test="${batch != null}">
                <form action="update" method="post">
            </c:if>
            <c:if test="${batch == null}">
                <form action="insert" method="post">
            </c:if>

            <caption>
                <h2>
                    <c:if test="${batch != null}">
                        Edit Batch
                    </c:if>
                    <c:if test="${batch == null}">
                        Add New Batch
                    </c:if>
                </h2>
            </caption>
  
            <c:if test="${batch != null}">
                <input type="hidden" name="id" value="<c:out value='${batch.id}' />" />
            </c:if>
           
            <!--  
             <fieldset class="form-group">
                <label>Batch ID</label> <input type="text"
                    value="<c:out value='${batch.id}' />" class="form-control"
                    name="batch_name" required="required">
            </fieldset>
-->
            <fieldset class="form-group">
                <label>Batch Name</label> <input type="text"
                    value="<c:out value='${batch.batch_name}' />" class="form-control"
                    name="batch_name" required="required">
            </fieldset>
            <fieldset class="form-group">
                <label>Session Time</label> <input type="text"
                    value="<c:out value='${batch.session_time}' />" class="form-control"
                    name="session_time" required="required">
            </fieldset>
           
            
            <fieldset class="form-group">
                <label>Session Type</label> <input type="text"
                    value="<c:out value='${batch.session_type}' />" class="form-control"
                    name="session_type" required="required">
            </fieldset>
            
            
            
            

            <fieldset class="form-group">
                <label>Instructor</label> <input type="text"
                    value="<c:out value='${batch.instructor}' />" class="form-control"
                    name="instructor">
            </fieldset>
            
            <fieldset class="form-group">
                <label>Location</label> <input type="text"
                    value="<c:out value='${batch.location}' />" class="form-control"
                    name="location">
            </fieldset>

            
            

            <button type="submit" class="btn btn-success">Save</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
