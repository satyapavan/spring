package exception;

public class ExceptionMain2 {

	public static void main(String[] args) {
		try{
			try{
				int a=10;
				int b=10;
				double c= a/b;
				String[] data = new String[10];
				//data[0]="Shantanu";
				data[0].length();
				System.out.println("No Exception...");
			}
				catch(ArithmeticException e){
				System.out.println("Inner Catch :"+e.getMessage());
				}
		}
		catch (Exception e) {
			System.out.println("Outer Catch : "+e.getMessage());
		}
		finally{
			System.out.println("Finally executes...");
		}
		System.out.println("Normal execution continues...");
	}

}
