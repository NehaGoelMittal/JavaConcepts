package Inheritance;

public class BullDog extends Dog {

	
	public void getText()
	{
		System.out.println("In BullDog class");
	}
	
	public static void main(String[] args) {

		BullDog bdg = new BullDog();
		bdg.sound();
		

	}

}
