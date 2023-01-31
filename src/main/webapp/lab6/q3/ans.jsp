
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
      <title>Ans</title>
</head>
<body>
<jsp:useBean id="obj" class="lab6.q3.Calculator" />
<jsp:setProperty name="obj" property="*" />
<h2>Ans = <%= obj.calc() %></h2>
</body>
</html>
