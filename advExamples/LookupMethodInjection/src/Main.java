import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.Mail;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"context.xml");

		Mail mail = (Mail) ctx.getBean("mail");
		System.out.println(mail.processMessage());
		
		Mail mail1 = (Mail) ctx.getBean("mail");
		System.out.println(mail1.processMessage());
	}

}
