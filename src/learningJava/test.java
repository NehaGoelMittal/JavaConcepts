package learningJava;

import LearningAccessModifier.Class1;
// import LearningAccessModifier.Class2;  //since Class2 is default, it is throwing error

public class test extends AccessModifiers{
	

	public static void main(String[] args) {
		
		Class1 obj = new Class1();
		obj.add();
	
		
		AccessModifiers obj1 = new AccessModifiers();
		obj1.name1();
		obj1.name2();
		obj1.name();
		AccessModifiers.example();
		example(); // after using extends
		
		test obj2 = new test(); //can access below methods after using extends
		obj2.name();
		obj2.name1();
		obj2.name2();
		obj2.example();
		
		AccessModifiers.name(); 
		
//		Class2 obj2 = new Class2();   //since Class2 is default, it is throwing error
//		obj2.show();
	}

}
