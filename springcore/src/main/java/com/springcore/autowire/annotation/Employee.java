package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/*Video - 19 Autowiring Using XML Annotation... there are three ways ... ek properties ke upprr or ek setter injection ke upprr aur ek constuctor ke uppr*/

public class Employee {
	    @Autowired
	    @Qualifier("address1") // Video -20 agar do bean use krna hai toh... toh aap qualifier use krke dependicei inject krke kis bean ka refrence or object dlana chahte hai....
         private Address address;

		public Address getAddress() {
			return address;
		}

		//@Autowired
		public void setAddress(Address address) {
			System.out.println("Setting Value");
			this.address = address;
		}
		
	   //  @Autowired
	   
		public Employee(Address address) {
			super();
			this.address = address;
			System.out.println("Inside Consturctor");
		}

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Employee [address=" + address + "]";
		}
}
