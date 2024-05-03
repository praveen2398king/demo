package com.mapping2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Database is creating.....!!");

		Configuration cfg = new Configuration();
		cfg.configure("hibernateconfig.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Emp e1 = new Emp();
		e1.setEid(34);
		e1.setEname("Ram");
		
		Emp e2 = new Emp();
		e2.setEid(44);
		e2.setEname("Shyam");
		
		Emp e3 = new Emp();
		e3.setEid(54);
		e3.setEname("Mohit");
		
		Project p1 = new Project();
		p1.setPid(3);
		p1.setPname("Library Management");
		
		Project p2 = new Project();
		p2.setPid(6);
		p2.setPname("Chatbot");
		
		Project p3 = new Project();
		p3.setPid(9);
		p3.setPname("ATM Management");
		
		List<Emp> list1 = new ArrayList<Emp>();
		List<Project> list2 = new ArrayList<Project>();
		
		list1.add(e1);
		list1.add(e2);
		list1.add(e3);
		
		list2.add(p1);
		list2.add(p2);
		list2.add(p3);

		e1.setProjects(list2);
		e2.setProjects(list2);
		p3.setEmps(list1);
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(e1);
		s.save(p1);
		s.save(e2);
		s.save(p2);
		s.save(e3);
		s.save(p3);
		tx.commit();
		s.close();
		factory.close();
	}

}
