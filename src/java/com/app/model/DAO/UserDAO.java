package com.app.model.DAO;

import com.app.entity.MUser;
import com.app.hibernate.cfg.NewHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author lukasz.solniczek
 */
public class UserDAO {

    public Boolean registerUser(String login, String email, String pass) {

        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        try {
            MUser newUser = new MUser();
            newUser.setChLogin(login);
            newUser.setChEmail(email);
            newUser.setChPassword(pass);
            session.save(newUser);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return false;
        }
    }

    public MUser findUser(String login, String pass) {

        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("SELECT u FROM MUser u WHERE u.chLogin = :login and u.chPassword = :password");
        query.setParameter("login", login);
        query.setParameter("password", pass);
        MUser newUser = (MUser) query.uniqueResult();
        session.close();

        return newUser;
    }

    public MUser findUserById(int id) {

        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("SELECT u FROM MUser u WHERE u.id = :id");
        query.setParameter("id", id);
        MUser newUser = (MUser) query.uniqueResult();
        session.close();

        return newUser;
    }

    public Boolean updateUser(String fname, String lname, String login, String email, String pass, int sessionUserId) {

        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        MUser newMUser = new MUser();
        newMUser.setId(sessionUserId);
        newMUser.setChName(fname);
        newMUser.setChLastname(lname);
        newMUser.setChLogin(login);
        newMUser.setChEmail(email);
        newMUser.setChPassword(pass);

        session.update(newMUser);
        session.getTransaction().commit();
        return true;
    }

    public List<MUser> findAllUser() {

        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Query query = session.createQuery("FROM MUser");
        List<MUser> listOfUsers = (List) query.list();

        session.close();

        return listOfUsers;
    }
}
