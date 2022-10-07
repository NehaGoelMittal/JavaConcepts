package Inheritance;

public class Animal {
	private String Neha1;
	static String name = "Neha";
	public void sound()
	{
		System.out.println("Generate Sound");
	}
	
	public void name()
	{
		System.out.println("Animal");
	
	}
	
	public void test()
	{
		System.out.println("Animal-test");
		System.out.println(name);
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(name); 
		
		BullDog bd = new BullDog();
		bd.getText();
		
	}

}
