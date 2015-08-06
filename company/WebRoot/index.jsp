<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<jsp:include page="/web_ui/inc/header.jsp"></jsp:include>
<link href="<%=basePath%>web_ui/css/web_ui/index.css" rel="stylesheet" />
	<section id="featured">
	<!-- start slider -->
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
	<!-- Slider -->
	        <div id="main-slider" class="flexslider">
	            <ul class="slides">
	              <li>
	                <img src="<%=basePath%>web_ui/img/slides/5.jpg" width="100%" height="400px" alt="" />
	              </li>
	              <li>
	                <img src="<%=basePath%>web_ui/img/slides/2.jpg" width="100%" height="400px"  alt="" />
	              </li>
	              <li>
	                <img src="<%=basePath%>web_ui/img/slides/1.jpg" width="100%" height="400px"  alt="" />
	              </li>
	            </ul>
	        </div>
	<!-- end slider -->
			</div>
		</div>
	</div>	
	</section>
	<section id="content">
		<div class="container">
			<div class="row">
				<div class="col-lg-12"> 
					<div class="row">
						<div class="col-lg-3">
							<div class="panel panel-default">
							  <!-- Default panel contents -->
							  <s:action name="indexAction_findInformation" namespace="/ui"></s:action>
								  <div class="panel-heading">
								  		${requestScope.information[0].title }
								  </div>
								  <!-- content -->
								  <div class="information">
								  		<img alt="" src="<%=basePath%>web_ui/img/slides/3.jpg">
								  		${requestScope.information[0].content}
								  </div>
							</div>
						</div>
						<div class="col-lg-6">
							<div class="panel panel-default">
							  <!-- Default panel contents -->
							  <!-- <div class="clear"></div> -->
							  <div class="panel-heading newsheight"><span class="news">新闻动态</span>
							  	<a href="" class="moreNews">更多</a>
							  </div>
							  <!-- List group -->
							  <div class="clear"></div>
							  <ul class="list-group">
							    <li class="list-group-item">董事会十二月二次会议</li>
							    <li class="list-group-item">关于公司员工放假通知</li>
							    <li class="list-group-item">对5.33事件通报</li>
							    <li class="list-group-item">2014年第二季度财务报告</li>
							    <li class="list-group-item">热烈欢迎省委书记调研</li>
							  </ul>
							</div>
						</div>
						<div class="col-lg-3">
							<div class="panel panel-default">
							  <!-- Default panel contents -->
							  <div class="panel-heading">联系我们</div>
							  <!-- content -->
							  <div class="information">
							  	<img alt="" src="<%=basePath%>web_ui/img/slides/6.jpg">
							  	<span>地址:</span>sdf<br>
							  	<span>电话:</span>sdf<br>
							  	<span>Email:</span>sdf<br>
							  	<span>QQ:</span>sdf
							  </div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
<jsp:include page="/web_ui/inc/footer.jsp"></jsp:include>	