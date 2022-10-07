package hashMap;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class priorityQueueExample {

	public static void main(String[] args) {
		
		PriorityQueue <String> q1 = new PriorityQueue <String>(); //store in sequence
		
		q1.add("Test1");
		q1.add("Test2");
		q1.add("Test3");
		q1.add("Test4");
		q1.add("Test5");
		q1.add("Test6");
		
		System.out.println(q1);
		
		ArrayDeque <String> dq = new ArrayDeque <String>(); //store in sequence
		dq.add("Selenium1");
		dq.add("Selenium2");
		dq.add("Selenium3");
		dq.add("Selenium4");
		dq.add("Selenium5");
		dq.add("Selenium6");
		
		dq.addFirst("Selenium0");
		dq.addLast("Selenium7");
		
		System.out.println(dq.getClass());
		
		System.out.println(dq);
		
		
		
	}

}
