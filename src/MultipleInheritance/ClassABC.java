package MultipleInheritance;

public class ClassABC extends ClassDEF implements InterfaceA, Interface2{

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("click from ClassABC");
	}
	
// TODO Auto-generated method stub

	public static void main (String[] args)
	{
		ClassABC abc = new ClassABC();
		abc.click();
		
		ClassDEF def = new ClassABC();
		def.click();
		
		ClassDEF obj = new ClassDEF();
		obj.click();
		
		
		
		
		
	}

}
