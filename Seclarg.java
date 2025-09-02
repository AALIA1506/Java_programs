package Second;

import java.util.Scanner;

public class Seclarg {
	
	public static void main(String[] args) 
	{
	
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter the number to be checked:");
      int a=sc.nextInt();
      System.out.println("Enter the number to be checked:");
      int b=sc.nextInt();
      System.out.println("Enter the number to be checked:");
      int c=sc.nextInt();
      
      if((a>b && a<c)||(a>c && a<b))
      {
    	System.out.println(a);
      }
      else if((b>a && b<c)||(b>c && b<a))
      {
    	System.out.println(b);
      }
      else
      {
    	  System.out.println(c);
      }
      sc.close();
	}
}
      
     