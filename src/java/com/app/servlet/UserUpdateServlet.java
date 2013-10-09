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
public class UserUpdateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //int id = Integer.parseInt(request.getParameter("id"));
        String fname = request.getParameter("userfnamesignup");
        String lname = request.getParameter("userlnamesignup");
        String login = request.getParameter("usernamesignup");
        String email = request.getParameter("emailsignup");
        String pass = request.getParameter("passwordsignup");
        
        MUser sessionUser = (MUser) request.getSession().getAttribute("newUser");
        int sessionUserId = sessionUser.getId();

        UserDAO newUserDao = new UserDAO();
        Boolean newUpdatedUserDao = newUserDao.updateUser(fname, lname, login, email, pass, sessionUserId);

        MUser newUserSignup = newUserDao.findUser(login, pass);

        if (newUpdatedUserDao == true) {
            request.getSession().removeAttribute("newUser");
            request.getSession().setAttribute("newUser", newUserSignup);
            request.setAttribute("newUserUpdate", 1);
            response.sendRedirect("edit?newUserUpdate=1");
        } else {
            request.setAttribute("newUserUpdate", "Updating Error");
            request.getRequestDispatcher("edit").forward(request, response);
        }

    }
}
