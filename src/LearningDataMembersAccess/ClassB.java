package LearningDataMembersAccess;

import learningJava.AccessModifiers;

public class ClassB extends AccessModifiers {

	public static void main(String[] args) {

		ClassA obj = new ClassA();
		
		System.out.println(obj.publicVariable);   //can be accessed in the same package in diff class
	//	System.out.println(obj.privateVariable);  //can not be accessed in the same package in diff class
		System.out.println(obj.protectedVariable);  //can be accessed in the same package in diff class
		System.out.println(obj.defaultVariable);   //can be accessed in the same package in diff class
		
		AccessModifiers obj1 = new AccessModifiers();
		obj1.name();
		
		
		ClassB obj2 = new ClassB(); 
		//for protected can be accessed in diif package by 1. import package 2. extends parent class 3. use child class object		
		obj2.name1();
		obj2.name();// public can be used both using parent or child class obj
		
		
	}

}
