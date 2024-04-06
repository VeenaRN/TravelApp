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
<h1 style="text-align: center">Search Employee</h1>

<hr/>
<form method="post" action="sempinfo">
<p style="text-align:center">
<label>Employee Number</label>
<input type="text" name="txtEmpno" placeholder="Employee Number"/>
<input type="submit" value="Search Emp"/>

</p>
</form>

<hr/>
<c:if test="${einfo!=null}">
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
</c:if>
<c:if test="${einfo==null}">
<h3 style="text-align:center">${info }</h3>
</c:if>
</body>
</html>