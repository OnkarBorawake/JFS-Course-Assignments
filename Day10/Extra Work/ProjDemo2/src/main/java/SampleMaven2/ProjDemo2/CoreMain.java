package SampleMaven2.ProjDemo2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
public class CoreMain {

	public static void main(String[] args) {

		//BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Welcome welcomeObj1 = (Welcome) context.getBean("welcome1");
		System.out.println(welcomeObj1.getMessage());		
		context.registerShutdownHook();
		
//		((AbstractApplicationContext)context).registerShutdownHook();
		
		
//		Welcome welcomeObj = (Welcome) context.getBean("welcome");
//		System.out.println(welcomeObj.getMessage());
//		
//		Welcome welcomeObj1 = (Welcome) context.getBean("welcome1");
//		System.out.println(welcomeObj1.getMessage());
	
		
		
		
		
//		Welcome welcomeObj1 = (Welcome) factory.getBean("welcome1");
//		System.out.println(welcomeObj1.getMessage());
//		
//		
//		Welcome welcomeObj = (Welcome) factory.getBean("welcome");
//		System.out.println(welcomeObj.getMessage());
		
	
	}
}

