package com.rajesh.app;

import com.rajesh.model.Employee;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;


public class LaunchStandardApp {
    public static void main(String[] args) {
        Configuration config = null;
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        boolean flag = false;

        config = new Configuration();
        config.configure();
        sessionFactory = config.buildSessionFactory();
        session = sessionFactory.openSession();

        Employee employee = new Employee();
        employee.setSid(2);
        employee.setsName("Kuheli Pramanik");
        employee.setsCity("Sagarpur");

        try
        {
            transaction = session.beginTransaction();
            session.persist(session);
            flag = true;
        }
        catch (HibernateException e)
        {
            e.printStackTrace();
        }
        finally {
                 if(flag = true)
                 {
                     transaction.commit();
                 }
                 else
                 {
                     transaction.rollback();
                 }
                 session.close();
                 sessionFactory.close();
        }

    }
}
