package com.sample.dao;

import com.sample.entity.Bla;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by anurag on 7/6/17.
 */
@Repository
public class BlaDaoImpl implements IBlaDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void create(Bla bla) {
        Session currentSession = sessionFactory.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();
        currentSession.saveOrUpdate(bla);
        transaction.commit();
    }
}
