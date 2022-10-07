package Abstraction;

public class childFirefox extends FirefoxDriver
{
	
	public void test()
	{
		captureScreenShot();
		test123();
		//system
	}

	// This is second level class, no need to define method
	
	/*public void captureScreenShot()
	{
		System.out.println("Screenshot taken in childfirefox");
	}*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test123();
		// captureScreenShot(); // possible
		
		webDriver w = new childFirefox();
		w.click(); //webDriver class
		w.captureScreenShot();
		
		
		childFirefox c = new childFirefox();
	
		c.captureScreenShot();
		c.click(); //childfifrefox class  
		//webDriver class click sysp line will be called first every time since its extending that class and that is without any method written
		
		c.test();
		
		
		//  ChromeDriver cd = new childFirefox(); throws error

	}
	
	//public abstract test();canot declare abstract method in concrete class
	
	@Override
	public void click() {
		// TODO Auto-generated method stub
		
		System.out.println("Child firefox click");
		
	}

	@Override
	public void sendKeys() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getFirefoxInstance() {
		// TODO Auto-generated method stub
		
	}

}
