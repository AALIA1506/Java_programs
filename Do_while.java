package Second;

import java.util.Scanner;

public class Do_while {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
	     int num=sc.nextInt();
	     do
	     {
	    	 System.out.println(num);
	    	 num++;
	     }while(num<=10);

	}

}
