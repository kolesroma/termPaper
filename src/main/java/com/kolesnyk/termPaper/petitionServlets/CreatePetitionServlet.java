package com.kolesnyk.termPaper.petitionServlets;

import com.kolesnyk.termPaper.containers.ApplicationContainer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CreatePetitionServlet", value = "/CreatePetitionServlet")
public class CreatePetitionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = (String) request.getSession().getAttribute("login");
        String petitionName = request.getParameter("petitionName");
        String description = request.getParameter("description");
        ApplicationContainer.addPetition(login,
                new String[] {petitionName, description, "0"});
        response.sendRedirect("myPetitions.jsp");
    }
}
