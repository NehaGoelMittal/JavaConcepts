package Polymorphism;

public class CITI_BankOverriding extends RBI_Overriding {
	
	public double getCarLoanROI()
	{
		
		return 10.5;
	}
	
	public void print()
	{
		System.out.println("child");
	}
	/*public CITI_BankOverriding getObject()
	{
		CITI_BankOverriding obj1 = new CITI_BankOverriding();
		
		return obj1;   //return type is classname
		
	}*/

	public AMEX_BankOverriding getObject()
	{
		AMEX_BankOverriding obj1 = new AMEX_BankOverriding();
		
		return obj1;   //return type is classname
		
	}
	public static void main(String[] args) {
		
		
		RBI_Overriding obj1 = new CITI_BankOverriding();
		
		System.out.println(obj1.getCarLoanROI()); // will return CITI bank override ROI
		System.out.println(obj1.getHomeLoanROI()); // will return standard RBI ROI
	//	obj1.print()   throws error The method print() is undefined for the type RBI_Overriding
		
		
		CITI_BankOverriding obj = new CITI_BankOverriding();	
		System.out.println(obj.getCarLoanROI()); // will return CITI bank override ROI
		System.out.println(obj.getHomeLoanROI()); // will return standard RBI ROI
		obj.print();
		
		
		
		

	}

}
