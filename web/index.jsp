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
  <a href="hello/testParams?username=zack&age=10">Test requestParam</a><br>
  <a href="hello/testCookieValue">Test Cookie</a><br>


  <form action="hello/testPojo" method="post">

    <label>name:</label><input type="text" name="userName"><br>
    <label>age:</label><input type="number" name="age"><br>
    <label>sex:</label><input type="number" name="sex"><br>
    <label>city:</label><input type="text" name="address.city"><br>
    <button type="submit">提交</button>
  </form>


  <a href="hello/testServletApi">test Servlet Api</a>
  <a href="hello/testModelAndView">test Model and View</a>
  <a href="hello/testMap">test Map</a>


  </body>
</html>
