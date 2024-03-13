package com.springFramework.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Result {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springFramework/Constructor/constrConfig.xml");
		Student student = (Student) context.getBean("Student");

		

		Addition addition = (Addition) context.getBean("sum");
		Addition addition1 = (Addition) context.getBean("sum1");
		Addition addition2 = (Addition) context.getBean("sum2");

		addition.doSum();
		addition1.doSum();
		addition2.doSum();
		
		
		System.out.println(student);

	}

}
