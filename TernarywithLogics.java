package Second;

import java.util.Scanner;

public class TernarywithLogics {

	public static void main(String[] args) 
	{
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the number to be checked whether its odd or even:");
		  int num=sc.nextInt();
		  String value=(num%2==0)?"Even":"Odd";
		  System.out.println("The value entered is:"+value);
		  sc.close();

	}

}
