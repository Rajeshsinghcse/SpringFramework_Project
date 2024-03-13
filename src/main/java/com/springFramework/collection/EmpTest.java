package com.springFramework.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {

	public static void main(String[] args) {

		ApplicationContext context =new ClassPathXmlApplicationContext("com/springFramework/collection/EmpConfig.xml");
		Employee employee1 = (Employee) context.getBean("Employee1");
		
		System.out.println(employee1.getName());
		System.out.println(employee1.getPhones());
		System.out.println(employee1.getAddresses());
		System.out.println(employee1.getCourses());
		System.out.println(employee1.getProps());
	}

}
