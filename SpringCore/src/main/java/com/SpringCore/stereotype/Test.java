package com.SpringCore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
 public static void main(String[] args) {
	
	 ApplicationContext context =new ClassPathXmlApplicationContext("com/SpringCore/stereotype/config.xml");
	 Student s1=context.getBean("student", Student.class);
	 System.out.println(s1);
	 
	 System.out.println(s1.hashCode());
	 Student s2= context.getBean("student",Student.class);
	 System.out.println(s2.hashCode());
	 }

}
