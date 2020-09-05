package ShapeApplication.ShapeMaven;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeApplication {

		public static void main(String[] args) {
			
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
			
			
	        Triangle  t1 = (Triangle)context.getBean("triangle1");
			System.out.println(t1);
			
			Line  l1 = (Line)context.getBean("line1");
			System.out.println(l1);
		}

	}
