<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/static/Adminbackgroundshipment/layui/layui.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/Adminbackgroundshipment/layui/css/layui.css"
          media="all">
</head>
<body>

<form class="layui-form" action="${pageContext.request.contextPath}/record/getRecordList">
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">订单号</label>
            <div class="layui-input-inline">
                <input type="tel" name="record" lay-verify="required|phone" autocomplete="off" class="layui-input">
            </div>
            <input type="submit" class="layui-btn"/>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">用户id</label>
            <div class="layui-input-inline">
                <input type="tel" name="userId" lay-verify="required|phone" autocomplete="off" class="layui-input">
            </div>
            <input type="submit" class="layui-btn"/>
        </div>
    </div>
</form>
<table border="1px solid">
    <tr>
        <td>订单id</td>
        <td>订单号</td>
        <td>付款人id</td>
        <td>付款人姓名</td>
        <td>收款人id</td>
        <td>收款人姓名</td>
        <td>房屋id</td>
        <td>房屋名字</td>
        <td>交易时间</td>
        <td>交易金额</td>
        <td>交易状态</td>
        <td>订单状态</td>
    </tr>
    <c:forEach items="${recordPageInfo.list}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.record}</td>
            <td>${item.payerUser.id}</td>
            <td>${item.payerName}</td>
            <td>${item.payeeUser.id}</td>
            <td>${item.payeeName}</td>
            <td>${item.house.id}</td>
            <td>${item.houseName}</td>
            <td><fmt:formatDate value="${item.dealTime}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
            <td>${item.dealMoney}</td>
            <td>${item.dealState}</td>
            <td>${item.state}</td>
        </tr>
    </c:forEach>
</table>
<a href="${pageContext.request.contextPath}/record/getRecordList/?pageCode=${recordPageInfo.navigateFirstPage}">首页</a>
<a href="${pageContext.request.contextPath}/record/getRecordList/?pageCode=${recordPageInfo.prePage}">上一页</a>
<c:forEach var="i" begin="1" end="${recordPageInfo.pages}">
    <a href="${pageContext.request.contextPath}/record/getRecordList/?pageCode=${i}">${i}</a>
</c:forEach>
<a href="${pageContext.request.contextPath}/record/getRecordList/?pageCode=${recordPageInfo.nextPage}">下一页</a>
<a href="${pageContext.request.contextPath}/record/getRecordList/?pageCode=${recordPageInfo.navigateLastPage}">尾页</a>
</body>
</html>
