package LearningDataMembersAccess;

public class ClassA {
	
	public int publicVariable = 10;
	private int privateVariable = 20;
	protected int protectedVariable = 30;
	int defaultVariable = 40;
	

	public static void main(String[] args) {
		
		ClassA obj = new ClassA();
		
		System.out.println(obj.publicVariable);  //can be accessed in the same class
		System.out.println(obj.privateVariable);   //can be accessed in the same class
		System.out.println(obj.protectedVariable);   //can be accessed in the same class
		System.out.println(obj.defaultVariable);    //can be accessed in the same class
		
		
		
	}

}
