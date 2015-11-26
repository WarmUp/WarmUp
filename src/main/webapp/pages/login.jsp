<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>

    </head>
    <body id="index">
        <jsp:include page="header.jsp"/>

        <div class="container">
            <form class="form-signin" action="auth/login.html">
                <h2 class="form-signin-heading">Please sign in</h2>
                <label for="inputUserName" class="sr-only">User Name</label>
                <input type="text" id="inputUserName" class="form-control" placeholder="User Name" name="loginName" required autofocus >
                <label for="inputPassword" class="sr-only">Password</label>
                <input type="password" id="inputPassword" class="form-control" placeholder="Password" name="loginPwd" required>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" value="remember-me"> Remember me
                    </label>
                </div>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
            </form>
            <div class="has-error">
                <c:if test="${errors.fieldErrorCount > 0}">
                    <br/>
                    <c:forEach items="${errors.fieldErrors}" var="error">
                        <spring:message var="message" code="${error.code}" arguments="${error.arguments}" text="${error.defaultMessage}"/>
                        <label for="inputPassword">{error.field}------${message}</label><br/>
                    </c:forEach>
                </c:if>
            </div>
        </div>

        <jsp:include page="footer.jsp"/>
    </body>
</html>
