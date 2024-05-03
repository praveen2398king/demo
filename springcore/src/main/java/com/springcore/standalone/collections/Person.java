package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/*Video-21 Spring Standalone Collections for list hash and properties*/

public class Person {
	private List<String> friends;
	private Map<String,Integer> fees;
	private Properties props;

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public Map<String, Integer> getFees() {
		return fees;
	}

	public void setFees(Map<String, Integer> fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", fees=" + fees + "]";
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

}
