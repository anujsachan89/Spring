package lifeCycleofBean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Resturant implements InitializingBean, DisposableBean{

	public void greetCustomer()
	{
	System.out.println("Welcome dear Customer !! This is LifeCycle Demo");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Resturant bean is going through afterPropertiesSet");
		
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Resturant Bean is destroying now");
	}
	
}
