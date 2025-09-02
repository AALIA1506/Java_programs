package Second;

import java.util.Scanner;

//more the 4 condn cannot be used ; used for lambda expression 
public class TernaryWithgradenested {//nested;logical cannot be used 

	public static void main(String[] args)
	{   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the score to evaluate the grade:");
		int score=sc.nextInt();
		String grade= (score>=90)? "A" ://colon is the continuation so moves to the next line
			          (score>=80)? "B":
			          (score>=70)? "C": "F"	;   
		System.out.println("The grade is:"+grade);
		sc.close();
                      
	}

}
