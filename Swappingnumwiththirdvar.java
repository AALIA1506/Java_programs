package Second;

import java.util.Scanner;

public class Swappingnumwiththirdvar {

	
		public static void main(String[] args) 
		{
			int x,y;
			System.out.println("Enter the value of x&y:");
			Scanner sc= new Scanner(System.in);
			x=sc.nextInt();
			y=sc.nextInt();
			System.out.println("The value before swapping the variable is:"+x+" "+y);
			
			x=x+y;
			y=x-y;
			x=x-y;
			
			System.out.println("The value after swapping is "+x+" "+y);
			sc.close();

		}


	}


