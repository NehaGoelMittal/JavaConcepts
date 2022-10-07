package Constructors;

public class constructorChaining {

	String studentName;
	int rollNum;
	
	public constructorChaining()
	{
		//this(Akhil, 40);
		System.out.println("Calling no argument Constructor");
	}
	
	public constructorChaining(int i)
	{
		this(); 
		System.out.println(i);
	} 
	
	public void add()
	{
		
		System.out.println("add");
		
	}
	public constructorChaining(String studentName, int rollNum)
	{
		//this();
		this(10);
		System.out.println("Calling argument Constructor in constructorChaining  Class");
		this.studentName = studentName;
		this.rollNum = rollNum;
	}
	
	public static void main(String[] args) {
		
		//new students();
		new students("Neha", 34);
		new constructorChaining();
		constructorChaining obj = new constructorChaining("Neha" , 101);
		System.out.println(obj.studentName);
		System.out.println(obj.rollNum);

	}	

}
