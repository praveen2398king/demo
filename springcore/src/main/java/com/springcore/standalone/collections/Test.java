package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collections/standalonecollectionconfig.xml");
		Person p1 = context.getBean("p1", Person.class);
		System.out.println(p1.getFriends().getClass().getName());
		System.out.println(p1.getFriends());
		System.out.println("  +  ");
		System.out.println(p1.getFees());
		System.out.println(p1.getFees().getClass().getName());
		System.out.println("  +  ");
		System.out.println(p1.getProps());


	}

}
