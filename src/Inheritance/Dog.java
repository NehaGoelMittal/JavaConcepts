package Inheritance;

public class Dog extends Animal{
	
	public void test()
	{
		name();
	}

	public static void main(String[] args) {
		
		Dog dg = new Dog();
		dg.sound();
		dg.test();
		
		Animal an = new Dog();
		an.test();

		
		
				
		Animal an1 = new Animal();		
		an1.sound();
		an1.test();
	}

}
