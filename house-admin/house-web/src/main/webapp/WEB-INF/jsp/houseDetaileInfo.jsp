<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/12
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/static/Adminbackgroundshipment/layui/layui.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/Adminbackgroundshipment/layui/css/layui.css"  media="all">
</head>
<body>
    <form method="post" class="layui-form" action="${pageContext.request.contextPath}/house/queryByHouseId">
        <div class="layui-form-item">
            <label class="layui-form-label">单行输入框</label>
            <div class="layui-input-block">
                <input type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
            </div>
        房屋id: <input type="text" name="houseId">
        <input type="submit">
    </form>

</body>
</html>
