package com.SpringCore.Standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			context = new ClassPathXmlApplicationContext("com/SpringCore/Standalone/collection/config.xml");
			employee p1=(employee)context.getBean("emp1");
			System.out.print(p1.getEname());
		}

	}


