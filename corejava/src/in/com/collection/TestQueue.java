package in.com.collection;

import java.util.LinkedList;

public class TestQueue {
	
	public static void main(String[] args) {
		LinkedList queue = new LinkedList();

		queue.offer("sudir");
		queue.offer("rahul");
		queue.offer("sikandar");
		queue.offer("Vijay");

		System.out.println(queue.peek());

		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

	}


}
