<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5 d-flex justify-content-center">
    <h2>Add Employee</h2>
</div>
<div class="container mt-3 d-flex justify-content-center">
    <frm:form method="post" action="empreg" modelAttribute="emp">
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="empno">Employee Number</label>
                <frm:input type="text" path="empno" class="form-control"/>
            </div>
            <div class="form-group col-md-6">
                <label for="ename">Employee Name</label>
                <frm:input type="text" path="ename" class="form-control"/>
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="job">Employee Job</label>
                <frm:input type="text" path="job" class="form-control"/>
            </div>
            <div class="form-group col-md-6">
                <label for="salary">Employee Salary</label>
                <frm:input type="text" path="salary" class="form-control"/>
            </div>
        </div>
         <div class="text-center"> 
            <button type="submit" class="btn btn-success">Add</button>
            &nbsp;&nbsp;
             <a href="empall" class="btn btn-primary">View List</a>
            
        </div>
    </frm:form>
</div>


<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<div class="container mt-5 d-flex justify-content-center">
    <div>
        <h5>Employee Number: ${empinfo.empno}</h5>
        <h5>Employee Name: ${empinfo.ename}</h5>
        <h5>Job Role: ${empinfo.job}</h5>
        <h5>Salary: ${empinfo.salary}</h5>
    </div>
</div>
</body>
</html>
