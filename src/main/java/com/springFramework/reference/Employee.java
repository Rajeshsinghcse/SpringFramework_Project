package com.springFramework.reference;

public class Employee {
	private String Name;
	private String Role;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Role=" + Role + "]";
	}

}
