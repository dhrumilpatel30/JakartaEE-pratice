<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Converter</title>
</head>
<body>
<h1>Unit Converter</h1>
<form action="calculate.jsp" method="post">
    <label>Select:</label>
    <select name="data">
        <option value="length">Length</option>
        <option value="temp">Temperature</option>
    </select>
    <label>From unit value: <input type="number" name="from_value"></label>
    <select name="from_unit">
        <option value="meter">Meter</option>
        <option value="inch">Inch</option>
        <option value="celsius">Celsius</option>
    </select><br>
    <label>To unit value: <%= request.getParameter("ans")%></label>
    <select name="to_unit">
        <option value="centimeter">centimeter</option>
        <option value="fahrenheit">Fahrenheit</option>
    </select>
    <input type="submit" value="Submit">
</form>
</body>
</html>
