<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div id="header">
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">
                    <!-- <img alt="Brand" src="" style="width:100%;height:100%"/> -->
                    Brand
                </a>
            </div>

            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#" target="_self">课程<span class="sr-only">(current)</span> <span class="badge">4</span></a></li>
                    <li><a href="#" target="_self">计划</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Action</a></li>
                            <li><a href="#">Another action</a></li>
                            <li><a href="#">Something else here</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">Separated link</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">One more separated link</a></li>
                        </ul>
                    </li>
                </ul>
                <form class="navbar-form navbar-left" role="search">
                    <div class="form-group">
                        <input type="text" class="form-control " placeholder="Search">
                    </div>
                    <button type="submit" class="btn btn-default">查找</button>
                </form>
                <ul class="nav navbar-nav right">
                    <li class="active">
                        <!-- <i class="header-app-icon"></i> -->
                        登录<span class="sr-only"/>
                    </li>
                    <li><a href="#">注册</a></li>
                </ul>
            </div>

        </div><!-- /.container-fluid -->
    </nav>
</div>