<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>



    <table border="1" class="result-tab">

        <th>起租时间编号</th>
        <th>起租时间</th>
        <th>可计算起租时间</th>
        <th>状态</th>
        <th>操作</th>
        <c:forEach items="${starts}" var="starts">

            <tr>
                <td>${starts.id}</td>
                <td>${starts.startName}</td>
                <td>${starts.startValue}</td>
                <c:if test="${starts.state==0}">
                <td>正常</td>
                </c:if>
                <c:if test="${starts.state==1}">
                    <td>删除</td>
                </c:if>
                <td><a href="#">删除</a>&nbsp;<a href="#">修改</a></td>
            </tr>
        </c:forEach>
    </table>
    <div id="fenye">


        <a href="${pageContext.request.contextPath}/start/selectAll?page=1&size=2">首页</a>
        <a href="${pageContext.request.contextPath}/start/selectAll?page=${pageInfo.pageNum-1}&size=2">上一页</a>
        <c:forEach begin="1" end="${pageInfo.pages}" var="pageNum">
            <a href="${pageContext.request.contextPath}/start/selectAll?page=${pageNum}&size=2">${pageNum}</a>
        </c:forEach>
        <a href="${pageContext.request.contextPath}/start/selectAll?page=${pageInfo.pageNum+1}&size=2">下一页</a>
        <a  href="${pageContext.request.contextPath}/start/selectAll?page=${pageInfo.pages}&size=2" aria-label="Next"> 尾页</a>



    </div>
</body>
</html>
