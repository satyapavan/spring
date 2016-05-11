import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.ws.Calculator;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"context.xml");
		Calculator proxy = (Calculator) ctx.getBean("wsProxy");
		System.out.println("The Sum : " + proxy.add(22, 99));

	}

}
