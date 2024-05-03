 package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        SessionFactory factory = new Configuration().configure("hibernateconfig.xml").buildSessionFactory();  // SessionFactory is an Interface, factory for providing Session - Watch Video 4 Of hibernate from 11:00

        Student student1 = new Student();
        student1.setId(12342);
        student1.setName("Ankit Tiwari");
        student1.setCity("Lucknow");
        
        Certificate certificate = new Certificate();
        certificate.setCourse("Android");
        certificate.setDuration("2 months");
        
        student1.setCerti(certificate);
        

        Student student2 = new Student();
        student2.setId(14323);
        student2.setName("Ravi Tiwari");
        student2.setCity("Allahabad");
        
        Certificate certificate1 = new Certificate();
        certificate1.setCourse("Hibernate");
        certificate1.setDuration("2.5 months");
        
        student2.setCerti(certificate1);
        
        Session s = factory.openSession();
        Transaction tx= s.beginTransaction();
        
        //objects ko save krna hai....watch hibernate video 9 12:12
        s.save(student1);
        s.save(student2);
        
        tx.commit();
        s.close();
        factory.close();
	}

}
