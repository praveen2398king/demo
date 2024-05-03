package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/*Video-15 Implementing bean life cycles using interface*/

public class Pepsi implements InitializingBean , DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting a price for pepsi");
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}
	public void intialization() {
		System.out.println("Insisde Init Method for pepsi");
	}
	public void destroyable() {
		System.out.println("Inside destroy method for pepsi");
	}
    // afterproperties interface ke thorugh ho rha hai
	public void afterPropertiesSet() throws Exception {  // propersties set krne ke baad ye chalega like init
		// TODO Auto-generated method stub
		//init
		System.out.println("taking pepsi");
	}

	public void destroy() throws Exception { // ye destroy method ke trh kaam krta hai
		// TODO Auto-generated method stub
		//destroy
		System.out.println("putting bottle in dustbin");
	}
	

}
