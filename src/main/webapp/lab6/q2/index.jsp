
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
      <title>Login Validation page</title>
</head>
<body>
<h1>Login Validation page</h1>
<form action="ValidateServlet" method="post">
      <label>Name
            <input type="text" name="username">
      </label><br><br>
      <label>Password
            <input type="password" name="password">
      </label><br><br>
      <input type="submit" value="Submit">
</form>
</body>
</html>
