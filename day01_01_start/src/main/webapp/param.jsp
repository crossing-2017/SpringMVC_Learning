<%--
  Created by IntelliJ IDEA.
  User: crossing
  Date: 2019/5/29
  Time: 08:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--请求参数绑定--%>
    <%--<a href="/param/testParam?username=hehe">请求参数绑定</a>--%>

    <%--<form action="/param/saveAccount" method="post">
        姓名：<input type="text" name="username" /><br/>
        密码：<input type="text" name="password" /><br/>
        金额：<input type="text" name="money" /><br/>

        用户姓名：<input type="text" name="userList[0].uname" /><br/>
        用户年龄：<input type="text" name="userList[0].age" /><br/>


        用户姓名：<input type="text" name="userMap['one'].uname" /><br/>
        用户年龄：<input type="text" name="userMap['one'].age" /><br/>
        <input type="submit" value="提交" />
    </form>--%>

    <%--自定义类型转换器--%>
    <%--<form action="param/saveUser" method="post">
        用户姓名：<input type="text" name="uname" /><br/>
        用户年龄：<input type="text" name="age" /><br/>
        用户生日：<input type="text" name="date" /><br/>
        <input type="submit" value="提交" />
    </form>--%>


    <a href="/param/testServlet">Servlet原生的API</a>
</body>
</html>
