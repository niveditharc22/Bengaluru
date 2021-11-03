package com.MTwo;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App3 
{
    public static void main( String[] args )
    {
        MD3 obj1 =new MD3();
        MD3 obj2=new MD3();
     
       obj1.setEname("JJ");
       obj2.setEname("gtii");
       obj1.setEplace("ki");
       obj2.setEplace("UiPu");
        
        Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(MD3.class);
        
        SessionFactory factory=con.buildSessionFactory();
        
        Session session=factory.openSession();
        
        Transaction tx=session.beginTransaction();
  
        session.save(obj1);  
        session.save(obj2); 
        tx.commit();
        
        }
}


