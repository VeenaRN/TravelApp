<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Vehicles</title>
<style>
    body {
        background-color: #f0f0f0;
        font-family: Arial, sans-serif;
    }
    .container {
        width: 80%;
        margin: 20px auto;
    }
    h1 {
        text-align: center;
        color: #333;
    }
    table {
        width: 100%;
        border-collapse: collapse;
        border-radius: 10px;
        overflow: hidden;
        border: 1px solid #ccc; 
    }
    th, td {
        padding: 10px;
        text-align: left;
    }
    th {
        background-color: #f5f2c5;
        color:black;
    }
    tr:nth-child(even) {
        background-color: #f2f2f2;
    }
    .add-button {
        display: block;
        width: fit-content;
        padding: 10px 20px;
        text-align: center;
        margin:20px auto;
        background-color: #225e39;
        color: white;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        text-decoration: none;
    }
    .delete-button, .edit-button {
        display: inline-block;
        padding: 5px 10px; 
        margin: 0 5px; 
        border-radius: 5px;
        text-decoration: none;
        font-size: 12px; 
    }
    .delete-button {
        background-color: #dc3545; 
        color: white;
    }
    .edit-button {
        background-color: #28a745; 
        color: white;
    }
    .delete-button:hover, .edit-button:hover {
        opacity: 0.8; 
    }
    .add-button:hover {
        background-color: #179434;
    }
</style>
</head>
<body>
<jsp:include page="adminlinks.jsp"/>
<hr />
<div class="container">
    <h1>All Vehicles</h1>
    <br>
    <table>
        <thead>
            <tr>
                <th>Vehicle Id</th>
                <th>Vehicle Name</th>
                <th>Vehicle Number</th>
                <th>Owner Name</th>
                <th>Seating</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="vehicle" items="${vehiclelist}">
                <tr>
                    <td>${vehicle.vid}</td>
                    <td>${vehicle.name}</td>
                    <td>${vehicle.number}</td>
                    <td>${vehicle.ownname}</td>
                    <td>${vehicle.seating}</td>
                    <td>
                        <a href="editvehicle/${vehicle.vid}" class="edit-button" >Edit</a>
                        <a href="delvehicle/${vehicle.vid}" class="delete-button">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="newvehicle" class="add-button">Add Vehicle</a>
</div>
</body>
</html>
