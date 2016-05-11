package exception;

import java.util.logging.Logger;

public class ABMain {

	public static void main(String[] args) {
		Logger logger= Logger.getLogger("demo");
		try {

			A a = new A();
			a.f1();
		} catch (Exception e) {
			logger.info("AB Main "+e);
			e.printStackTrace();
		}
		System.out.println("Success...");
	}

}
