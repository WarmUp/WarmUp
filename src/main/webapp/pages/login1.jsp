<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
    <jsp:include page="resource.jsp"/>
</head>

<body id="index">



<jsp:include page="header.jsp"/>
<%--
<jsp:include page="gbanner.jsp"/>
<jsp:include page="characters.jsp"/>
<jsp:include page="intro.jsp"/>
--%>

<jsp:include page="icourse.jsp"/>
<jsp:include page="footer.jsp"/>
<%-- --%>

</body>
</html>