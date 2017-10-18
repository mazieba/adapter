package capgemini.fire.pandas.adapter;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import capgemini.fire.pandas.adapter.config.AdapterSpringConfig;
import capgemini.fire.pandas.adapter.packagea.BeanAClass;

public class AdapterApp {

	public static void main(String[] args) {
		System.out.println("Running application");
//		ApplicationContext context = new AnnotationConfigApplicationContext(AdapterSpringConfig.class);
//		BeanAClass beanA = context.getBean(BeanAClass.class);
//		beanA.aboutMe();
	}

}
