import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.EmpTO;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"context.xml");
		EmpTO to = (EmpTO) ctx.getBean("empTo");
		List<String> list= (List<String>)to.getEmplist();
		for(String s:list){
			System.out.println(s);
		}

	}

}
