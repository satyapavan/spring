import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.Emp;


public class Main {

	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		Emp emp = (Emp)ctx.getBean("emp");
		System.out.println(emp.getName().getFirstName());
	}

}
