package Second;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		//Syntax:(condition)?true:false
		int max=(a>b)?a:b;
		System.out.println("The max value is:"+max);
		sc.close();

	}

}
