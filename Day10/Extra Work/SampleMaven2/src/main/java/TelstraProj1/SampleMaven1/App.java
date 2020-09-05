package TelstraProj1.SampleMaven1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class App{
    public static void main( String[] args ){
    	  //ApplicationContext context = new ClassPathXmlApplicationContext("‪spring.xml");
    	//ApplicationContext context = new FileSystemXmlApplicationContext("‪C:\\Users\\d960790\\Desktop\\spring.xml");

      	ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/spring.xml");
    	Employee emp = (Employee) context.getBean("employee");
    	
    	
    	
    	System.out.println(emp);
    	
    }
}
