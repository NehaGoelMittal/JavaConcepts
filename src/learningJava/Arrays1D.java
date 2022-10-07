package learningJava;

import java.util.Scanner;

public class Arrays1D {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the size of array");
		int size = scan.nextInt();
		
		int [] array = new int [size];
		
		System.out.println("Enter the numbers");
		
		for (int i=0; i<size; i++)
		{
			array[i] = scan.nextInt();
		}
		
		for (int x : array)
		{
			System.out.println(x);
		}
		
		int flag =0;
		int lock = 0;
		
		System.out.println("Enter the element position you want to delete");
		
		int item = scan.nextInt();
		
		for (int i=0; i<size; i++)
		{
			if(array[i]==item)
			{
				flag = 1;
				lock = i;
				
				System.out.println("Item deleted: " + array[i] + " Lock is" + lock);
				break;
			}
			
			else
			{
				flag=0;
			}
			
		}
		
		if (flag ==1)
		{
			for (int i1=lock+1; i1<size; i1++ )
			{	
				
				array[i1-1]=array[i1];
				System.out.println(array[i1]);
			}
			
			System.out.println("Items after deletion: ");
			
		//	for (int i=0; i<size-2;i++)
			for (int i=0; i<size-1;i++)
			{
				System.out.print(array[i]+",");
			}
			
			//System.out.print(array[size-2]);
		}
		else
		{
			System.out.println("No item is deleted");
		}
		

	}

}
