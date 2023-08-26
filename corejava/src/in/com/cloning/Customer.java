package in.com.cloning;

public class Customer implements Cloneable {
	
	String name = null;
	
	Account account = new Account();
	
	public Customer(String name , int bal) {
		this.name = name;
		this.account.balance = bal;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Customer c =(Customer) super.clone();
		c.account =(Account) account.clone();
		
		return c;
	}

}
