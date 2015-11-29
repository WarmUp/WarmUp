<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div id="courseList" style="padding-left:15px;padding-top: 20px">
    <div class="row">
        <div class="col-xs-3 col-md-3">
            <div class="thumbnail">
                <div class="caption">
                    <a href="#"><img src="<%=basePath%>img/java.jpg" alt="..." border="1px"></a>
                    <BR/>
                    <h3>JAVA Course label</h3>
                    <BR/>
                    <p>JAVA course description...</p>
                    <BR/>
                    <p>
                        <a href="#" class="btn btn-primary" role="button">购买</a>
                        <a href="#" class="btn btn-default" role="button">了解更多</a>
                    </p>
                </div>
            </div>
        </div>

        <div class="col-xs-6 col-md-3">
            <a href="#" class="thumbnail">
                <img src="<%=basePath%>img/java.jpg" alt="...">
            </a>
        </div>

        <div class="col-xs-6 col-md-3">
            <a href="#" class="thumbnail">
                <img src="<%=basePath%>img/03-rockets.png" alt="...">
            </a>
        </div>
    </div>

</div>

<!--
<div class="icourse">
    <div class="incourse-wrap idx-width">
        <h2 class="icourse-title hide-text">课程</h2>
        <ul class="icourse-course clearfix">
            <li>
                <a href="http://www.imooc.com/view/528">
                    <div class="icourse-img">
                        <img src="1.jpg" alt="">
                    </div>
                    <div class="icourse-intro clearfix">
                        <p>快速搭建，先睹为快。</p>
            <span class="l icourse-new">
                              更新至4-2
                          </span>
            <span class="r">
              课程时长： 2小时 7分
            </span>
                    </div>
                    <div class="icourse-tips clearfix">
                        <h2>MongoDB复制集—快速搭建复制集</h2>
                        <span class="l icourse-new">35分钟前更新</span>
                        <span class="r">893人学习</span>
                    </div>
                </a>
            </li>
            <li>
                <a href="http://www.imooc.com/view/547">
                    <div class="icourse-img">
                        <img src="2.jpg" alt="">
                    </div>
                    <div class="icourse-intro clearfix">
                        <p>使用wordpress搭建博客系统。</p>
            <span class="l icourse-new">
                              更新至3-5
                          </span>
            <span class="r">
              课程时长：47分
            </span>
                    </div>
                    <div class="icourse-tips clearfix">
                        <h2>使用wordpress极速建站</h2>
                        <span class="l icourse-new">35分钟前更新</span>
                        <span class="r">5886人学习</span>
                    </div>
                </a>
            </li>
        </ul>
        <div class="icourse-footer">
            <a href="http://www.imooc.com/course/list">全部课程</a>
        </div>
    </div>
</div>
-->