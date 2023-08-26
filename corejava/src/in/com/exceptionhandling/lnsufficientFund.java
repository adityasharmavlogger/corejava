package in.com.exceptionhandling;


public class lnsufficientFund extends Exception {
	
	public lnsufficientFund() {
		 super("bank account balance");
	}
}