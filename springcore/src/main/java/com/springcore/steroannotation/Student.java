package com.springcore.steroannotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*Video -22 SteroType Annotations*/

@Component // component annotation ke use hum config me bina bean declare kiye bhi apna object value sab nikal skte hai
@Scope("prototype") // scope hmesha component ke saath aayega ... aur agar singleton nhi chahyie koi aur scope chahyie toh hum usko scope ke through declare kr skte hai... for more information watch Vdieo = 24
public class Student {
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", addresses=" + addresses + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	@Value("Praveen")
	private String name;
    @Value("Renukoot")
	private String city;
    @Value("#{temp}") // for this clear approach watch video  23 for collections use in steroannotation
    private List<String> addresses;

	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

}
