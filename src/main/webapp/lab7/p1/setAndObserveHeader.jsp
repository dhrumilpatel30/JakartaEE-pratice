<%@ page import="java.util.Collection" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    response.setIntHeader("Refresh", 5);
    out.print("Custom Header set :" + "(\"Refresh\", 5)<br><br>");
    out.print("Page will reload in every 5 seconds, see time for reference");
%>
    <% java.util.Date d = new java.util.Date();
    out.println(d.toString()); %>
</body>
</html>
