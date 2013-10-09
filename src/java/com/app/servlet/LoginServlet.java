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
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       String login = request.getParameter("username");
       String pass = request.getParameter("password");
       
       UserDAO newUserDao = new UserDAO();
       MUser newUserSignup = newUserDao.findUser(login, pass);
       
       if (newUserSignup != null) {
           request.setAttribute("newUserSignup", "Signing up OK");
           request.getSession().setAttribute("newUser", newUserSignup);
           response.sendRedirect("HomeServlet");
       } else {
           request.setAttribute("newUserSignup", "No such User");
           response.sendRedirect("#tologin");
       }
    }
}
