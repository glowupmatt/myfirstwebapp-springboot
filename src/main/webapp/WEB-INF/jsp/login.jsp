<!-- src/main/webapp/WEB-INF/jsp/sayHello.jsp -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<h1>Welcome to Login page</h1>
<form method="post">
    <label for="username">Name:</label>
    <input type="text" id="username" name="username" required><br><br>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required><br><br>
    <input type="submit" value="Login">
</form>
</body>
</html>