<%@ page import="com.kolesnyk.termPaper.databaseExtractors.Extractor" %>
<%@ page import="com.kolesnyk.termPaper.containers.ApplicationContainer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Voting</title>
    <link rel="stylesheet" type="text/css" href="styles/defaultPage.css"/>
    <link rel="stylesheet" type="text/css" href="styles/sideBarMenu.css"/>
</head>
<body>
<%@include file="WEB-INF/hasSession.jsp" %>
<%@include file="WEB-INF/sideBar.jsp"%>
<form class="center">
    <h3>All available petitions</h3> <br>
    <%
        for (String userLogin : ApplicationContainer.getUsers().keySet()) {
            String s = "VoterServlet?user=" + userLogin
                    + "&petition=" + Extractor.getName(userLogin).replace(" ","-")
                    + "&description=" + Extractor.getDescription(userLogin).replace(" ","-");
    %>
            <a href=<%=s%>><%=Extractor.getName(userLogin)%></a>
            <%=Extractor.getVoices(userLogin)%> <br>
            <%=Extractor.getDescription(userLogin)%> <br> <br>
    <%
        }
    %>
</form>
</body>
</html>
