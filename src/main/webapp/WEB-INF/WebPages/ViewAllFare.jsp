<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Fares</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f5f2c5;
        color: #333;
    }
    .container {
        width: 80%;
        margin: 0 auto;
        padding: 20px;
    }
    h1 {
        text-align: center;
    }
    table {
        width: 100%;
        border-collapse: collapse;
        margin-top: 20px;
        border-radius: 10px; 
        overflow: hidden; 
    }
    th, td {
        padding: 10px;
        border: 1px solid #ccc;
        text-align: left;
    }
    th {
        background-color:  #f5f2c5; 
        color: black; 
    }
    a.button {
        display: block;
        width: fit-content;
        margin: 20px auto;
        padding: 10px 20px;
        background-color: #225e39;
        color: #fff;
        text-decoration: none;
        border-radius: 5px;
        text-align: center;
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
    a.button:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
<jsp:include page="adminlinks.jsp"/>
<hr />
<div class="container">
    <h1>All Fares</h1>
    <table>
        <tr>
            <th>Fare Id</th>
            <th>From</th>
            <th>To</th>
            <th>Fare</th>
            <th>Operations</th>
        </tr>
        <c:forEach var="fare" items="${farelist}">
            <tr>
                <td>${fare.cid}</td>
                <td>${fare.fromloc}</td>
                <td>${fare.toloc}</td>
                <td>${fare.fare}</td>
                <td>
                   
                    <a href="editfare/${fare.cid}" class="edit-button" >Edit</a>
                     <a href="delfare/${fare.cid}" class="delete-button" >Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <a href="newfare" class="button">New Fare</a>
</div>
</body>
</html>
