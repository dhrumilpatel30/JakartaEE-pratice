<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello second.jsp</h1>
<%
    if(!session.isNew()){
        String username = session.getAttribute("username").toString();
        out.print("Successful login<br>");
        out.print("username is, " + username + " <br>");
        out.print("<a href='logout.jsp'>logout</a><br>");
        out.print("<a href='first.jsp'>first.jsp</a>");
    }else{
%>
<jsp:forward page="logout.jsp" />
<%
    }
%>
</body>
</html>
