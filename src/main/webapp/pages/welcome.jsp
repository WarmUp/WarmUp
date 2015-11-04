<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Weinuts</title>
    <link type="image/png" href="/images/icon.png" rel="icon">
</head>
<body>

    <h1>${message}</h1>

    <form id="loginDto" action="login.html" method="post">
        User Name:<input type="text" id="loginName" name="loginName"/>
        Password:<input type="password" id="loginPwd" name="loginPwd"/>
        <input type="submit" value="Submit">
    </form>

</body>
</html>
