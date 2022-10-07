package SuperKeyword;

public class BullDog extends dog{

	public BullDog()
	{	
	//	super();
		super(23);
		System.out.println("BullDog Constructor");
		
		
	}
	public void sound()
	{
		super.sound();
		
		System.out.println("Generate bulldog sound !!");
		
		super.sound();
	}
	
	public static void main(String[] args) {

		BullDog bd = new BullDog(); // called COnstructor chaining in Inheritance
		animal bd1 = new BullDog(); 
		dog bd2 = new BullDog(); 
		
		bd2.sound();
	}

}
 