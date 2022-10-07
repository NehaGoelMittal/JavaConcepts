package Polymorphism;

public class OverloadingExample {
	
	
	public void add (int a, int b)
	{}
	
	public void add (int a, int b, int c)
	{}
	
	public void addition (int... a)
	{
		System.out.println(a);
		int[] var = a;
		
		System.out.println(var);
		
		for (int i=0; i<var.length; i++)
		{
			System.out.println(var[i]);
		}
		
		for (int j : var)
		{
			System.out.println(j);
		}
		
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		
		OverloadingExample obj = new OverloadingExample();
		obj.addition(10,20,30,40,50);
		
	}

}
