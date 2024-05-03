package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // Video 28 removing complete xml config file and use java class for configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")   //kyunki humne student class se component annotation hata diya hai... issliye hme companoent scans ki bhi jarurat nhi hai
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa() {
		
		return new Samosa();
	}

	@Bean // iss bean ko use krke hum bina xml or bina component ko use kiye apni object return kr skte hai
	public Student getStudent() {
		
		//Creating a new Object
		Student student = new Student(getSamosa());
		return student;
	}
}
