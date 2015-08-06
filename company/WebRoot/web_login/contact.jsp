<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'contact.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<meta name="keywords" content="" />
	<meta name="description" content="" />
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	
	<link href="<%=basePath%>web_login/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<link href="<%=basePath%>web_login/css/bootstrap.min.css" rel="stylesheet" type="text/css">
	<link href="<%=basePath%>web_login/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css">
	<link href="<%=basePath%>web_login/css/templatemo_style.css" rel="stylesheet" type="text/css">	
</head>
<body class="templatemo-bg-gray">
	<div class="container">
		<div class="col-md-12">	
			<h1 class="text-center margin-bottom-15">Contact Form Two</h1>		
			<form class="form-horizontal templatemo-contact-form-2 templatemo-container" role="form" action="#" method="post">
				<div class="row">
					<div class="col-md-6">
						<div class="form-group">				          		          	
				           	<div class="col-sm-12">
				            	<div class="templatemo-input-icon-container">
				            		<i class="fa fa-user"></i>
				            		<input type="text" class="form-control" id="name" placeholder="Name">
				            	</div>		            		            		            
				          	</div>              
				        </div>
				        <div class="form-group">
				            <div class="col-sm-12">
				            	<div class="templatemo-input-icon-container">
				            		<i class="fa fa-envelope"></i>
				            		<input type="email" class="form-control" id="email" placeholder="Email">
				            	</div>
				          	</div>
				        </div>
				        <div class="form-group">
				            <div class="col-sm-12">
				            	<div class="templatemo-input-icon-container">
				            		<i class="fa fa-phone"></i>
				            		<input type="text" class="form-control" id="phone" placeholder="Phone">
				            	</div>
				          	</div>
				        </div>
				        <div class="form-group">
				            <div class="col-sm-12">
				            	<div class="templatemo-input-icon-container">
				            		<i class="fa fa-info-circle"></i>
				            		<input type="text" class="form-control" id="subject" placeholder="Subject">
				            	</div>
				          	</div>
				        </div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
				          <div class="col-md-12">
				            <div class="templatemo-input-icon-container">
				            	<i class="fa fa-pencil-square-o"></i>
				            	<textarea rows="10" cols="50" class="form-control" id="message" placeholder="Message"></textarea>
				            </div>
				          </div>
				        </div>
					</div>					
				</div>	        
		        <div class="form-group">
		          <div class="col-md-12">
		            <div class="checkbox pull-left">
		                <label>
		                  <input type="checkbox"> Send a copy to my email.
		                </label>
		            </div>
		            <input type="submit" value="SEND MESSAGE" class="btn btn-warning pull-right">		            
		          </div>
		        </div>		    	
		      </form>	
              
              <div class="row">
              	<div class="col-md-8 col-xs-offset-1">
                	<br>
                	<p>Contact form two is brought to youCollect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a> that can be used for your websites.</p>
                </div>
              </div>	 
              
		</div>
	</div>
</body>
</html>

