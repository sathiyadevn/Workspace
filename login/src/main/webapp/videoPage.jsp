<%--
  Created by IntelliJ IDEA.
  User: dev43
  Date: 08/05/24
  Time: 12:12 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Video Page</title>
</head>
<body>
<%
    if(session.getAttribute("userName")==null){
        response.sendRedirect("loginPage.jsp");
    }
%>
<a href="https://www.youtube.com/watch?v=YjcBE0kDl8A&list=RDYjcBE0kDl8A&start_radio=1?t=18
"> Click, Headphone on and Enjoy</a>
</body>
</html>
