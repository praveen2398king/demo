package com.springcore.autowire;

/*Video - 18 Autowiring Using XML byName, byType, byConstuctor*/

public class Employee {
         private Address address;

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			System.out.println("Setting Value");
			this.address = address;
		}

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
