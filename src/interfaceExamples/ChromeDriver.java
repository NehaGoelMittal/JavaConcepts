package interfaceExamples;

public class ChromeDriver implements remoteWebDriver{

	@Override
	public void click() {
		// TODO Auto-generated method stub
	System.out.println("ChromeDriver click");
	}
	

/*	@Override
	public void sendKeys() {
		// TODO Auto-generated method stub
		System.out.println("sendkeys in remoteWebDriver");
	}*/
	
	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		
	}
	// this class has to override the methods of bothInterfaces webDriver and remoteWebDriver
	
	public static void windowMaximize() {
		// TODO Auto-generated method stub
		
		System.out.println("maximize windows in ChromeDriver");
		
	}

 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver c = new ChromeDriver();
		c.click();
		c.sendKeys();
		c.windowMaximize();

		System.out.println(".........................................");
		
		remoteWebDriver c1 = new ChromeDriver();
		c1.click();
		c1.sendKeys();
		
		
		remoteWebDriver.windowMaximize();
	}

}
