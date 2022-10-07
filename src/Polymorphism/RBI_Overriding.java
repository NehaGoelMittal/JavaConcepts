package Polymorphism;

import java.util.Scanner;

public class RBI_Overriding {
	
	public double getHomeLoanROI()
	{
		
		return 8.5;
	}
	
	public double getCarLoanROI()
	{
		
		return 10.5;
	}
	
	
	public RBI_Overriding getObject()
	{
		RBI_Overriding obj1 = new RBI_Overriding();
		
		return obj1; }  //return type is diff from child class
		
	public void getHomeLoanROI(String bankName)
	{
		
		System.out.println("This is in RBI class: " +bankName);
	}
	
	public RBI_Overriding getBankName(String bankName)
	{
		if (bankName.equals("AMEX"))
		{
			return new AMEX_BankOverriding();
		}
		else {return new RBI_Overriding();
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	}

}
