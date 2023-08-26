package in.com.java8;
@FunctionalInterface

public interface Hello2 {
	
	public void  sum(int a, int b);
	
	public default void defMethod() {
		System.out.println("default method...!!");
	}
	
	public static void staticMethod() {
		System.out.println("static method....!!!");
	}
	
}
