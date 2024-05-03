package com.hql;

import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class HQLExample {

	public static void main(String[] args) {
		
		System.out.println("HQL query starting..");
		
        SessionFactory factory = new Configuration().configure("hibernateconfig.xml").buildSessionFactory();  // SessionFactory is an Interface, factory for providing Session - Watch Video 4 Of hibernate from 11:00

        Session s= factory.openSession();
        //HQL   - Watch Hibernate VIDEO - 20
        //Syntax
        String query = "from Student where city=:x";
        
        Query q=s.createQuery(query);
        
        q.setParameter("x","Lucknow");
        
        //single  - (Unique)
        //multiple - (List)
        List<Student> list=q.list();
        
        for	(Student student:list) {
        	System.out.println(student.getName());
        }
        
        s.close();
        factory.close();
	}
}
