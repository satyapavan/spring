package exception;

public class Bank {
	private double balance;

	public Bank(double balance) {
		this.balance = balance;
	}

	public double withdraw(double amount) throws BalanceException {
		try {
			if (balance < amount) {
				BalanceException bx= new BalanceException();
				throw bx;
			} else {
				balance = balance - amount;
			}
		} catch (BalanceException e) {
			System.out.println(e);
			throw e;
		}
		return balance;
	}
}
