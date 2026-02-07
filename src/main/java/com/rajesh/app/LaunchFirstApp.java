package com.rajesh.app;


import com.rajesh.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LaunchFirstApp {
    public static void main(String[] args) {


        //step 01 :  Configuration Object
         Configuration config = new Configuration();

        //step 2 configure hibernate.cfg.xml. file to Configuration Object
        config.configure();

        //step 3: create SessionFactory Object
        SessionFactory sessionFactory = config.buildSessionFactory();

        //setp 4 : Get The  Session Object from  Session Factory
        Session session = sessionFactory.openSession();

        //setp 5 Begin The Transaction within Session
        Transaction transaction = session.beginTransaction();


        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Rajesh");
        employee.setCity("Barasat");

        //Step 6 Perform Operation
         session.save(employee);

         //setp 7 performing Transaction operations
        transaction.commit();

        //setp 8 Close the Session
        session.close();
    }
}
