package hashMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {

		

		LinkedList<String> ls=new LinkedList<String>();

		ls.add("India");//0th index
		ls.add("Canada");//1st index
		ls.add("Australia");//2nd index
		ls.add("China");

		ls.add("Australia1");
		ls.add("China2");
		ls.add("Australia2");
		ls.add("China1");
		ls.add(null);
		ls.add (null);


		System.out.println(ls.get(2));
		System.out.println(ls.size());
		System.out.println(ls);
		
		
		ArrayList<String> al=new ArrayList<String>();   	 

		al.add("Tosca");//0th index		
		al.add("Selenium");//1st index
		al.add("UFT");//2nd index
		al.add("JMeter");//3rd index
		al.add("Loadrunner");//4th index
		al.add("Neha");
		al.add(5, null);//inserts an item at specific location and shifts the actual existing item 

		
		System.out.println(al.get(0));
		System.out.println(al.get(2));
		System.out.println(al.get(1));
		System.out.println(al.get(4));

		System.out.println("Size of ArrayList is "+al.size());

		//System.out.println(al.remove(3));
		System.out.println(al.get(1));
		System.out.println(al);


		for(int a=0;a<5;a++) {
		    System.out.println("Value are "+al.get(a));

		    }
		
	}

	}


