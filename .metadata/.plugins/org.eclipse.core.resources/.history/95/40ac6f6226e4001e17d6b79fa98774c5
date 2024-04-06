<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Vehicle</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<style>
    body {
        font-family: Arial, sans-serif;
    }
    .container {
        width: 50%;
        margin: 20px auto;
    }
    form {
        margin-top: 20px;
    }
    input[type="text"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 15px;
        border: 1px solid #ced4da;
        border-radius: 5px;
    }
    input[type="submit"] {
        display: block;
        margin: 0 auto;
        width: fit-content;
    }
    .btn-success {
        display: block;
        margin: 20px auto 0;
    }
</style>
</head>

<body>
<jsp:include page="adminlinks.jsp"/>

<div class="container">
    <h1 style="text-align: center">Edit Vehicle</h1>
    <form action="${pageContext.request.contextPath}/editvehicle" method="post">
        <input type="hidden" name="vid" value="${vehicle.vid}">
        
        <label for="name">Name</label>
        <input type="text" id="name" name="name" value="${vehicle.name}">
        
        <label for="number">Number:</label>
        <input type="text" id="number" name="number" value="${vehicle.number}">
        
        <label for="ownname">Owner:</label>
        <input type="text" id="ownname" name="ownname" value="${vehicle.ownname}">
        
        <label for="seating">Seating:</label>
        <input type="text" id="seating" name="seating" value="${vehicle.seating}">
        
        <input type="submit" class="btn btn-success" value="Update">
    </form>
</div>
</body>
</html>
