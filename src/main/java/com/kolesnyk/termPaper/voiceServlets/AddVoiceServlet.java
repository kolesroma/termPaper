package com.kolesnyk.termPaper.voiceServlets;


import com.kolesnyk.termPaper.containers.ApplicationContainer;
import com.kolesnyk.termPaper.containers.VoicesContainer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddVoiceServlet", value = "/AddVoiceServlet")
public class AddVoiceServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("login") == null)
            response.sendRedirect("index.jsp");
        String login = request.getSession().getAttribute("login").toString();
        String petitionLogin = (String) request.getSession().getAttribute("petitionLogin");

        if (VoicesContainer.getVoters().get(petitionLogin).contains(login)) {
            response.sendRedirect("alreadyVoted.html");
            return;
        }

        VoicesContainer.getVoters().get(petitionLogin).add(login);
        String[] sar = ApplicationContainer.getPetitions().get(petitionLogin);
        sar[2] = String.valueOf(Integer.parseInt(sar[2]) + 1);
        response.sendRedirect("voting.jsp");
    }
}
