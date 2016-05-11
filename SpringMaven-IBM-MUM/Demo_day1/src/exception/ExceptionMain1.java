package exception;

public class ExceptionMain1 {

	public static void main(String[] args) {
		try{
		int a=10;
		int b=10;
		double c= a/b;
		String[] data = new String[10];
		//data[0]="Shantanu";
		data[0].length();
		System.out.println("No Exception...");
		}
		catch (Exception e) {
			System.out.println("Excetion raised is "+e.getMessage());
		}
		finally{
			System.out.println("Finally executes...");
		}
		System.out.println("Normal execution continues...");
	}

}
