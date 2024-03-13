package com.springFramework.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Company {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springFramework/reference/CompConfig.xml");
		Manager manager = (Manager) context.getBean("Manager");

		System.out.println(manager.getName());
		System.out.println("      |         ");
		System.out.println(manager.getEmpDetails().getName());
		System.out.println(manager.getEmpDetails().getRole());

	}

}
