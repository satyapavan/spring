import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.MyCustomScope;
import com.demo.spring.Name;


public class Main {

	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		Name name1 = (Name)ctx.getBean("name");
		System.out.println(name1.getFirstName());
		
		Name name2 = (Name)ctx.getBean("name");
		
		MyCustomScope s1 = (MyCustomScope)ctx.getBean("myscopeBean");
		
		s1.clearScope();
		
		Name name3 = (Name)ctx.getBean("name");
		System.out.println(name1.getFirstName());
		
		Name name4 = (Name)ctx.getBean("name");
		
	}

}
