<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="emplinks.jsp"/>

<hr />
<h2 style="text-align: left">Welcome to : ${einfo.empname }</h2>

<hr />

<hr />
<table width="100%" border="1">
<tr>
<th>Employee Number</th>
<th>Employee Name</th>
<th>Employee Job</th>
<th>Employee Email</th>
<th>Employee Password</th>
</tr>
<tr>
<td>${einfo.empno }</td>
<td>${einfo.empname }</td>
<td>${einfo.job }</td>
<td>${einfo.email }</td>
<td>${einfo.pswd }</td>
</tr>
</table>

</body>
</html>