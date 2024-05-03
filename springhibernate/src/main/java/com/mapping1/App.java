package com.mapping1;

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

		// creating question
		Quest ques = new Quest();
		ques.setQuestionId(12);
		ques.setQuestions("What is java");

		// creating answer
		Ans ans = new Ans();
		ans.setAnswerId(134);
		ans.setAnswer("Java is programming language");
		ans.setQuestions(ques);

		// creating answer
		Ans ans1 = new Ans();
		ans1.setAnswerId(145);
		ans1.setAnswer("Java is an independent language");
		ans1.setQuestions(ques);
		
		List<Ans> list = new ArrayList<Ans>();
		list.add(ans);
		list.add(ans1);
		
		ques.setAnswers(list);

		// session
		Session s = factory.openSession();

		Transaction tx = s.beginTransaction();

		// save
		s.save(ques);
		s.save(ans);
		s.save(ans1);
		

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
