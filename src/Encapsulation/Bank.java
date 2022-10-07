package Encapsulation;

public class Bank {
	
//	public int accountNo = 12345; // making this as public user can call this accountNo or can change it using object of this call in ATM class
//	public int pinNo = 123;   // making this as public user can call this pinNo or can change it using object of this call in ATM class
	
	private int accountNo = 12345;
	private int pinNo = 123;
	public double balanceAmount = 100000;
	
	
	
	
	public double getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}

	public void withdrawAmount(int accNo, int pin, int amt)
	{
		
		if(accountNo == accNo && pinNo == pin)
		{
			if(amt<=balanceAmount)
			{
				balanceAmount = balanceAmount - amt;
				System.out.println("BalanceAmount is:"+balanceAmount);
			}else
			{
				System.out.println("Insufficient Balance");
			}
			
		}else
		{
			System.out.println("Invalid credentials");
		}
	}
	
	public void updatePin(int accNo, int oldPin, int newPin)
	{
		if (accNo==accountNo && oldPin==pinNo)
		{
			pinNo = newPin;
			System.out.println("Pin changed successfully");
		}else
		{
			System.out.println("Invalid credentials");
		}
		
	}
	
	public double depositCash(int accNo, int pin, double amt)
	{
		if(accountNo == accNo && pinNo == pin)
		{
			balanceAmount = balanceAmount + amt;
			return(balanceAmount);
		}else
		{
			System.out.println("Invalid credentials");
			return(balanceAmount);
		}
		
	}
	
	public void testMethod()
	{}
	
	public static void main(String[] args) {


		
	}

}
