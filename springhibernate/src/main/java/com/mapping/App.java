package com.mapping;

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

		// creating question
		Question ques = new Question();
		ques.setQuestion_id(12);
		ques.setQuestion("What is java");

		// creating answer
		Answer ans = new Answer();
		ans.setAnswer_id(134);
		ans.setAnswer("Java is programming language");

		ques.setAnswer(ans);
		ans.setQuestion(ques);

		// creating question
		Question ques1 = new Question();
		ques1.setQuestion_id(14);
		ques1.setQuestion("What is collection framework");

		// creating answer
		Answer ans1 = new Answer();
		ans1.setAnswer_id(145);
		ans1.setAnswer("API to work with objects in java");

		ques1.setAnswer(ans1);
		ans1.setQuestion(ques1);

		// session
		Session s = factory.openSession();

		Transaction tx = s.beginTransaction();

		// save
		s.save(ques);
		s.save(ans);
		s.save(ans1);
		s.save(ques1);

		tx.commit();
		
		/*
		 * //fetch 
		 * Question newQ = (Question)s.get(Question.class, 12);
		 * System.out.println(newQ.getQuestion());
		 * System.out.println(newQ.getAnswer().getAnswer());
		 */
		s.close();
		factory.close();
	}

}
