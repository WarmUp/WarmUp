<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="resource.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<body id="index">
<script type="text/javascript" >
    $().ready(function(){
        alert("welcome to the ping pong battle.");
    })
</script>

<jsp:include page="header.jsp"/>
<%--
<jsp:include page="gbanner.jsp"/>
<jsp:include page="characters.jsp"/>
<jsp:include page="intro.jsp"/>
--%>
<jsp:include page="icourse.jsp"/>
<jsp:include page="footer.jsp"/>
</body>
