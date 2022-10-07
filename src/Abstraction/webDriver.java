package Abstraction;

public abstract class webDriver {
	
	public abstract void click();

	/*{
		System.out.println("webDriver Click");  // cannot write without braces
	}*/

	
	public abstract void sendKeys();
	
	public abstract void getTitle();
	
	public void captureScreenShot()
	{
		System.out.println("Screenshot taken in webDriver");
	}

	public static void main(String[] args) {
		

	}

}
