package hashMap;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet <String> hs = new HashSet<String>(); //Un-sorted data
		
		hs.add("Java");
		hs.add("SQL");
		hs.add("Testing");
		hs.add("Selenium");
		
		System.out.println(hs);
		System.out.println(hs.remove("Java"));
		System.out.println(hs);

	}

}
