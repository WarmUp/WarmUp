<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="<%=basePath%>/images/icon.png">
<title>Signin Template for Bootstrap</title>
<script type="text/javascript" charset="utf-8" src="<%=basePath%>js/jquery.js"></script>
<script type="text/javascript" charset="utf-8" async="" src="<%=basePath%>bootstrap/js/bootstrap.js"></script>
<!-- <script type="text/javascript" charset="utf-8" async="" src="<%=basePath%>bootstrap/js/bootstrap.min.js"></script>    -->
<script type="text/javascript" charset="utf-8" async="" src="<%=basePath%>bootstrap/js/npm.js"></script>
<!-- Bootstrap core CSS -->
<!-- <link href="<%=basePath%>bootstrap/css/bootstrap.min.css" rel="stylesheet">  -->
<link href="<%=basePath%>bootstrap/css/bootstrap.css" rel="stylesheet">
<link href="<%=basePath%>bootstrap/css/bootstrap-theme.css" rel="stylesheet">
<link href="<%=basePath%>bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
<!-- Custom styles for this template   -->
<link href="<%=basePath%>css/warmupCss/signin.css" rel="stylesheet">
<link href="<%=basePath%>css/warmupCss/static-copy.css" rel="stylesheet">
<link href="<%=basePath%>css/warmupCss/bb-copy.css" rel="stylesheet">


<link href="<%=basePath%>css/warmupCss/self.css" rel="stylesheet">
</head>



