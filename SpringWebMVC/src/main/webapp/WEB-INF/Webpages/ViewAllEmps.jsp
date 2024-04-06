<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List Page</title>

<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">Employees List</h2> 
    <table class="table table-bordered">
        <thead class="thead-dark">
            <tr>
                <th>Employee Number</th>
                <th>Employee Name</th>
                <th>Job</th>
                <th>Salary</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="emp" items="${empall}">
                <tr>
                    <td>${emp.empno}</td>
                    <td>${emp.ename}</td>
                    <td>${emp.job}</td>
                    <td>${emp.salary}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
