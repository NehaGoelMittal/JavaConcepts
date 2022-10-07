package Inheritance;

import java.util.ArrayList;

public class Cat extends Animal{

	public static void main(String[] args) {
		Animal an= new Animal();
		System.out.println(an.name);
		Cat ct = new Cat();
		ct.sound();
		
		ArrayList <String> al = new ArrayList <String>();
		ArrayList <String>  al1 = new ArrayList <String>();
		al.add("neha");
		al.add("Raghu");
		System.out.println(al.indexOf("Raghu"));
		System.out.println(al.get(0));
		
		
	}

	
	}


