package com.springFramework.reference;

public class Manager {
	private String Name;
	private Employee EmpDetails;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Employee getEmpDetails() {
		return EmpDetails;
	}
	public void setEmpDetails(Employee empDetails) {
		EmpDetails = empDetails;
	}
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Manager [Name=" + Name + ", EmpDetails=" + EmpDetails + "]";
	}

	

}
