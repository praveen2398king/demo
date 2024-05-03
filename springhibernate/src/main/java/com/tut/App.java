package com.tut;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started..." );  
		/*
		 * Configuration cfg = new Configuration(); 
		 * cfg.configure();
		 *  SessionFactory factory = cfg.buildSessionFactory();
		 */
        SessionFactory factory = new Configuration().configure("hibernateconfig.xml").buildSessionFactory();  // SessionFactory is an Interface, factory for providing Session - Watch Video 4 Of hibernate from 11:00
        
        //creating student
        Student st = new Student();
        st.setId(105);
        st.setName("Sohan");
        st.setCity("Sultanpur");     
        System.out.println(st);
        
        //Creating object for address class
        Address ad = new Address();
        ad.setStreet("street3");
        ad.setCity("Chennai");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(455.0023);
        
        //Reading image
        FileInputStream fis = new FileInputStream("src/main/java/pic.jpg");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        Session session = factory.openSession(); //for clear understanding for session watch video 5 hibernate from 15:00
        Transaction tx = session.beginTransaction();
        session.save(st);
        session.save(ad);
        tx.commit();
        session.close();
        System.out.println("Done...");
    }
}
