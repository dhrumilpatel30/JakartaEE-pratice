
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
      <title>Ans</title>
</head>
<body>
      <jsp:useBean id="obj" class="lab7.q2.Calculator" />
      <jsp:setProperty name="obj" property="*" />
      <h2>Ans = <%= obj.calc() %></h2>
</body>
</html>
