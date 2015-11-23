<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Weinuts Login Page</title>
    </head>
    <body>
        <form action="auth/login.html" method="post">
            User Name:<input type="text" id="userName" name="loginName">
            Password:<input type="password" id="password" name="loginPwd">
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
