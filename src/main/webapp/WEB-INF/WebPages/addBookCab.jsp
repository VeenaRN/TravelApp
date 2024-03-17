<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Book Cab</title>
    <style>
        body {
            background-color: red;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        #container {
            background-color: #CFF1DD;
            width: 400px;
            margin: 50px auto;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h1 {
            text-align: center;
        }

        form {
            margin-top: 20px;
        }

        label {
            display: block;
            margin-bottom: 5px;
        }

        input[type="text"],
        input[type="tel"],
        input[type="date"],
        select {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            width: 20%;
            padding: 10px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        .alert {
            padding: 10px;
            margin-bottom: 15px;
            border-radius: 5px;
            background-color: #bae9c5;
            border: 1px solid #c3e6cb;
            color: #155724;
        }
    </style>
</head>
<body>

<jsp:include page="CustomerNavbar.jsp" />
<div id="container">
    <h1>Book Cab</h1>
    <hr/>

    <c:if test="${not empty successMessage}">
        <div class="alert alert-success" role="alert">
            ${successMessage}
        </div>
    </c:if>

    <form action="addBookCab" method="post" id="bookCabForm">
        <label for="date">Date:</label>
        <input type="date" id="date" name="date" required />
        <br>
        <label for="custname">Customer Name:</label>
        <input type="text" id="custname" name="custname" required />
        <br>
        <label for="phone">Phone:</label>
        <input type="tel" id="phone" name="phone" required />
        <br>
        
        
         
        <label for="fromloc">From Location:</label>
        <select id="fromloc" name="fromloc" onchange="populateToLocations()">
            <c:forEach var="cabFare" items="${farelist}">
                <option value="${cabFare.cid}">${cabFare.fromloc}</option> 
            </c:forEach>
        </select>
        <br>
        <label for="toloc">To Location:</label>
        <select id="toloc" name="toloc">
            <!-- Options will be dynamically populated -->
        </select>
        <br>
        
        <label for="fare">Fare:</label>
        <select id="fare" name="fare">
            <!-- Options will be dynamically populated -->
        </select>
        <br>
        <label for="vno">Vehicle Number:</label>
        <select id="vno" name="vno">
            <c:forEach var="vehicle" items="${vehicles}">
                <option value="${vehicle.vid}">${vehicle.name}</option> 
            </c:forEach>
        </select>
        <br><br>
        <input type="submit" value="Book" />
    </form> 
</div>

<script>
    function populateToLocations() {
        var fromLocId = document.getElementById("fromloc").value;
        var toLocDropdown = document.getElementById("toloc");
        toLocDropdown.innerHTML = ""; // Clear previous options
        
        // Iterate through farelist to find matching locations
        <c:forEach var="cabFare" items="${farelist}">
            if (${cabFare.cid} == fromLocId) {
                var option = document.createElement("option");
                option.text = "${cabFare.toloc}";
                option.value = "${cabFare.cid}";
                toLocDropdown.add(option);
            }
        </c:forEach>
        
        // After populating the "To Location" dropdown, update the fare dropdown
        updateFare();
    }
   
    function updateFare() {
        var fromLocId = document.getElementById("fromloc").value;
        var toLocId = document.getElementById("toloc").value;
        var fareDropdown = document.getElementById("fare");
        fareDropdown.innerHTML = ""; // Clear previous options
        
        // Iterate through farelist to find matching fare based on selected locations
        <c:forEach var="cabFare" items="${farelist}">
            if (${cabFare.cid} == fromLocId && ${cabFare.cid} == toLocId) {
                var option = document.createElement("option");
                option.text = "${cabFare.fare}";
                option.value = "${cabFare.cid}";
                fareDropdown.add(option);
            }
        </c:forEach>
    }
</script>

</body>
</html>
