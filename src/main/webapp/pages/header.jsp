<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<div id="header">

    <div id="nav" class="page-container" >
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">
                <!-- Brand <img alt="Brand" src="" style="width:100%;height:100%"/> -->

                <img src="<%=basePath%>/images/backgrounds/landing-page-interim.jpg" alt="" style="height: 30px;width: 20px">
            </a>
            <!-- <div id="logo" class="logo"><a href="#" target="_self" class="hide-text">慕课网</a></div> -->
        </div>

        <div class="g-menu-mini">
            <ul class="nav-item">
                <li class="active"><a href="#">课程 <span class="badge">4</span></a></li>
                <li><a href="#">计划</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">问答<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">4</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">5</a></li>
                    </ul>
                </li>
            </ul>
        </div>
        <form class="navbar-form navbar-left" role="search">
            <div class="form-group">
                <input type="text" class="form-control " placeholder="Search">
            </div>
            <button type="submit" class="btn btn-default">查找</button>
        </form>
        <ul class="nav-item navbar-right">
            <li class="active">
                <!-- <i class="header-app-icon"></i>   -->
                <a href="#" data-toggle="modal" data-target="#myModal">登录<span class="sr-only">(current)</span></a>
                <button  class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">登录</button>
            </li>
            <li><a href="#">注册</a></li>
        </ul>
    </div>


    <div id="myModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">登录界面</h4>
                </div>
                <div class="modal-body">
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
              </div>
        </div>
    </div>


</div>



