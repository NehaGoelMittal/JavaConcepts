package Polymorphism;

import java.util.Scanner;

public class RunningClass extends RBI_Overriding{

	public static void main(String[] args) {
		
		RunningClass rc = new RunningClass();
		rc.callBank();

	}
	
	public void callBank()
	{
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Bank name: ");
		String bankName = scan.next();
		
		RBI_Overriding bankName1 = getBankName(bankName);
		bankName1.getHomeLoanROI(bankName);
		
		
	}

}
