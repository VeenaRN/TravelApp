<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="logProcess">
<style="txt-align:center">
<input type="text" name="txtUser" placeholder="Username"/>
<br/>
<input type="text" name="txtPassword" placeholder="Password"/>
<br/>
<input type="submit" value="Login"/>

</form>

<h2>${info}</h2>
</body>
</html>