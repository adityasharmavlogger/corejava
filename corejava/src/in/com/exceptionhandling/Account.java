package in.com.exceptionhandling;



public class Account{
	
	private int balance = 0;
	
	public void setBalance(int balance) {
		this.balance = balance;
		
	}
	
	public int getBalance() {
		return balance;
		
	}
	
	public void deposite(int amount) {
		
		int total = getBalance()+amount;
		
		setBalance(total);
		
		System.out.println("Balance after deposite="+getBalance());
	}
	 public  void Withdrawl(int amount)throws lnsufficientFund {
		 int total = getBalance()- amount;
		 if(total>=1000) {
			 
			 setBalance(total);
			 System.out.println("Balance after Withdrawl="+getBalance());
		 } else {
			 lnsufficientFund e = new lnsufficientFund();
			 
			 throw e;
		 }
	 }
		 


}

