<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h2>Calculator Using JSP</h2>
<form method="post" action="ans.jsp">
  <label>number 1
    <input type="number" name="a">
  </label>
  <label>number 2
    <input type="number" name="b">
  </label>
  <label><br></br>operation
    <br>+ for sum
    <br>- for sub
    <br>* for multi
    <br>/ for division
    <input type="text" name="operation">
  </label>
  <input type="submit" value="Submit">
</form>

</body>
</html>
