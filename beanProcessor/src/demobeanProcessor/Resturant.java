package demobeanProcessor;

public class Resturant{
	public void greetCustomer() {
		System.out.println("Welcome Dear Customer !! this is beanPostProcessor Demo");
	}
	public void init(){
		System.out.println("Bean is going through init");
	}
	public void destroy(){
		System.out.println("Bean Will Destroy now");
	}
}