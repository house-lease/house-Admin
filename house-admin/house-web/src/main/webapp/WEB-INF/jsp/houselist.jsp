<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>房屋列表</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/house/queryByPage?pageStart=1" method="post" id="formParticular">

    <table class="search-tab">
        <tr>
            <th width="70">房屋名称:</th>
            <td><input class="common-text" placeholder="请输入房屋名称" name="houseName"  id="houseName" type="text" value="${houseName}"/></td>
            <th width="70">房屋编号:</th>
            <td><input class="common-text" placeholder="请输入房屋编号" name="id"  id="第" type="text" value="${id}"/></td>
            <th width="70">房东姓名:</th>
            <td><input class="common-text" placeholder="请输入房东姓名" name="userName"  id="userName" type="text" value="${userName}"/></td>
            <td><input class="btn btn-primary btn2" name="sub" value="查询" type="submit" id="query">
            </td>
        </tr>
    </table>
    <br/>
    <div class="result-wrapParticular">
        <table class="result-tab" width="100%" border="2px">
            <tr>
                <th>房屋编号</th>
                <th style="color: #0e9aef">房东姓名</th>
                <th>起租时间</th>
                <th>起租实际类型</th>
                <th>月价格</th>
                <th>房屋描述</th>
                <th>房屋名字</th>
                <th>小区</th>
                <th>城市</th>
                <th>房屋类型名字</th>
                <th>房屋租赁类型名字</th>
                <th>剩余房间</th>
                <th>房屋状态</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${housesList}" var="house">
                <tr>
                    <td>${house.id}</td>
                    <!--- 房东姓名-->
                    <td>
                        ${house.userName}
                    </td>
                    <!-- 起租时间-->
                    <td>${house.startName}</td>
                    <td>${house.startValue}</td>
                    <td>${house.price}</td>
                    <td>${house.narrate}</td>
                    <td style="color:red;">${house.houseName}</td>
                    <td>${house.uptown}</td>
                    <td>${house.address}</td>
                    <!-- 房屋类型对象-->
                    <td>${house.houseTypeName}</td>
                    <!-- 房屋租赁类型-->
                    <td>${house.houseLeaseName}</td>

                    <td>${house.residueRoom}</td>
                    <!-- 房屋状态 0可租 1满租-->
                    <c:if test="${house.state==0}">
                        <td>可租</td>
                    </c:if>
                    <c:if test="${house.state==1}">
                        <td>满租</td>
                    </c:if>
                    <td>
                        <a href="${pageContext.request.contextPath}/house/selectHouseCareful?houseId=${house.id}">查看</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</form>
<div id="fenYe">
    <a href="${pageContext.request.contextPath}/house/queryByPage?pageStart=1&page=1&size=2">首页</a>
    <a href="${pageContext.request.contextPath}/house/queryByPage?pageStart=1&page=${pageInfo.pageNum-1}&size=2">上一页</a>
    <c:forEach begin="1" end="${pageInfo.pages}" var="pageNum">
        <a href="${pageContext.request.contextPath}/house/queryByPage?pageStart=1&page=${pageNum}&size=2">${pageNum}</a>
    </c:forEach>
    <a href="${pageContext.request.contextPath}/house/queryByPage?pageStart=1&page=${pageInfo.pageNum+1}&size=2">下一页</a>
    <a  href="${pageContext.request.contextPath}/house/queryByPage?pageStart=1&page=${pageInfo.pages}&size=2" aria-label="Next"> 尾页</a>
</div>
</body>
</html>
