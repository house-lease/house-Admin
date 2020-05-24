<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>

    <script language="javascript">
        <%--通过--%>

        function pass() {
            document.form1.action = "${pageContext.request.contextPath}/apply/updatePass";
            document.form1.submit();
        }

        <%--驳回--%>

        function turn() {
            document.form1.action = "${pageContext.request.contextPath}/apply/updateTurn";
            document.form1.submit();
        }

        <%--返回--%>

        function esc() {
            document.form1.action = "${pageContext.request.contextPath}/apply/selectAll";
            document.form1.submit();
        }
    </script>


</head>
<body>

<form name="form1">

    <h2>房屋认证信息</h2>
    <div>
      <div style="display: none">
        认证人id:<input type="text" name="id"
               value="${applies.id}" /><br/>
      </div>
        认证人姓名：${applies.userName}<br/>
        认证人手机号：${applies.userPhone}<br/>
        认证房产信息图片：<br/><br/><img src="${applies.houseImageUrl}  " width="120px" height="120px"
                                style="margin-left: 100px"><br/><br/>
        押金状态:<c:if test="${applies.cash == 0}">已交押金</c:if>
        <c:if test="${applies.cash == 1}">已退押金</c:if><br/>
        认证状态:
        <c:if test="${applies.state == 0}">已认证</c:if>
        <c:if test="${applies.state == 1}">未认证</c:if>
        <c:if test="${applies.state == 2}">认证失败</c:if><br/>
        消息:<input type="text" name="message"/><br/><br/>


        <input type="button" name="btn1" value="通过" onclick="pass();">&nbsp;&nbsp;
        <input type="button" name="btn2" value="驳回" onclick="turn();">&nbsp;&nbsp;
        <input type="button" name="btn2" value="返回" onclick="esc();">
</form>

</body>
</html>



