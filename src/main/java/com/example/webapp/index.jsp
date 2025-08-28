<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head><title>My Web App</title></head>
<body>
<h1>Welcome to My App</h1>
<p>Try the calculator servlet: <a href="calc?a=2&b=3">calc?a=2&b=3</a></p>
<form action="calc" method="get">
  <input type="number" name="a" value="2" /> +
  <input type="number" name="b" value="3" />
  <button type="submit">Calculate</button>
</form>
</body>
</html>
