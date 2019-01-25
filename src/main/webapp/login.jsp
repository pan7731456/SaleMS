<%--
  Created by IntelliJ IDEA.
  User: pan
  Date: 2019/1/4
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>登陆</title>

    <!-- 先引入重置的CSS样式文件 -->
    <link rel="stylesheet" href="css/reset.css">

    <!-- 引入字体图标的css文件 -->
    <link rel="stylesheet" href="css/iconfont.css">

    <!-- 引入当前页面的CSS文件 -->
    <link rel="stylesheet" href="css/index.css">

    <style type="text/css">
        *{padding:0px;margin:0px;}
        body{font-family:Arial, Helvetica, sans-serif;background:url(images/login) no-repeat 50% 0;font-size:12px;}
        img{border:0;}
        .lg{width:468px;height:468px;margin:100px auto;background:url(images/login/login_bg.png) no-repeat;}
        .lg_top{ height:200px;width:468px;}
        .lg_main{width:400px;height:180px;margin:0 25px;}
        .lg_m_1{width:290px;height:100px;padding:60px 55px 20px 55px;}
        .ur{height:37px;line-height:37px;border:0;color:#666;width:236px;margin:4px 28px;background:url(images/login/user.png) no-repeat;padding-left:10px;font-size:12px;font-family:Arial, Helvetica, sans-serif;}
        .pw{height:37px;line-height:37px;border:0;color:#666;width:236px;margin:4px 28px;background:url(images/login/password.png) no-repeat;padding-left:10px;font-size:12px;font-family:Arial, Helvetica, sans-serif;}
        .bn{width:330px;height:72px;background:url(images/login/enter.png) no-repeat;border:0;display:block;font-size:18px;color:#FFF;font-family:Arial, Helvetica, sans-serif;font-weight:bolder;cursor:pointer;}
        .lg_foot{height:80px;width:330px;padding: 6px 68px 0 68px;}
    </style>

</head>

<body>
<!-- 顶部导航 start -->
<div class="header_bar">
    <div class="header con_width">
        <!-- 左侧菜单 -->
        <div class="header_nav">
            <ul>
                <li><a href="#">小米商城</a></li>
                <li><a href="#">MIUI</a></li>
                <li><a href="#">IoT</a></li>
                <li><a href="#">云服务</a></li>
                <li><a href="#">金融</a></li>
                <li><a href="#">有品</a></li>
                <li><a href="#">小爱开放平台</a></li>
                <li><a href="#">政企服务</a></li>
                <li><a href="#">Select Region</a></li>
            </ul>
        </div>
        <!-- 右侧购物车 -->
        <div class="header_shopcart">
            <div class="shopcart_logo">
                <a href="#">
                    <i class="iconfont icon-cart"></i>
                    购物车（0）
                </a>
                <div class="shopcart-info">
                    <p>
                        购物车中还没有商品，赶紧选购吧!
                    </p>
                </div>
            </div>
        </div>
        <!--右侧登录、注册-->
        <div class="user-auction">
            <ul>
                <li><a href="login.jsp">登录</a></li>
                <li><a href="#">注册</a></li>
                <li><a href="#">消息通知</a></li>
            </ul>
        </div>
    </div>
</div>
<!-- 顶部导航 end -->
<div class="lg">
    <form action="#" method="POST">
        <div class="lg_top"></div>
        <div class="lg_main">
            <div class="lg_m_1">

                <input name="username" placeholder="用户名" value="" class="ur" />
                <input name="password" placeholder="密码" type="password" value="" class="pw" />

            </div>
        </div>
        <div class="lg_foot">
            <input type="submit" value="登录" class="bn" /></div>
    </form>
</div>
</body>
</html>

