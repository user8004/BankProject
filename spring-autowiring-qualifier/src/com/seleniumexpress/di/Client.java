package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("noe read the xmlFile");
		context.getBean("collegebean",College.class);
		System.out.println("The college object is created");
		
	}

}
