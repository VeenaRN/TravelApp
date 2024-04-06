<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="adminlinks.jsp"/>
<hr/>


<h1 style="text-align: center">All Employees</h1>
<hr/>
<table width="100%" border="1">
<tr>
<th>Employee Number</th>
<th>Employee Name</th>
<th>Employee Job</th>
<th>Employee Email</th>
<th>Employee Password</th>
<th>Operations</th>
</tr>

<c:forEach  var = "emp"  items="${emplist }">
<tr>
	<td>${emp.empno }</td>
	<td>${emp.empname }</td>
	<td>${emp.job }</td>
	<td>${emp.email }</td>
	<td>${emp.pswd }</td>
	<td>
	<a href="delemp/${emp.empno}" >Delete</a>
	</td>
</tr>
</c:forEach>
</table>
</body>
</html>