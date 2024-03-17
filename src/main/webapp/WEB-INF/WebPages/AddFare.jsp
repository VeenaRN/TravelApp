<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Fare</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<style>
    body {
        background-color: black; /* Set background color */
    }
    .container {
        background-color: #ffffff; /* Set background color */
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1); /* Add shadow */
        max-width: 40%; /* Set maximum width */
        margin: 0 auto; /* Center horizontally */
    }
    .form-header {
        color: black; /* Set color of the header */
        background-color: #f5f2c5; /* Set background color of the header */
        padding: 10px;
        border-top-left-radius: 5px;
        border-top-right-radius: 5px;
    }
  
</style>
</head>
<body>
<jsp:include page="adminlinks.jsp"/>
<hr />

<div class="container">
    <h1 class="form-header mb-4 text-center">New Fare</h1>
    <hr/>

    <form method="post" action="newfareinfo" modelAttribute="fare" id="fareForm"> 
        <label>From:</label>
        <input class="form-control" type="text" name="fromloc" placeholder="From" required />
        <br /><br />
        <label>To:</label>
        <input class="form-control" type="text" name="toloc" placeholder="To" required />
        <br /><br />

        <label>Fare:</label>
        <input class="form-control" type="text" name="fare" placeholder="Fare" required />
        <br /><br />
        
       <input type="submit" class="btn btn-success btn-sm" value="Add Fare">
       
        
    </form>
</div>

<script>
    document.getElementById('fareForm').addEventListener('submit', function(event) {
        var form = event.target;
        if (!form.checkValidity()) {
            event.preventDefault();
            event.stopPropagation();
        }
        form.classList.add('was-validated');
    });
</script>

</body>
</html>
