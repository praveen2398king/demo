package com.springcore.autowire.annotation;

public class Address {
	
	private String City;
	private String Dist;
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getDist() {
		return Dist;
	}
	@Override
	public String toString() {
		return "Address [City=" + City + ", Dist=" + Dist + "]";
	}
	public void setDist(String dist) {
		Dist = dist;
	}

}
