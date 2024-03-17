<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Cab Fare</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f0f0f0; /* Simplified background color */
        color: #333; /* Adjusted text color for better readability */
    }
    .container {
        width: 50%;
        margin: 0 auto;
        padding: 20px;
        background-color: #fff; /* Solid white background */
        border-radius: 5px;
        margin-top: 20px;
    }
    h1 {
        text-align: center;
    }
    form {
        width: 100%;
    }
    label {
        display: block;
        margin-bottom: 5px;
    }
    input[type="text"],
    input[type="number"] {
        width: calc(100% - 22px); /* Adjusted width to account for border */
        padding: 10px;
        margin-bottom: 10px;
        border: 1px solid #ccc; /* Added border */
        border-radius: 5px;
    }
    input[type="submit"] {
        width: 100px; /* Width of the button */
        margin: 0 auto; /* Centering the button */
        display: block;
        padding: 10px;
        background-color: darkgreen; /* Dark green color */
        color: #fff;
        border: none;
        border-radius: 5px;
        cursor: pointer;
    }
    input[type="submit"]:hover {
        background-color: #006400; /* Dark green color on hover */
    }
</style>
</head>
<body>
<jsp:include page="adminlinks.jsp"/>
<hr />
<h1>Edit Cab Fare</h1>
<div class="container">
    <form action="${pageContext.request.contextPath}/editfare" method="post">
        <input type="hidden" name="cid" value="${fare.cid}">
        <label for="fromloc">From:</label>
        <input type="text" id="fromloc" name="fromloc" value="${fare.fromloc}">
        <label for="toloc">To:</label>
        <input type="text" id="toloc" name="toloc" value="${fare.toloc}">
        <label for="fare">Fare:</label>
        <input type="number" id="fare" name="fare" value="${fare.fare}">
        <input type="submit" value="Update">
    </form>
</div>
</body>
</html>
