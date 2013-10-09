package com.app.model.DAO;

import com.app.entity.MDicionary;
import com.app.entity.MSingletask;
import com.app.entity.MUser;
import com.app.hibernate.cfg.NewHibernateUtil;
import java.sql.Timestamp;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author lukasz.solniczek
 */
public class SingleTaskDAO {

    public Boolean addSingleTask(MDicionary pr, MDicionary it, String tt, String dc, String ai, MDicionary pri, MDicionary is, MUser ex, MUser ah, Timestamp ts) {

        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        try {
            MSingletask newTask = new MSingletask();

            newTask.setMDicionaryBySiProject(pr);
            newTask.setMDicionaryBySiIssuesize(is);
            newTask.setMUserBySiExecutor(ex);
            newTask.setMDicionaryBySiPriority(pri);
            newTask.setMUserBySiAuthor(ah);
            newTask.setMDicionaryBySiIssuetype(it);
            newTask.setChTitle(tt);
            newTask.setChDescription(dc);
            newTask.setChAddinfo(ai);
            newTask.setDtCreatedate(ts);

            session.save(newTask);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            session.getTransaction().rollback();
            return false;
        }
    }

    public List<MSingletask> getAllTaskList() {

        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM MSingletask");
        List<MSingletask> listOfTasks = (List) query.list();
        session.close();

        return listOfTasks;
    }
}
