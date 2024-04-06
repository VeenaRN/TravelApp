<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<hr />
<h2 style="text-align: left">Welcome to : ${ename }</h2>

<hr />
<jsp:include page="emplinks.jsp"/>
<form method="post" action="cpwdinfo">
<p style="text-align:center">
<label>New Password </label>
<br/>
<input type="text" name="txtNew" placeholder="New Password"/>
<br/><br/>
<label>Confirm Password</label>
<br/>
<input type="text" name="txtConf" placeholder="Password"/>
<br/></br/>
<input type="submit" value="Change Password"/>

</p>
</form>
<hr/>
<h3 style="text-align:center"">${info }</h3>"
</body>
</html>