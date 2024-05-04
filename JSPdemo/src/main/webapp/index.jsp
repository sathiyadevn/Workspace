        1. Directive <br>
1.1 @page <br>
1.2 @include <br>
1.3 @taglib <br>    <%--Eg will get back soon--%>
2. Declaration <br>
3. Scriptlet <br>
4. Expression <br>

<%-- 1.1) Import stats goes here(can import multiple pakages)--%>
<%@ page import="java.util.*,java.sql.*" %>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--Error Handling--%>
<%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%-- 1.2) --%>
<%@ include file="header.jsp" %>

<h1><%="Hello World!"%>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a> </br>

<%-- 2) Instance Var goes here--%>
<%!
    double pi = 3.14;
%>

<%-- 3) Internall these logic goes into service()/doGet()/doPost() in Servlet --%>
<%
    out.println(3 + 5);
    // Eg will get back soon
    pageContext.setAttribute("name", "dev43", PageContext.SESSION_SCOPE);
%>
<br>

<%-- 4) print var without creating an obj--%>
PI value is :
<%=pi%>
<%--Error Handling - unCmd below and it --%>
<%--    <% int i = 9 / 0; %>--%>

<%--JDBC--%>
<%! ResultSet rs = null; %>
<%
    try {
        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String pass = "root";
        String query = "select * from newConn where no=1";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();

        rs = st.executeQuery(query);
        rs.next();
    } catch (Exception e) {
    }
%>
<br> <br>
DATA from MYSQL <br>

RollNo : <%=rs.getString(1)%> <br>
Name : <%=rs.getString(2)%> <br>

<%@ include file="footer.jsp" %>

</body>

</html>
