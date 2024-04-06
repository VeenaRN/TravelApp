<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align: center">Login Here</h1>

<hr/>
<form method="post" action="logininfo">
<p style="text-align:center">
<label>User Name/Email</label>
<br/>
<input type="text" name="txtUser" placeholder="Username/Email"/>
<br/><br/>
<label>Password</label>
<br/>
<input type="text" name="txtPass" placeholder="Password"/>
<br/></br/>
<input type="submit" value="Login"/>

</p>
</form>
<hr/>
<h2 style="text-align:center">${info}</h2>
</body>
</html>