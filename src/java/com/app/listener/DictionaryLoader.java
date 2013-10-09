package com.app.listener;

import com.app.entity.MDicionary;
import com.app.entity.MUser;
import com.app.model.DAO.DictionaryDAO;
import com.app.model.DAO.UserDAO;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author lukasz.solniczek
 */
public class DictionaryLoader implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        ServletContext sc = sce.getServletContext();
        String pn = sc.getInitParameter("ProjectName");
        String is = sc.getInitParameter("IssueSize");
        String ip = sc.getInitParameter("IssuePriority");
        String it = sc.getInitParameter("IssueType");

        DictionaryDAO diDao1 = new DictionaryDAO();
        DictionaryDAO diDao2 = new DictionaryDAO();
        DictionaryDAO diDao3 = new DictionaryDAO();
        DictionaryDAO diDao4 = new DictionaryDAO();
        UserDAO usDao1 = new UserDAO();

        List<MDicionary> diPn = diDao1.getDictonaryByName(pn);
        List<MDicionary> diIs = diDao2.getDictonaryByName(is);
        List<MDicionary> diIp = diDao3.getDictonaryByName(ip);
        List<MDicionary> diIt = diDao4.getDictonaryByName(it);
        List<MUser> usUe = usDao1.findAllUser();

        sc.setAttribute("pName", diPn);
        sc.setAttribute("iSize", diIs);
        sc.setAttribute("iPriority", diIp);
        sc.setAttribute("iType", diIt);
        sc.setAttribute("siExecu", usUe);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext sc = sce.getServletContext();
        sc.removeAttribute("pName");
        sc.removeAttribute("iSize");
        sc.removeAttribute("iPriority");
        sc.removeAttribute("iType");
    }
}
