<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
    <link rel="stylesheet" type="text/css" href="styles/defaultPage.css"/>
</head>
<body>
<form action="SaveUserServlet" method="post" class="center">
    <h3>Registration</h3>
    name: <input type="text" name="name"> <br>
    surname: <input type="text" name="surname"> <br>
    town: <input type="text" name="town"> <br>
    passport id: <input type="text" name="passportId"> <br>
    age: <input type="text" name="age"> <br>
    mobile phone: <input type="text" name="phone"> <br>
    password: <input type="password" name="password"> <br>
    <input type="submit" value="submit"> <br>
</form>
</body>
</html>
