package com.kolesnyk.termPaper.petitionServlets;

import com.kolesnyk.termPaper.containers.ApplicationContainer;
import com.kolesnyk.termPaper.containers.VoicesContainer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashSet;

@WebServlet(name = "DeletePetitionServlet", value = "/DeletePetitionServlet")
public class DeletePetitionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getSession().getAttribute("login").toString();
        ApplicationContainer.getPetitions().remove(login);
        VoicesContainer.getVoters().put(login, new HashSet<>());
        response.sendRedirect("myPetitions.jsp");
    }
}
