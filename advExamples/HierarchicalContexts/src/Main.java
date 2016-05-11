import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.Address;


public class Main {

	
	public static void main(String[] args) {
		ApplicationContext parent = new ClassPathXmlApplicationContext("context.xml");
		ApplicationContext child= new ClassPathXmlApplicationContext(new String[]{"context1.xml"}, parent);
		Address emp = (Address)parent.getBean("address");
		//System.out.println(emp.getName().getFirstName());
		System.out.println(emp.getCity());

	}

}
