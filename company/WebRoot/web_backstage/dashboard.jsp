<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<jsp:include page="/web_backstage/inc/header.jsp"></jsp:include>
 <div class="templatemo-content-wrapper">
	 <div class="templatemo-content">
			 <ol class="breadcrumb">
	            <li><a href="index.html">Admin Panel</a></li>
	            <li><a href="#">Dashboard</a></li>
	            <li class="active">Overview</li>
	            <li><a href="sign-in.html">Sign In Form</a></li>
	          </ol>
	 
	 </div>
	<%=request.getAttribute("zhang") %>
 </div>
<jsp:include page="/web_backstage/inc/footer.jsp"></jsp:include>