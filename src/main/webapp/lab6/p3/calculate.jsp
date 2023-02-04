<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Nope</title>
</head>
<body>
<jsp:useBean id="con" class="lab6.p3.Converter" scope="application" />
<jsp:setProperty name="con" property="*" />
<%
    double ans = con.getAns();
    response.sendRedirect("index.jsp?ans="+ans);
%>
</body>
</html>
