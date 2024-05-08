<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%--JSTL Not Working on my Machine--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
Hai!
<br>

Java Code  <br>
<%
    String name=request.getAttribute("student").toString();
    out.println(name);
%>
<br>
Expression Language Code  <br>
${student.name}
<br>

JSTL <br>
<%--<c:out value="Hello!"></c:out>--%>

</body>
</html>
