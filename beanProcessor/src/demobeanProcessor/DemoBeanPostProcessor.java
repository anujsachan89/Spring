package demobeanProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DemoBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("processing bean instance after initilization (i.e just after init life cycle event) of : " + arg1);
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("processing bean instance before initilization (i.e  after spring initiates bean and before inti life cycle event) of : " + arg1);

		return arg0;
	}
	

}
