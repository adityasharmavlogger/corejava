package in.com.oops;

public class HomeLoan {
	
	public static void main(String[] args) {
		
		Bank [] banks = new Bank [3];
		
		banks[0] = new AxisBank();
		banks[1] = new HDFCBank();
		banks[2] = new ICICIBank();
		loanEnquiry (banks);
		
	}

	private static void loanEnquiry(Bank[] banks) {
         
		for (Bank b : banks) {
			
			String name = b.getName();
			double rate = b.interestRate();
			System.out.println(name +" = " + rate);
			
		}
	}

}
