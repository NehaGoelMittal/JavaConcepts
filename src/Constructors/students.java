package Constructors;

public class students {
	
	String studentName;
	int rollNum;
	
	public students()
	{
		System.out.println("Calling no argument Constructor in Students Class");
	}
	
	public students(String studentName, int rollNum)
	{
		System.out.println("Calling argument Constructor in Student Class");
		this.studentName = studentName;
		this.rollNum = rollNum; 
	}
	
	public static void main(String[] args) {
		
		new students();
		students obj = new students("Neha" , 101);
		System.out.println(obj.studentName);
		System.out.println(obj.rollNum);

	}	

}
