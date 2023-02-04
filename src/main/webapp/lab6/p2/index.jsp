<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FeedBack Form</title>
</head>
<body>
<h1>FeedBack Form</h1>
<form method="post" action="result.jsp">
    <label>Full Name:
        <input type="text" name="name">
    </label><br><br>
    <label>Email:
        <input type="email" name="email">
    </label><br><br>
    <label>Subject:
        <input type="text" name="subject">
    </label><br><br>
    <label>Message:
        <textarea name="msg"></textarea>
    </label>
    <input type="submit" value="submit">
</form>
</body>
</html>
