package org.anuj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {

	public static void main (String [] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Resturant resturantObj = (Resturant) context.getBean("resturantBean");
		resturantObj.greetCustomer();
		int x = resturantObj.additionOfNumbers();
		resturantObj.welcomeCustomer();
		System.out.println(x);
	}
}