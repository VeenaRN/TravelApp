<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>List Book Cabs</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color:  #f5f2c5;
            color: black;
        }
        .btn-delete {
            padding: 0.25rem 0.5rem;
            font-size: 0.875rem;
        }
        .btn-delete:hover {
            color: #fff;
        }
        .heading-bg {
            
            color: black;
            padding: 10px;
            margin-bottom: 20px;
        }
        .table-container {
            margin-top: 20px; /* Adjust the margin as needed */
        }
        .thead-bg-color {
            background-color: #f5f2c5; /* Background color for thead */
        }
    </style>
</head>
<body>
<jsp:include page="adminlinks.jsp"/>

<div class="container table-container">
    <div class="heading-bg">
        <h2 class="text-center">List Book Cabs</h2>
    </div>
    <table class="table table-sm">
        <thead class="thead-bg-color">
            <tr>
                <th>ID</th>
                <th>Date</th>
                <th>Customer Name</th>
                <th>Phone</th>
                <th>From Location</th>
                <th>To Location</th>
                <th>Fare</th>
                <th>Vehicle Name</th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="bookCab" items="${bookCabs}">
                <tr>
                    <td>${bookCab.bid}</td>
                    <td>${bookCab.date}</td>
                    <td>${bookCab.custname}</td>
                    <td>${bookCab.phone}</td>
                    <td>${bookCab.fromloc.fromloc}</td>
                    <td>${bookCab.toloc.toloc}</td>
                    <td>${bookCab.fare}</td>
                    <td>${bookCab.vno.name}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/deleteBookCab/${bookCab.bid}" class="btn btn-danger btn-delete btn-sm">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
