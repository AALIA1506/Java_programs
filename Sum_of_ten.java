package Second;

import java.util.Scanner;
public class Sum_of_ten {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Give the num:");
		int i=sc.nextInt();
		int sum=0;
		
		while(i<=10)
		{
			sum=sum+i;//sum+=i
			i++;
			/*System.out.println("The sum of ten digits is:"+sum);-prints every sum*/

		}
		System.out.println("The sum of ten digits is:"+sum);

	}

}
