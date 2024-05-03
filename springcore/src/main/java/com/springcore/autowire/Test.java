package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/autoconfig.xml");
		Employee emp=context.getBean("emp",Employee.class); //Agar mujhe typecast nahi krna hai toh mai direct getBean se hm jo object lenge uske bgal me direct uske class ka naam likh denge
        System.out.println(emp);  
	}

}
