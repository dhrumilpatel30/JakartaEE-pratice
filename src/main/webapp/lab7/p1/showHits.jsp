<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hits After Deployment</title>
</head>
<body>

<%
  int count = 1;
  if(application.getAttribute("count_of_hits") != null){
    count = (int) application.getAttribute("count_of_hits");
  }
  application.setAttribute("count_of_hits", count);
  out.print("Total number of counts after deployment is: "+ count);
%>
<jsp:include page="index.html" />
</body>
</html>
