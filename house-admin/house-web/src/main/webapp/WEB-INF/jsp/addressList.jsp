<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查看城市</title>
</head>
<body>
        <form action="${pageContext.request.contextPath}/address/selectAll" method="post">
            <table class="search-tab">
                <tr>
                    <th width="70">城市名:</th>
                    <td><input class="common-text" placeholder="请输入城市名" name="address"  id="address" type="text" value="${houseName}"/></td>
                    <td><input name="sub" value="查询" type="submit" id="query"></td>
                    <td><button><a href="${pageContext.request.contextPath}/address/insert">添加</a></button></td>
                </tr>
            </table>

            <table class="result-tab" border="1px">
                <tr>
                    <th>城市编号</th>
                    <th>城市名</th>
                    <th>父级编号</th>
                    <th>城市的状态</th>
                    <th>操作</th>
                </tr>
                <c:forEach items="${addressList}" var="address">
                    <tr>
                        <td>${address.id}</td>
                        <td>${address.address}</td>
                        <td>${address.parentId}</td>
                        <c:if test="${address.state == 0}">
                            <td>正常</td>
                        </c:if>
                        <c:if test="${address.state == 1}">
                            <td>删除</td>
                        </c:if>
                        <td>
                            <a href="${pageContext.request.contextPath}/address/selectById?id=${address.id}">修改</a>
                            <a href="${pageContext.request.contextPath}/address/deleteByState?id=${address.id}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
</form>
</body>
</html>
