package com.kolesnyk.termPaper;

import com.kolesnyk.termPaper.containers.ApplicationContainer;
import com.kolesnyk.termPaper.containers.VoicesContainer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashSet;

@WebServlet(name = "SaveUserServlet", value = "/SaveUserServlet")
public class SaveUserServlet extends HttpServlet {
    CheckRegisterData checkRegisterData;

    @Override
    public void init() throws ServletException {
        checkRegisterData = new CheckRegisterData();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String town = request.getParameter("town");
        String passportId = request.getParameter("passportId");
        String age = request.getParameter("age");
        if (checkRegisterData.hasEmptyField(phone, password, name, surname, town, passportId, age)) {
            response.sendRedirect("badRegistration.html");
            return;
        }
        if (!checkRegisterData.isLoginUniqKey(ApplicationContainer.getUsers(), phone)) {
            response.sendRedirect("identicalPhone.html");
            return;
        }
        ApplicationContainer.addUser(phone,
                new String[]{password, name, surname, town, passportId, age});
        VoicesContainer.getVoters().put(phone, new HashSet<String>());
        response.sendRedirect("successfulRegistration.html");
    }
}
