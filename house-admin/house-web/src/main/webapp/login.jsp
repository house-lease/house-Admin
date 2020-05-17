<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/16
  Time: 13:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="login-container">
    <div class="left-container">
        <div class="title"><span>登录</span></div>
        <div class="input-container">
            <input type="text" name="name" placeholder="用户名" id="name" required>
            <input id="password" type="password" name="password" placeholder="密码" required>
        </div>
        <div class="message-container">
            <span>忘记密码</span>
        </div>
    </div>
    <div class="right-container">
        <div class="actoin-container" onclick="login()">
            <span>提交</span>
        </div>
    </div>
</div>
</body>
<style>
    * {
        padding: 0;
        margin: 0;
    }

    html {
        height: 100%;
    }

    body {
        background-image: linear-gradient(to bottom right, rgb(199, 191, 219), rgb(130, 88, 186));
    }

    body .login-container {
        width: 600px;
        height: 315px;
        margin: 0 auto;
        margin-top: 20%;
        border-radius: 15px;
        box-shadow: 0 10px 50px 0px rgb(59, 45, 159);
        background-color: rgb(95, 76, 194);
    }

    body .login-container .left-container {
        display: inline-block;
        width: 330px;
        border-top-left-radius: 15px;
        border-bottom-left-radius: 15px;
        padding: 60px;
        background-image: linear-gradient(to bottom right, rgb(118, 76, 163), rgb(92, 103, 211));
    }

    body .login-container .left-container .title {
        color: #fff;
        font-size: 18px;
        font-weight: 200;
    }

    body .login-container .left-container .title span {
        border-bottom: 3px solid rgb(237, 221, 22);
    }

    body .login-container .left-container .input-container {
        padding: 20px 0;
    }

    body .login-container .left-container .input-container input {
        border: 0;
        background: none;
        outline: 0;
        color: #fff;
        margin: 20px 0;
        display: block;
        width: 100%;
        padding: 5px 0;
        transition: .2s;
        border-bottom: 1px solid rgb(199, 191, 219);
    }

    body .login-container .left-container .input-container input:hover {
        border-bottom-color: #fff;
    }

    ::-webkit-input-placeholder {
        color: rgb(199, 191, 219);
    }

    body .login-container .left-container .message-container {
        font-size: 14px;
        transition: .2s;
        color: rgb(199, 191, 219);
        cursor: pointer;
    }

    body .login-container .left-container .message-container:hover {
        color: #fff;
    }

    body .login-container .right-container {
        width: 145px;
        display: inline-block;
        height: calc(100% - 120px);
        vertical-align: top;
        padding: 60px 0;
    }

    body .login-container .right-container {
        text-align: center;
        color: #fff;
        font-size: 18px;
        font-weight: 200;
    }

    body .login-container .right-container {
        border-bottom: 3px solid rgb(237, 221, 22);
    }

    body .login-container .right-container .actoin-container {
        font-size: 10px;
        color: #fff;
        height: 100%;
        position: relative;
    }

    body .login-container .right-container .actoin-container span {
        border: 1px solid rgb(237, 221, 22);
        padding: 10px;
        display: inline;
        line-height: 25px;
        border-radius: 25px;
        position: absolute;
        bottom: 10px;
        left: calc(72px - 25px);
        transition: .2s;
        cursor: pointer;
    }

    body .login-container .right-container .actoin-container span:hover {
        background-color: rgb(237, 221, 22);
        color: rgb(95, 76, 194);
    }
</style>
<script>
    window.onload = function () {
        const token = window.localStorage.getItem("token");
        if(!token){
            window.location.href = '${pageContext.request.contextPath}/index.jsp';
        }
    };
    function login() {
        const name = document.querySelector("#name").value;
        const password = document.querySelector("#password").value;
        const url = `${pageContext.request.contextPath}/admin/login`;
        fetch(url, {
            method: 'post',
            headers: {'Content-Type': 'application/json;charset=utf-8;'},
            body: JSON.stringify({'name': name, 'password': password})
        }).then((response) => response.json()).then(data => {
           if(data.data.success === '200'){
               localStorage.setItem("token", data.data.token);
               window.location.href = '${pageContext.request.contextPath}/index.jsp';
           }
        }).catch(error => {
            console.log(error);
        });
    }
</script>
</html>
