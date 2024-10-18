package com.SpringCore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			context = new ClassPathXmlApplicationContext("com/SpringCore/collection/config.xml");
			emp p1= (emp)context.getBean("emp1");
			System.out.println(p1.getName());
			System.out.println(p1.getPhone());
			System.out.println(p1.getAddress());
			System.out.println(p1.getCourses());
			
		}

	}


