<%
    if (request.getSession().getAttribute("login") == null)
        response.sendRedirect("index.jsp");
%>