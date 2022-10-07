package learningJava;

public class AccessModifiers {
	
	static int i =4;
	final int a=12;
	
	static void example()
	{
		final int a=10;
		System.out.println("default example");
		System.out.println("a= "+a);
		
	}
	
	int j=6;
	
	
		
	public static void name()
	{
		int a = 11;
		System.out.println("Neha Mittal");
		i=7;
		System.out.println(i);
		System.out.println("==================================");
	}
	
	protected void name1()
	{
		name();
		System.out.println("Neha Goel Mittal");
	}
	
	void name2()
	{
		
		name1();
		i=5;
		j=8;
		System.out.println("++++++++++++"+i);
		System.out.println("Mrs. Neha Goel Mittal");
	}
	
	public static void main(String[] args) {
		
		
		
		AccessModifiers obj = new AccessModifiers();
		obj.name2();
		obj.name1();
		System.out.println("a is = "+obj.a);
		obj.example();
		// obj.a=7; // not possible to change the value since its final		
		
		name();
		System.out.println("****************************");
		System.out.println(obj.i);
		System.out.println(obj.j);
		
		AccessModifiers obj1 = new AccessModifiers();
		System.out.println("(((((((((((((((((((((((((((((");
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		
		int j=9; int i=10;
		AccessModifiers obj2 = new AccessModifiers();
		obj2.name2();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println(obj2.i);
		System.out.println(obj2.j);
		
		AccessModifiers obj3 = new AccessModifiers();
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println(obj3.i);
		System.out.println(obj3.j);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println(i);
		System.out.println(j);
		
		
		
	}
	
	

}
