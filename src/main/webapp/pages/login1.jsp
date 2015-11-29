<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="resource.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<body id="index" style="display:none;">
<script type="text/javascript" >
    $(document).ready(function(){
        $('#index').fadeIn(3000);
    });

    function loadPage(id, url) {
        $("#"+id).addClass("loader");
        $("#"+id).append("Loading......");
        $.ajax({
            type: "get",
            url: url,
            cache: false,  
            error: function() {alert('加载页面' + url + '时出错！');},
            success: function(msg) {
                $("#"+id).empty().append(msg);
                $("#"+id).removeClass("loader");
            }
        });
    }

    $('.carousel').carousel({
      interval: 2000
    });
</script>



<jsp:include page="header.jsp"/>
<%--
<jsp:include page="gbanner.jsp"/>
<jsp:include page="characters.jsp"/>
<jsp:include page="intro.jsp"/>
--%>
<div id="switch_content">
<jsp:include page="icourse.jsp"/>
</div>
<jsp:include page="footer.jsp"/>

</body>
