package hashMap;

import java.util.Stack;

public class stackExample {

	public static void main(String[] args) {
		
		Stack <String> st1 = new Stack <String>();
		 //storing in sequence
		
		st1.push("Selenium");
		st1.push("Java");
		st1.push("GIT");
		st1.push("Collection");
		
		st1.pop(); //delete the last value
		st1.push("Testing");
		
		System.out.println(st1);
		
		System.out.println(st1.peek()); //return the last value
	}

}
