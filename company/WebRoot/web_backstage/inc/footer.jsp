<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 <footer class="templatemo-footer">
        <div class="templatemo-copyright">
          <p>Copyright &copy; 2084 Your Company Name Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a> - More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a></p>
        </div>
      </footer>
    </div>
    <script src="<%=basePath%>web_backstage/js/jquery.min.js"></script>
    <script src="<%=basePath%>web_backstage/js/bootstrap.min.js"></script>
    <script src="<%=basePath%>web_backstage/js/Chart.min.js"></script>
    <script src="<%=basePath%>web_backstage/js/templatemo_script.js"></script>
</body>
</html>