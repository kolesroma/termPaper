package com.kolesnyk.termPaper.authentication;

import com.kolesnyk.termPaper.dataShadowing.Encryptor;
import com.kolesnyk.termPaper.containers.ApplicationContainer;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String typedLogin = (String) request.getParameter("login");
        String typedPassword = (String) request.getParameter("password");
        if (ApplicationContainer.getUsers().containsKey(typedLogin) &&
            typedPassword.equals(ApplicationContainer.getUsers().get(typedLogin)[0])) {
            // transfer data into session
            request.getSession().setAttribute("login", typedLogin);
            request.getSession().setAttribute("password",
                    Encryptor.hidePassword(ApplicationContainer.getUsers().get(typedLogin)[0]));
            request.getSession().setAttribute("name", ApplicationContainer.getUsers().get(typedLogin)[1]);
            request.getSession().setAttribute("surname", ApplicationContainer.getUsers().get(typedLogin)[2]);
            request.getSession().setAttribute("town", ApplicationContainer.getUsers().get(typedLogin)[3]);
            request.getSession().setAttribute("passportId", ApplicationContainer.getUsers().get(typedLogin)[4]);
            request.getSession().setAttribute("age", ApplicationContainer.getUsers().get(typedLogin)[5]);
            response.sendRedirect("myOffice.jsp");
        } else {
            response.sendRedirect("wrongPassword.html");
        }
    }
}