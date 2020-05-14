<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/13
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="${pageContext.request.contextPath}/static/Adminbackgroundshipment/layui/layui.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/Adminbackgroundshipment/layui/css/layui.css"
      media="all">
<body>
<form class="layui-form" action="${pageContext.request.contextPath}/house/modifyById" method="post">
    <input type="hidden" readonly value="${houseCareful.id}" name="id"/>
    <div class="layui-form-item">
        <label class="layui-form-label">房屋id</label>
        <div class="layui-input-inline">
            <input type="text" name="houseId" required lay-verify="required" placeholder="请输入标题" autocomplete="off"
                   class="layui-input" value="${houseCareful.houseId}" readonly>
        </div>

    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">床</label>
        <div class="layui-input-inline">
            <input type="text" name="chuang" required lay-verify="required" placeholder="请输入标题" autocomplete="off"
                   class="layui-input" value="${houseCareful.chuang}">
        </div>
        <div class="layui-form-mid layui-word-aux">0代表有 1代表没有</div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">沙发</label>
        <div class="layui-input-inline">
            <input type="text" name="shafa" required lay-verify="required" placeholder="请输入标题" autocomplete="off"
                   class="layui-input" value="${houseCareful.shafa}">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">空调</label>
        <div class="layui-input-inline">
            <input type="text" name="kongtiao" required lay-verify="required" placeholder="请输入标题" autocomplete="off"
                   class="layui-input" value="${houseCareful.kongtiao}">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">燃气</label>
        <div class="layui-input-inline">
            <input type="text" name="ranqi" required lay-verify="required" placeholder="请输入标题" autocomplete="off"
                   class="layui-input" value="${houseCareful.ranqi}">
        </div>
    </div>
    <div class="layui-form-item">
    <label class="layui-form-label">洗衣机</label>
    <div class="layui-input-inline">
        <input type="text" name="xiyiji" required lay-verify="required" placeholder="请输入标题" autocomplete="off"
               class="layui-input" value="${houseCareful.xiyiji}">
    </div>
</div>
    <div class="layui-form-item">
        <label class="layui-form-label">宽带</label>
        <div class="layui-input-inline">
            <input type="text" name="kuandai" required lay-verify="required" placeholder="请输入标题" autocomplete="off"
                   class="layui-input" value="${houseCareful.kuandai}">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">电视</label>
        <div class="layui-input-inline">
            <input type="text" name="dianshi" required lay-verify="required" placeholder="请输入标题" autocomplete="off"
                   class="layui-input" value="${houseCareful.dianshi}">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">冰箱</label>
        <div class="layui-input-inline">
            <input type="text" name="bingxiang" required lay-verify="required" placeholder="请输入标题" autocomplete="off"
                   class="layui-input" value="${houseCareful.bingxiang}">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
</body>
</html>
