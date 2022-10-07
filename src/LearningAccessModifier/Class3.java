package LearningAccessModifier;

import LearningDataMembersAccess.ClassA;

public class Class3 extends ClassA {
	
	// Class Class3 is child class
	// Class ClassA is a parent class since we are trying to access the data members of the ClassA

	public static void main(String[] args) {
	
		ClassA obj = new ClassA();
		
		System.out.println(obj.publicVariable);   //can be accessed in the diff package in outside class using parent class object
	//	System.out.println(obj.privateVariable);  //cannot be accessed in the diff package in outside class using parent class object
	//	System.out.println(obj.protectedVariable);  //cannot be accessed in the diff package in outside class using parent class object
	//	System.out.println(obj.defaultVariable);   //cannot be accessed in the diff package in outside class using parent class object
		 
		
		Class3 obj1 = new Class3();
		System.out.println(obj1.publicVariable);   //can be accessed in the diff package in outside class using child class object
	//	System.out.println(obj1.privateVariable);  //cannot be accessed in the diff package in outside class using child class object
		System.out.println(obj1.protectedVariable);  //can be accessed in the diff package in outside class using child class object using Inheritence
	//	System.out.println(obj1.defaultVariable);   //cannot be accessed in the diff package in outside class using child class object
		

	}

}
