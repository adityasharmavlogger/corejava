package in.com.exceptionhandling;

public class TestAccount {
	
	public static void main(String[] args) {
		
     Account a = new Account ();
     
     a.deposite(5000);
     
     try {
    	 a.Withdrawl(3001);
     
     
     }catch (lnsufficientFund  e) {
    	 System.out.println(e);
     }
     
     
}
}

