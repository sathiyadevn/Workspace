<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
Hai!

Java Code
<%
    String name=request.getAttribute("label").toString();
    out.println(name);
%>
<br>
Expression Language Code
${label}
<br>

<c:out value="Hello world!" />

</body>
</html>