package SampleMaven4.ProjDemo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class App{
    public static void main( String[] args ){
    	  //ApplicationContext context = new ClassPathXmlApplicationContext("‪spring.xml");
    	//ApplicationContext context = new FileSystemXmlApplicationContext("‪C:\\Users\\d960790\\Desktop\\spring.xml");

    	ApplicationContext context = new FileSystemXmlApplicationContext("src\\main\\java\\spring3.xml");
    	Organization org = (Organization) context.getBean("organization");  
    	System.out.println(org);
    	
    }
}
