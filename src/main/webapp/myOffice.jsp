<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My office</title>
    <link rel="stylesheet" type="text/css" href="styles/defaultPage.css"/>
    <link rel="stylesheet" type="text/css" href="styles/sideBarMenu.css"/>
</head>
<body>
<%@include file="WEB-INF/hasSession.jsp" %>
<%@include file="WEB-INF/sideBar.jsp"%>
<form class="center">
    <h3>My office</h3> <br>
    login: <%=request.getSession().getAttribute("login")%> <br>
    password: <%=request.getSession().getAttribute("password")%> <br>
    name: <%=request.getSession().getAttribute("name")%> <br>
    surname: <%=request.getSession().getAttribute("surname")%> <br>
    town: <%=request.getSession().getAttribute("town")%> <br>
    passport id: <%=request.getSession().getAttribute("passportId")%> <br>
    age: <%=request.getSession().getAttribute("age")%> <br><br>
</form>
</body>
</html>
