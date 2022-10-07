package learningJava;

import java.util.Calendar;

public class calendarExample {
	
	static int a;
	static String name;
	static boolean b;

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.getTime());
		
		System.out.println(cal.getGreatestMinimum(2));
		
		System.out.println(a);
		System.out.println(b);
		
		
		
		
		//------------------------------
		
		calendarExample ce = new calendarExample();
		ce.method();
		

	}
	
	public void method()
	{
		System.out.println(a);
	}

}
