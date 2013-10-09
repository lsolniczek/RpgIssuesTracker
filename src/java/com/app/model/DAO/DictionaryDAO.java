package com.app.model.DAO;

import com.app.entity.MDicionary;
import com.app.hibernate.cfg.NewHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author lukasz.solniczek
 */
public class DictionaryDAO {

    public List<MDicionary> getDictonaryByName(String pn) {

        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM MDicionary WHERE chType = :type");
        query.setParameter("type", pn);
        List<MDicionary> listOfDicionary = (List) query.list();
        session.close();

        return listOfDicionary;
    }

    public MDicionary getDictonaryById(int pn) {
        MDicionary dictioanryValue;
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM MDicionary WHERE id = :id");
        query.setParameter("id", pn);

        dictioanryValue = (MDicionary) query.uniqueResult();
        session.close();

        return dictioanryValue;
    }
}
