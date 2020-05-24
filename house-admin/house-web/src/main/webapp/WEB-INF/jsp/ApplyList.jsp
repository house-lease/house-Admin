<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <table border="1px">
        <tr>
            <td>用户名</td>
            <td>电话</td>
            <td>押金状态</td>
            <td>认证状态</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${applies}" var="applies">
        <tr>
            <td>${applies.userName}</td>
            <td>${applies.userPhone}</td>
            <td>
                <c:if test="${applies.cash == 0}">已交押金</c:if>
                <c:if test="${applies.cash == 1}">已退押金</c:if>
            </td>
            <td>
                <c:if test="${applies.state == 0}">已认证</c:if>
                <c:if test="${applies.state == 1}">未认证</c:if>
                <c:if test="${applies.state == 2}">认证失败</c:if>
            </td>

            <td>
                <c:if test="${applies.state==1}">
                    <a href="${pageContext.request.contextPath}/apply/selectById?id=${applies.id}">查看</a>
                </c:if>
            </td>
        </tr>
        </c:forEach>
    </table>


    <div id="fenye">

        <a href="${pageContext.request.contextPath}/apply/selectAll?page=1&size=2">首页</a>
        <a href="${pageContext.request.contextPath}/apply/selectAll?page=${pageInfo.pageNum-1}&size=2">上一页</a>
        <c:forEach begin="1" end="${pageInfo.pages}" var="pageNum">
            <a href="${pageContext.request.contextPath}/apply/selectAll?page=${pageNum}&size=2">${pageNum}</a>
        </c:forEach>
        <a href="${pageContext.request.contextPath}/apply/selectAll?page=${pageInfo.pageNum+1}&size=2">下一页</a>
        <a href="${pageContext.request.contextPath}/apply/selectAll?page=${pageInfo.pages}&size=2"
           aria-label="Next"> 尾页</a>


    </div>
</body>
</html>
