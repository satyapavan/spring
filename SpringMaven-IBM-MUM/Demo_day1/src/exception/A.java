package exception;

public class A {
	public void f1() throws Exception{
		try {
			B b= new B();
			b.f2();
		} catch (Exception e) {
			System.out.println("A.f1()..");
			e.printStackTrace();
			//throw e;
		}

	}
}
