package com.SpringCore.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class test {
	private static ApplicationContext context;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		context = new ClassPathXmlApplicationContext("com/SpringCore/exam/config.xml");
		exam1 p1= (exam1)context.getBean("exm");
		System.out.println(p1.getQuestion());
		System.out.println(p1.getAnswer());

	}

}
