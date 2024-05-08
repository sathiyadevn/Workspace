
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>

<%
    // we cant go back once you logged out
    response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");  // http v1.1
    response.setHeader("Expires","0");      // Proxies

    if(session.getAttribute("userName")==null)
        response.sendRedirect("loginPage.jsp");
%>
Welcome ${userName}

<a href="videoPage.jsp">Your Video Here</a>

<form action="Logout">
    <input type="submit" value="logout">
</form>

</body>
</html>
