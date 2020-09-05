package SampleMaven4.ProjDemo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class App{
    public static void main( String[] args ){
    	  //ApplicationContext context = new ClassPathXmlApplicationContext("‪spring.xml");
    	//ApplicationContext context = new FileSystemXmlApplicationContext("‪C:\\Users\\d960790\\Desktop\\spring.xml");

      	ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/spring3.xml");
    	Employee emp = (Employee) context.getBean("employee");
    	
//    	System.out.println(emp.getAddress());
//    	System.out.println(emp.getEmpName() + "\t" +emp.getSalary() + 
//    			"\t" + emp.getAddress().getCity() +"\t" + emp.getAddress().getPin());
    	
    	System.out.println(emp);
    	
    }
}
