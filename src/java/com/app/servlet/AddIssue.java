/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.servlet;

import com.app.entity.MDicionary;
import com.app.entity.MSingletask;
import com.app.entity.MUser;
import com.app.model.DAO.DictionaryDAO;
import com.app.model.DAO.SingleTaskDAO;
import com.app.model.DAO.UserDAO;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lukasz.solniczek
 */
public class AddIssue extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Date date = new Date();
        DictionaryDAO dicDao = new DictionaryDAO();
        UserDAO userDao = new UserDAO();

        MDicionary pr = dicDao.getDictonaryById(Integer.parseInt(request.getParameter("project")));
        MDicionary it = dicDao.getDictonaryById(Integer.parseInt(request.getParameter("iType")));
        String tt = request.getParameter("title");
        String dc = request.getParameter("desc");
        String ai = request.getParameter("add_info");
        MDicionary pri = dicDao.getDictonaryById(Integer.parseInt(request.getParameter("prio")));
        MDicionary is = dicDao.getDictonaryById(Integer.parseInt(request.getParameter("issSize")));
        MUser ex = userDao.findUserById(Integer.parseInt(request.getParameter("execu")));
        MUser ah = (MUser) request.getSession().getAttribute("newUser");
        Timestamp ts = new Timestamp(date.getTime());

        SingleTaskDAO sTaskDao = new SingleTaskDAO();
        Boolean newSingleTask = sTaskDao.addSingleTask(pr, it, tt, dc, ai, pri, is, ex, ah, ts);

        SingleTaskDAO allTasksDao = new SingleTaskDAO();
        List<MSingletask> allTasks = allTasksDao.getAllTaskList();

        if (newSingleTask == true) {
            request.getSession().removeAttribute("allTasks");
            request.setAttribute("newIsseAdd", 1);
            request.getSession().setAttribute("allTasks", allTasks);
            response.sendRedirect("home?newIsseAdd=1");
        } else {
            request.setAttribute("newIsseAdd", "Updating Error");
            request.getRequestDispatcher("home").forward(request, response);
        }
    }
}
