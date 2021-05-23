<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new petition</title>
    <link rel="stylesheet" type="text/css" href="styles/defaultPage.css"/>
    <link rel="stylesheet" type="text/css" href="styles/sideBarMenu.css"/>
</head>
<body>
<%@include file="WEB-INF/hasSession.jsp"%>
<%@include file="WEB-INF/sideBar.jsp"%>
<form action="CreatePetitionServlet" method="post" class="center">
    <h3>Create new petition</h3>
    petition name: <input type="text" name="petitionName"> <br>
    description: <input type="text" name="description" size="50"> <br>
    <input type="submit" value="submit"> <br>
    *creating a new petition cancels the previous one
</form>
</body>
</html>
