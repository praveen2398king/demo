package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfig.class);
    Student s = con.getBean("getStudent",Student.class);
    System.out.println(s.hashCode());
    s.study();
	}

}
