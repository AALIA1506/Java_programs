package Second;

import java.util.Scanner;

public class While 
{
   public static void main(String[] args)
   {
	   Scanner sc= new Scanner(System.in);
	   int i=sc.nextInt();
	
	   while(i<=10)/*It exits when the cond false but not terminates*/
	   {
		   System.out.println(i);
		   i++;
	   }
   }
}
