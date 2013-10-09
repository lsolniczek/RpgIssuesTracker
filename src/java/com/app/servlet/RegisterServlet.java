package com.app.servlet;

import com.app.entity.MUser;
import com.app.model.DAO.UserDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lukasz.solniczek
 */
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String login = request.getParameter("usernamesignup");
        String email = request.getParameter("emailsignup");
        String pass = request.getParameter("passwordsignup");
        
        UserDAO newUserDao = new UserDAO();
        Boolean newUserRegistered = newUserDao.registerUser(login, email, pass);
        MUser newUserSignup = newUserDao.findUser(login, pass);
        
        if (newUserRegistered == true && newUserSignup != null) {
            request.setAttribute("newUserRegistered", "Registration OK");
            request.getSession().setAttribute("newUser", newUserSignup);
           response.sendRedirect("home");
        } else {
            request.setAttribute("newUserRegistered", "Registration Problem");
            response.sendRedirect("#toregister");
        }
    }
}
