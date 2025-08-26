package Second;

import java.util.Scanner;

public class Alternate_num {

	public static void main(String[] args)
	{
		
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     int sum=0;
     while(num<=10)
     {
    	 sum+=num;
    	 num+=2;
     }
     System.out.println("The Alterante numbers sum is:"+num);
	}

}
