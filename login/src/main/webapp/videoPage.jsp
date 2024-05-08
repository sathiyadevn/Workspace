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
    // we cant go back once you logged out
    response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");  // http v1.1
    response.setHeader("Expires","0");      // Proxies

    if(session.getAttribute("userName")==null){
        response.sendRedirect("loginPage.jsp");
    }
%>
<iframe width="560" height="315" src="https://www.youtube.com/embed/YjcBE0kDl8A?si=jITD8h9yk7_P__nc" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
</body>
</html>
