package SuperKeyword;

public class dog extends animal{
	
	public dog()
	{
		System.out.println("Dog Constructor");
	}
	
	public dog(int i)
	{
		System.out.println(i);
	}
	
	public void sound()
	{
		super.sound();
		
		System.out.println("Generate dog sound !!");
		
		super.sound();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
