package Encapsulation;

public class ATM extends Bank{
	
	public void callTestMethod()
	{
		testMethod();
	}

	public static void main(String[] args) {

		Bank bank = new Bank();
		//bank .withdrawAmount(12345, 123, 10000);
	//	bank.withdrawAmount(12345, 123, 80000000);
	//	bank.pinNo=222;   //Since pinNo is public variable, it can be changed which is a breach
	//	bank.withdrawAmount(12345, 222, 10000);
		
		bank.updatePin(12345, 123 , 1234); //after making pin, account number as private. We are accessing data members using Encapsulation
		bank.withdrawAmount(12345, 1234, 10000);
		bank .withdrawAmount(12345, 123, 10000);
		
		System.out.println(bank.depositCash(12345, 1234, 20000));
	}

}
