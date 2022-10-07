package interfaceExamples;

public interface remoteWebDriver extends webDriver{


	
	default void sendKeys() {
		// TODO Auto-generated method stub
		System.out.println("sendkeys in remoteWebDriver");
	}
	
	public static void windowMaximize()
	{
		System.out.println("maximize windows in remoteWebDriver");
	}
	
	public default void click() {
		// TODO Auto-generated method stub
	System.out.println("remotewebDriver click");
	}
	
}
