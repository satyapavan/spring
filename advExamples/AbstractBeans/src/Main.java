import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.Cat;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"context.xml");
		Cat cat = (Cat) ctx.getBean("cat");
		System.out.println(" Cat says "+cat.getSpeak()+" and cat moves by "+cat.getMove());

	}

}
