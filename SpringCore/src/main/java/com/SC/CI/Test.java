package com.SC.CI;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/SC/CI/config.xml");
		person p1=(person)context.getBean("person1");
		System.out.println(p1);
		context.close();
	}

}
