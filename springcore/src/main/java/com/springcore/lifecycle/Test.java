package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		context.registerShutdownHook();
		Samosa s1 = (Samosa) context.getBean("s1");
		System.out.println(s1);
		//context.registerShutdownHook(); // ista simple method hai...ki maine container ko ye bta diya hai ki mujhe jab oject destroy krna hoga toh maine hook lga kr notice de di hai ki aap destro method call kriyega
        //registring shutdownhook
		 
		System.out.println(" + ");
		
		Pepsi p1 = (Pepsi) context.getBean("p1");
		System.out.println(p1);
		
		System.out.println(" + ");
		
		Tea t1=(Tea) context.getBean("t1");
		System.out.println(t1);
	}

}
