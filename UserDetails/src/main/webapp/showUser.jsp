<%@ page import="com.dev43.userdetails.User" %><%--
  Created by IntelliJ IDEA.
  User: dev43
  Date: 09/05/24
  Time: 2:38 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show User</title>
</head>
<body bgcolor="#008b8b">
    <%
        User user= (User) request.getAttribute("userObj");
        out.println(user);

    %>

  </body>
</html>
