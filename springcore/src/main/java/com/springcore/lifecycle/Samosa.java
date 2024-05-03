package com.springcore.lifecycle;

/*Video-14 For two main methods init & destroy*/
public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price for samosa");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	public void init() {
		System.out.println("Inside Init Method of samosa");
	}
	public void destroy() {
		System.out.println("Inside destroy method of samosa");
	}

}
