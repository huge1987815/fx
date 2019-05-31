<%--
  Created by IntelliJ IDEA.
  User: 胡正林
  Date: 2019/5/31
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <!--为了确保适当的绘制和触屏缩放，需要在 <head> 之中添加 viewport 元数据标签-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Title</title>
    <!--设置一个变量-->
    <c:set var="path" value="${pageContext.request.contextPath}" scope="page"/>
    <!--引入css样式-->
    <link rel="stylesheet" type="text/css" href="{path}/resource/css/css.css"/>
    <link rel="stylesheet" href="{path}/resource/css/bootstrap.css">
        
    <!--引入jquery库-->
    <script type="text/javascript" src="{path}/resource/jquery/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="{path}/resource/js/bootstrap.js"></script>
    <script type="text/javascript" src="{path}/resource/js/list.js"></script> 
    
  <body>
  $END$
  </body>
</html>
