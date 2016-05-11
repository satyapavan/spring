package exception;

public class B {
	public void f2(){
		try {
			int a = 20;
			int b = 0;
			double d = a / b;
			System.out.println("No Exception");
		} catch (ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
			throw e;
		}
	}
}
