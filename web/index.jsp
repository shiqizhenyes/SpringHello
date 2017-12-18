<%--
  Created by IntelliJ IDEA.
  User: Zack
  Date: 12/11/2017
  Time: 8:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>helloSpring</title>
  </head>
  <body>
  <a href="hello/helloSpring">请求1</a>

  <a href="helloSpring">请求2</a>

  <form action="hello/test" method="post">
    <button type="submit">请求3</button>
  </form>
  <a href="hello/testParamsAndHeads?username=zack&age=10">请求4</a>
  <a href="hello/testParamsAndHeads?username=zack&age=11?headers=Accept-Language=zh-CN,zh;q=0.9">请求4</a>
  <a href="hello/testAntPath/fs/abc">请求5</a>
  <a href="hello/testVariable/1">请求6</a>
  <a href="hello/testRest/2">Test Rest get</a>

  <form action="hello/testRest/1" method="post">
    <input type="submit" value="TEST Post">
  </form>

  <form action="hello/testRest/1" method="post">
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="TEST PUT">
  </form>

  <form action="hello/testRest/1" method="post">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="TEST DELETE">
  </form><br>
  <a href="hello/testParams?username=zack&age=10">Test requestParam</a>
  </body>
</html>
