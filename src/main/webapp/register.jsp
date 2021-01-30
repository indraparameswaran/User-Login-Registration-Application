<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="Register">
<label> Enter First Name : </label>
<input type ="text" name="firstname"  required="required"/>
<br/>
<label> Enter Last Name : </label>
<input type ="text" name="lastname"  required="required"/>
<br/>
<label> Enter Username : </label>
<input type ="text" name="username"  required="required"/>
<br/>
<label> Enter Password : </label>
<input type ="password" name="password" required="required"/>
<br/>
<input type ="submit" value="Register"/>
</form>
</body>
</html>