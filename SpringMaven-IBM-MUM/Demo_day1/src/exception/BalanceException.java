package exception;

public class BalanceException extends Exception {
	private static final long serialVersionUID = 1L;

	public BalanceException() {

	}

	public BalanceException(String message) {
		super(message);
	}

	@Override
	public String toString() {

		return "You have low balance,try after depositing some money";
	}

}
