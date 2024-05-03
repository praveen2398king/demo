package com.springcore;

import java.util.HashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

/* NEW MAVEN PROJECT VIDEO */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		
		/*
		 * * yha pr hmne bina object bnaye dependency ka use krke IOC ke through object
		 * create kr liya...
		 */
		 
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student student1 = (Student) context.getBean("student1");
		System.out.println(student1);

		Student student2 = (Student) context.getBean("student2");
		System.out.println(student2);
		
		Student student3 = (Student) context.getBean("student3");
		System.out.println(student3);

	}
		/*String str = "apple";
    	HashMap<Character, Integer> hm = new HashMap<>();
    	for(int i =0 ;i<str.length();i++) {
    		if(hm.containsKey(str.charAt(i))) {
    			hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
    		}
    		else {
    			hm.put(str.charAt(i),1);
    		}
    	}
    	for(int i=0;i<str.length();i++) {
    		if(hm.get(str.charAt(i))!=0) {
    			System.out.println(str.charAt(i) +"-"+hm.get(str.charAt(i)));
    			hm.put(str.charAt(i),0);
    		}
    	}
    }*/
		/*This is my world
		Siht si ym dlrow*/
		
		/*String str[] = {"this","is","my","world"};
		for(int i =0;i<str.length;i++) {
			str[i] = reverse(str[i]);
		}
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i] + " ");
		}
		
		
	}
	public static String reverse(String s) {
		String sb = "";
		for(int i=s.length()-1;i>=0;i--) {
			sb = sb+(s.charAt(i));
		}
		return sb;
	}*/
}
