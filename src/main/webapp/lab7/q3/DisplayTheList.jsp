<%@ page import="java.util.List" %>
<%@ page import="lab7.q3.Book" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Your List</title>
</head>
<body>

<h2>Your Selected Genre list is: </h2>
<%
    Book[] a =  (Book[]) request.getAttribute("mybooks");
    for (Book a1: a) {
        out.print(a1+"<br>");
    }
%>
</body>
</html>
