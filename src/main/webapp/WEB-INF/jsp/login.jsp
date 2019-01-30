<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>Login page</title>
</head>
<body>
<form name="loginForm" method="POST" action="controller">
    <input type="hidden" name="command" value="login"/>
    Login <input type = "text" name = "login" value="">
    <br><br>
    Password <input type="text" name="password" value="">
    <br><br>
    ${errorLoginMessage}
    <input type="submit" name="Log in"/>
</form>
</body>
</html>
