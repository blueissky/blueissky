<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<meta name="description" content="" />
	<!-- css -->
	<link href="<%=basePath%>web_ui/css/bootstrap.min.css" rel="stylesheet" />
	<link href="<%=basePath%>web_ui/css/fancybox/jquery.fancybox.css" rel="stylesheet">
	<link href="<%=basePath%>web_ui/css/jcarousel.css" rel="stylesheet" />
	<link href="<%=basePath%>web_ui/css/flexslider.css" rel="stylesheet" />
	<link href="<%=basePath%>web_ui/css/style.css" rel="stylesheet" />
	<!-- Theme skin -->
	<link href="<%=basePath%>web_ui/skins/default.css" rel="stylesheet" />
  </head>
<body>
<div id="wrapper">
	<!-- start header -->
	<header>
        <div class="navbar navbar-default navbar-static-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.html"><span>远</span>洋外贸有限公司</a>
                </div>
                <div class="navbar-collapse collapse ">
                    <ul class="nav navbar-nav">
                        <li><a href="index.jsp">公司首页</a></li><!-- class="active" -->
                        <li><a href="<%=basePath%>web_ui/information.jsp">公司简介</a></li>
                        <li><a href="<%=basePath%>web_ui/product.jsp">产品展示</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle " data-toggle="dropdown" data-hover="dropdown" data-delay="0" data-close-others="false">人才招聘 <b class=" icon-angle-down"></b></a>
                            <ul class="dropdown-menu">
                                <li><a href="<%=basePath%>web_ui/recruit.jsp">Typography</a></li>
                                <li><a href="components.html">Components</a></li>
								<li><a href="pricingbox.html">Pricing box</a></li>
                            </ul>
                        </li>
                        <li><a href="<%=basePath%>web_ui/message.jsp">客户留言</a></li>
                    </ul>
                </div>
            </div>
        </div>
	</header>
	<!-- end header -->