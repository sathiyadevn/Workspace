
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>

<%
    if(session.getAttribute("userName")==null)
        response.sendRedirect("loginPage.jsp");
%>
    Welcome ${userName}
</body>
</html>
