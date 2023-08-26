package in.com.exceptionhandling;

	public class TestException {

		public static void main(String[] args) {

			int a = 10;

			int b = 0;
			
			String name = "abc";

			System.out.println("1");

			try {
				
				int c = a / b;
				
				System.out.println("Division = " + c);
				
				System.out.println(name.length());
				
				System.out.println(name.charAt(4));
				
			} catch (NullPointerException e) {
				
				System.out.println(5);
				
			}catch (StringIndexOutOfBoundsException e) {
				
				System.out.println(e);
				
			}catch (ArithmeticException e) {
				
				System.out.println(e);
				
			}catch (Exception e) {
				
				System.out.println(e);
				
			}

			System.out.println("6");

		}

	}




