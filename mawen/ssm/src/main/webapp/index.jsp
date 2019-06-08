<%--
  Created by IntelliJ IDEA.
  User: 青丘之狐
  Date: 2019/6/2
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="account/save" method="post">
        姓名<input type="text" name="name"><br>
        余额<input type="text" name="money">
        <input type="submit" value="提交">
    </form>
    <a href="account/findAll">查询所有</a>
    <form action="account/save" method="post">
        id<input type="text" name="id"><br>
        <input type="submit" value="提交">
    </form>

</body>
</html>
