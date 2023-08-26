package in.com.thread;

public class Account {
	
	private int balance = 0;
	
	public void setBalance (int balance) {
		try {
			
			Thread.sleep(500);
		} catch
		(InterruptedException e) {
			
			e.printStackTrace();
		}
		this.balance = balance;
	
	}
	
	public int getBalance() {
		try {
			Thread.sleep(500);
		} catch
		(InterruptedException e) {
			
			e.printStackTrace();
		} return balance;
				
		}
	
	public synchronized void deposite(String msg, int amount ) {
		
		int total = getBalance()+ amount;
		
		setBalance(total);
		
		System.out.println(msg + "balance ="+ getBalance());
	}
	}
	
	
