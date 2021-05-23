package com.kolesnyk.termPaper.voiceServlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "VoterServlet", value = "/VoterServlet")
public class VoterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("login") == null)
            response.sendRedirect("index.jsp");
        String login = request.getParameter("user");
        String petition = request.getParameter("petition");
        String description = request.getParameter("description");
        request.getSession().setAttribute("petitionLogin", login);
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Add voice</title>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/defaultPage.css\"/>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/sideBarMenu.css\"/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form class=\"center\">");
            out.println("<h1> petition owner: " + login + "</h1><br><h2> name: " + petition + "</h2><br>");
            out.println("<h2> description: " + description + "<h2> <br>");
            out.println("<a href='AddVoiceServlet'> VOTE </a>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
