package Second;

import java.util.Scanner;
//boolean used for if-else and ternary
public class TernarywithBoolean {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the login status:");
		boolean isLoggedIn=sc.nextBoolean();
		String message=isLoggedIn?"Welcome back!":"Please log in";
		System.out.println(message);
		sc.close();

	}

}
