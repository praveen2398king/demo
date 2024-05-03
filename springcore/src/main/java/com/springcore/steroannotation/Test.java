package com.springcore.steroannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/steroannotation/steroconfig.xml");
     Student student = con.getBean("student",Student.class);  
     // yha pr jo student object liye hai wo stero khud class naam ko lowercase me krke ussi ko object bna leta hai toh hmne bhi whi le liya hai
		/*
		 * System.out.println(student); System.out.println(student.getAddresses());
		 * System.out.println(student.getAddresses().getClass().getName());
		 */
     System.out.println(student.hashCode());
     Student student1 = con.getBean("student",Student.class);
     System.out.println(student1.hashCode());

	}

}
