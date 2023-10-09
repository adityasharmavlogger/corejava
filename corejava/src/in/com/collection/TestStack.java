package in.com.collection;

import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("darshu");
		s.push("vashu");
		s.push("alok");
		s.push("anshul");

		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

}
