<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>查看用户信息</title>
</head>
<body>
        <table border="2px">
            <tr><th>用户编号</th> <td>${user.id}</td></tr>
            <tr><th>用户昵称</th> <td>${user.nickname}</td></tr>
            <tr><th>用户性别</th>
                <c:if test="${user.sex==0}">
                <td>男</td>
            </c:if>
                <c:if test="${user.sex==1}">
                    <td>女</td>
                </c:if></tr>
            <tr><th>用户名</th> <td>${user.userName}</td></tr>
            <tr><th>身份证号</th> <td>${user.idcard}</td></tr>
            <tr><th>手机号</th> <td>${user.phone}</td></tr>
            <tr><th>房东认证</th>
                <!-- 房东认证 0代表普通用户 1代表房东-->
                <c:if test="${user.landlord==0}">
                    <td>普通用户</td>
                </c:if>
                <c:if test="${user.landlord==1}">
                    <td>房东</td>
                </c:if></tr>
            <tr><th>注册时间</th> <td><fmt:formatDate value="${user.registerTime}" pattern="yyyy-MM-dd hh:mm:ss"/></td></tr>
            <tr><th>头像路径</th> <td>${user.imageUrl}</td></tr>
            <tr><th>用户的唯一标识</th> <td>${user.openId}</td></tr>

            <tr><th>用户状态</th>
                <c:if test="${user.state==0}">
                <td>正常</td>
            </c:if>
                <c:if test="${user.state==1}">
                    <td>失效</td>
                </c:if>
            </tr>
        </table>

</body>
</html>
