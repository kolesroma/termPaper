<%@ page import="com.kolesnyk.termPaper.databaseExtractors.Extractor" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My petitions</title>
    <link rel="stylesheet" type="text/css" href="styles/defaultPage.css"/>
    <link rel="stylesheet" type="text/css" href="styles/sideBarMenu.css"/>
</head>
<body>
<%@include file="WEB-INF/hasSession.jsp" %>
<%@include file="WEB-INF/sideBar.jsp" %>
<form class="center">
    <h3>My petitions</h3> <br>
    <a href="createNewPetition.jsp">create new petition</a>
    <a href="DeletePetitionServlet">delete current petition</a> <br>

    <%=Extractor.getName((String) request.getSession().getAttribute("login"))%>
    <%=Extractor.getVoices((String) request.getSession().getAttribute("login"))%> <br>
</form>
</body>
</html>
