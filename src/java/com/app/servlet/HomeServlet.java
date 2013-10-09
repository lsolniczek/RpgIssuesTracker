/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.servlet;

import com.app.entity.MSingletask;
import com.app.model.DAO.SingleTaskDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lukasz.solniczek
 */
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        SingleTaskDAO allTasksDao = new SingleTaskDAO();
        
        List<MSingletask> allTasks = allTasksDao.getAllTaskList();
        
        request.getSession().setAttribute("allTasks", allTasks);
        response.sendRedirect("home");
    }
}
