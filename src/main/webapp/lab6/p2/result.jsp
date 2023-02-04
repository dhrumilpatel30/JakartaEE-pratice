<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
<h2>Feedback received. Thank you.</h2>
<%-- Declaration --%>
<%! String name;%>
<%! String email;%>
<%! String subject;%>
<%! String message;%>
<%-- Scriptlet --%>
<%
    name = request.getParameter("name");
    email = request.getParameter("email");
    subject = request.getParameter("subject");
    message = request.getParameter("msg");
%>
<%-- Expression --%>
<h2>Preview of Submitted form</h2>
<h3>Name: <%= name%></h3>
<h3>Email: <%= email%></h3>
<h3>Subject: <%= subject%></h3>
<h4>Message: <%= message%></h4>

<%
    out.print("If You want to submit another form: ");
    out.println("<a href='index.jsp'>Click Here</a>");
    Cookie[] coks = request.getCookies();
    String cnt = null;
    int count;
    if(null != coks){
        for (Cookie c : coks) {
            if(c.getName().equals("cnt"))cnt=c.getValue();
        }
    }
    if(null == cnt)count = 0;
    else { count = Integer.parseInt(cnt);}
    Cookie cnew = new Cookie("cnt",String.valueOf(count+1));
    if(0 == count)cnew.setMaxAge(60*60*24);
    response.addCookie(cnew);
%>
<h3>Number of Forms Submitted Today:<%= count + 1%></h3>
</body>
</html>
