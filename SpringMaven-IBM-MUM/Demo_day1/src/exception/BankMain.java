package exception;

public class BankMain {

	public static void main(String[] args) {
		Bank bank= new Bank(20000);
		try {
			bank.withdraw(21000);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
