package dependencyWithCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {

	public static void main(String [] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Resturant resturantObj = (Resturant) context.getBean("resturantBen");
		resturantObj.displayWaiterNames();
	}
}
