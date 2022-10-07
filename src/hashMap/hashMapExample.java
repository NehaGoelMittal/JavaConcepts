package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class hashMapExample {

    public static void main(String[] args) {

    //<Key, value> pair

HashMap<String, Integer> hm=new HashMap<String, Integer>();
//values not stored in order
hm.put("newtest", 1004);
hm.put("Neha", 1000);
hm.put("Abhishek", 1000);
hm.put("tript", null);
hm.put("new", 2003);
hm.put("infe", null);   	 
hm.put(null, 1003);
hm.put(null, 1007);// value replaced for previous null
   	 
System.out.println(hm.size());
System.out.println(hm.get("tript"));
System.out.println(hm.keySet());
System.out.println(hm.values());
System.out.println(hm.entrySet());
System.out.println(hm);
   	 
System.out.println("--------------------------");

//Entry is an interface in Map Interface
for(Map.Entry str: hm.entrySet()) {
    System.out.println(str.getKey()+"  "+str.getValue() );
        
}

System.out.println("+++++++++++++++++++++++++++");
for(Entry<String, Integer> str: hm.entrySet()) {
System.out.println(str.getKey()+"  "+str.getValue() );

for(String keys : hm.keySet()) {
	System.out.println(keys);
}
    
}
    }
}




