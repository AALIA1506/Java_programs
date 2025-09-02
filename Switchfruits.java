package Second;

import java.util.Scanner;

public class Switchfruits {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		String monthString;
		switch(num)
		{
		case 1:monthString="Apple";
		break;
		case 2:monthString="Banana";
		break;
		case 3:monthString="Orange";
		break;
		case 4:monthString="Custard Apple";
		break;
		case 5:monthString="Kiwi";
		break;
		case 6:monthString="Pomegrante";
		break;
		case 7:monthString="Pineapple";
		break;
		case 8:monthString="Muskmelon";
		break;
		case 9:monthString="Grapes";
		break;
		case 10:monthString="Cherry";
		break;
		case 11:monthString="Sweet Lime";
		break;
		case 12:monthString="Strawberry";
		break;
		default:monthString="Invalid Fruit name";
		}
		System.out.println(monthString);
        sc.close();
	}
	


	}


