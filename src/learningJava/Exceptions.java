package learningJava;

public  class Exceptions {
	
	

	//	public static void main(String[] args) throws InterruptedException {
	 //throws is a keyword
	// InterruptedException is a child of Exception class
	//InterruptedException is a caught exception handling sleep exception
	
		public static void main(String[] args) throws Exception {
		// throws Exception is handling the user created exception
		
		System.out.println("Begining");

		try {

			int divide = 10 / 0; //Runtime exception
			System.out.println(divide);

		} catch (Throwable t) {
			System.out.println("Error Occured");
			System.out.println(t.getMessage());
			t.printStackTrace();  
		}
		System.out.println("Ending");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread.sleep(2000); // If we try catch block for sleep, then everytime we use sleep in prog we have to use try catch for sleep
		
		
		System.out.println("-----------------------");
		
		try {
		int[] i = new int[4];
		i[5]=100;  //Runtime exception
		}
		catch(Throwable t){
			System.out.println("Array Error Occured");
			System.out.println(t.getMessage());
			t.printStackTrace();
		}
		finally
		{
			System.out.println("In finally block");
		}
		
		throw new Exception ("My own exception created"); // Using throw keyword we can create our own exception

	}

}



