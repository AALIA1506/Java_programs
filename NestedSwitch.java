package Second;

import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the degree:");
		String degree=sc.nextLine();
		System.out.println("Enter the course:");
		String course=sc.nextLine();
		//String degree="BE";
		//String course="IT";
		switch(degree)
		{
		case "Btech":
			System.out.println("Degree is Technology");
			switch(course)
			{
			case "IT":
				System.out.println("Course is IT");
				break;
			case "Chemical":
				System.out.println("Course is Chemical");
				break;
			case "Bio":
				System.out.println("Course is Biotech");
				break;
			default:
				System.out.println("Other Degree");
			}
		break;	
		default:
		System.out.println("Not similar degree");

	    }
	}
}


