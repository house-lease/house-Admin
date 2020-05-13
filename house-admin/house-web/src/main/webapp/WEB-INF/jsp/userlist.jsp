<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>用户页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/selectByUser?pageStart=1" method="post" id="formParticular">

    <table class="search-tab">
        <tr>
            <th width="70">关键字:</th>
            <td><input class="common-text" placeholder="请输入用户名称" name="username"  id="username" type="text" value="${userName}"></td>
            <td><input class="btn btn-primary btn2" name="sub" value="查询" type="submit" id="query">
            </td>
        </tr>
    </table>
    <br/>
    <div class="result-wrapParticular">
        <table class="result-tab" border="2px">
            <tr>
                <th>用户编号</th>
                <th>用户昵称</th>
                <th>用户性别</th>
                <th>用户名</th>
                <th>房东认证</th>
                <th>注册时间</th>
                <th>用户的唯一标识</th>
                <th>用户状态</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${userList}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.nickname}</td>
                    <c:if test="${user.sex==0}">
                        <td>男</td>
                    </c:if>
                    <c:if test="${user.sex==1}">
                        <td>女</td>
                    </c:if>
                    <td style="color: red">${user.userName}</td>
                    <!-- 房东认证 0代表普通用户 1代表房东-->
                    <c:if test="${user.landlord==0}">
                        <td>普通用户</td>
                    </c:if>
                    <c:if test="${user.landlord==1}">
                        <td>房东</td>
                    </c:if>

                    <td><fmt:formatDate value="${user.registerTime}" pattern="yyyy-MM-dd hh:mm:ss"/></td>

                    <td>${user.openId}</td>
                    <c:if test="${user.state==0}">
                        <td>正常</td>
                    </c:if>
                    <c:if test="${user.state==1}">
                        <td>失效</td>
                    </c:if>

                <td style="color: red">
                    <a href="${pageContext.request.contextPath}/user/selectByUserMessage?id=${user.id}">查看</a>

                    <a href="${pageContext.request.contextPath}/user/selectById?id=${user.id}">修改</a>
                </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</form>
<div id="fenYe">
    <a href="${pageContext.request.contextPath}/user/selectByUser?pageStart=1&page=1&size=2">首页</a>
    <a href="${pageContext.request.contextPath}/user/selectByUser?pageStart=1&page=${pageInfo.pageNum-1}&size=2">上一页</a>
    <c:forEach begin="1" end="${pageInfo.pages}" var="pageNum">
    <a href="${pageContext.request.contextPath}/user/selectByUser?pageStart=1&page=${pageNum}&size=2">${pageNum}</a>
    </c:forEach>
    <a href="${pageContext.request.contextPath}/user/selectByUser?pageStart=1&page=${pageInfo.pageNum+1}&size=2">下一页</a>
    <a  href="${pageContext.request.contextPath}/user/selectByUser?pageStart=1&page=${pageInfo.pages}&size=2" aria-label="Next"> 尾页</a>
</body>
</html>
