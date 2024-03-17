<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Vehicle</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<style>
    body {
        background-color: #f0f0f0;
        font-family: Arial, sans-serif;
    }
    .container {
        width: 50%;
        margin: 20px auto;
        background-color: #ffffff;
        border-radius: 10px;
        padding: 20px;
        box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
    }
    .form-header {
        background-color: #f5f2c5;
        color: black;
        padding: 10px;
        border-top-left-radius: 10px;
        border-top-right-radius: 10px;
        margin-bottom: 20px;
    }
    
    .form-control {
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
</style>
</head>
<body>
<jsp:include page="adminlinks.jsp"/>
<hr />
<div class="container">
    <div class="form-header">
        <h1>New Vehicle</h1>
    </div>
    <frm:form method="post" action="newvehicleinfo" modelAttribute="vehicle" id="vehicleForm"> 
        <div>
            <label>Vehicle Name:</label>
            <frm:input class="form-control" type="text" path="name" placeholder="Name" required="true" />
            <label>Vehicle Number:</label>
            <frm:input class="form-control" type="text" path="number" placeholder="number" required="true"  />
            <label>Owner Name:</label>
            <frm:input class="form-control" type="text" path="ownname" placeholder="Owner" required="true" />
            <label>Seating:</label>
            <frm:input class="form-control" type="text" path="seating" placeholder="Seats" required="true" pattern="[0-9]+" title="Please enter a valid number of seats" />
            <input type="submit" class="btn btn-success btn-sm" value="Add Vehicle" />
            <br/>
            <h3>${info }</h3>
        </div>
    </frm:form>
</div>

<script>
    document.getElementById('vehicleForm').addEventListener('submit', function(event) {
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
