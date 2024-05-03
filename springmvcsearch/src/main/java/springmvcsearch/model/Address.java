package springmvcsearch.model;

public class Address {

	private String street;
	private String city;
	private int pinCode;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
}
