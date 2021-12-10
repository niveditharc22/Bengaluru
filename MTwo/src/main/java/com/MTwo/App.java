package com.MTwo;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        MD m =new MD();
        m.setEid(1);
        m.setEname("NISRAGA");
        m.setEplace("mp");
        m.setCurrentTime(new Date());
        
        Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(MD.class);
        
        SessionFactory factory=con.buildSessionFactory();
        
        Session session=factory.openSession();
        
        Transaction tx=session.beginTransaction();
  
        session.save(m);  
        tx.commit();
        
        }
}


