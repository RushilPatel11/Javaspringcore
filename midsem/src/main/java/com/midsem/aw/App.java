package com.midsem.aw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	private static ApplicationContext context;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        context = new ClassPathXmlApplicationContext("com/midsem/aw/config.xml");
        Employee q1 =(Employee)context.getBean("dep");
        System.out.print(q1);
        
    }
}
