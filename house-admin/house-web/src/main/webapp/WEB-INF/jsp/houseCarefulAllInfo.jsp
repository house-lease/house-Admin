<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/Adminbackgroundshipment/layui/css/layui.css"
          media="all">
</head>
<body>
<form method="post" class="layui-form" action="${pageContext.request.contextPath}/house/queryHouseCarefulById">
    <div class="layui-form-item">
        <label class="layui-form-label">单行输入框</label>
        <div class="layui-input-block">
            <input type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入标题"
                   class="layui-input">
        </div>
        房屋id: <input type="text" name="houseId">
        <input type="submit">
</form>
<table border="1px solid" align="center">
    <tr>
        <td>id</td>
        <td>房屋id</td>
        <td>床</td>
        <td>沙发</td>
        <td>空调</td>
        <td>燃气</td>
        <td>洗衣机</td>
        <td>宽带</td>
        <td>电视</td>
        <td>电冰箱</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${houseCarefulPageInfo.list}" var="item">
        <td>${item.id}</td>
        <td><a href="${pageContext.request.contextPath}/house/queryByHouseId?houseId=${item.houseId}">${item.houseId}</a></td>
        <td>
            <c:if test="${item.chuang == 0}">有</c:if>
            <c:if test="${item.chuang == 1}">没有</c:if>
        </td>
        <td>
            <c:if test="${item.shafa == 0}">有</c:if>
            <c:if test="${item.shafa == 1}">没有</c:if>
        </td>
        <td>
            <c:if test="${item.kongtiao == 0}">有</c:if>
            <c:if test="${item.kongtiao == 1}">没有</c:if>
        </td>
        <td>
            <c:if test="${item.ranqi == 0}">有</c:if>
            <c:if test="${item.ranqi == 1}">没有</c:if>
        </td>
        <td>
            <c:if test="${item.xiyiji == 0}">有</c:if>
            <c:if test="${item.xiyiji == 1}">没有</c:if>
        </td>
        <td>
            <c:if test="${item.kuandai == 0}">有</c:if>
            <c:if test="${item.kuandai == 1}">没有</c:if>
        </td>
        <td>
            <c:if test="${item.dianshi == 0}">有</c:if>
            <c:if test="${item.dianshi == 1}">没有</c:if>
        </td>
        <td>
            <c:if test="${item.bingxiang == 0}">有</c:if>
            <c:if test="${item.bingxiang == 1}">没有</c:if>
        </td>
        <td><a href="${pageContext.request.contextPath}/house/selectHouseCarefulById?id=${item.houseId}">修改</a></td>
    </c:forEach>
    <tr>
    </tr>
    ${houseCarefulPageInfo}
</table>
<%--    ${house}--%>

</body>
</html>
