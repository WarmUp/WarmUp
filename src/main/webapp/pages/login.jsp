<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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
        <c:if test="${errors.fieldErrorCount > 0}">
            字段错误：<br/>
            <c:forEach items="${errors.fieldErrors}" var="error">
                <spring:message var="message" code="${error.code}" arguments="${error.arguments}" text="${error.defaultMessage}"/>
                ${error.field}------${message}<br/>
            </c:forEach>
        </c:if>
    </body>
</html>
