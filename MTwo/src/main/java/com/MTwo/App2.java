package com.MTwo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App2 
{
    public static void main( String[] args )
    {
        MD1 m1 =new MD1();
        m1.setEid(6);
        m1.setEname("Kavya");
        m1.setEplace("NYC");
        
        Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(MD1.class);
        
        SessionFactory factory=con.buildSessionFactory();
        
        Session session=factory.openSession();
        
        Transaction tx=session.beginTransaction();
  
        session.save(m1);  
        tx.commit();
        
        }
}



