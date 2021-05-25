<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Petition Site</title>
    <link rel="stylesheet" type="text/css" href="styles/defaultPage.css"/>
</head>
<body>
<form action="LoginServlet" method="post" class="center">
    <h3>Log in</h3>
    login: <input type="text" name="login"> <br>
    password: <input type="password" name="password"> <br>
    <input type="submit" value="submit"> <br>
    <a href="registration.jsp">registration</a>
</form>
</body>
</html>