package Second;

import java.util.Scanner;

public class Ternarystring {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age to be checked whether they are eligible to vote or not:");
		int age=sc.nextInt();
		String result=(age>=18)?"Adult":"Minor";
		System.out.println("The candidate is : "+result);
        sc.close();
	}

}
