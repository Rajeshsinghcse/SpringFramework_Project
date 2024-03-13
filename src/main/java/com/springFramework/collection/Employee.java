package com.springFramework.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	private String Name;
	private List <String> Phones;
	private Set<String> Addresses;
	private Map<String, String> Courses;
	private Properties props;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<String> getPhones() {
		return Phones;
	}
	public void setPhones(List<String> phones) {
		Phones = phones;
	}
	public Set<String> getAddresses() {
		return Addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.Addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return Courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.Courses = courses;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public Employee(String name, List<String> phones, Set<String> addresses, Map<String, String> courses,
			Properties props) {
		super();
		Name = name;
		Phones = phones;
		Addresses = addresses;
		Courses = courses;
		this.props = props;
	}
	
	
	
	

}
