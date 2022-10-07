package hashMap;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class hashTableExample {

	public static void main(String[] args) {
		
		//values not stored in sequence
		Hashtable<Integer, String> table=new Hashtable<Integer, String>();
		table.put(100, "One Hundred");
		table.put(200, "Two Hundred");
		table.put(300, "Three Hundred");
		table.put(400, "Four Hundred");
		table.put(500, "Five Hundred");
		table.put(500, "Six Hundred"); 
		//over write the value at 500
		table.put(800, "cannot store null value & key");
		
		System.out.println(table.size());

		System.out.println(table.get(200));

		System.out.println(table.get(500));
		
		
		for(Map.Entry str1: table.entrySet()) {
		    System.out.println(str1.getKey()+"  "+str1.getValue() );}
		
		for(Entry<Integer,String> str : table.entrySet())
			System.out.println(str.getKey());
		   
		System.out.println(table);

		    
	}

}
	
