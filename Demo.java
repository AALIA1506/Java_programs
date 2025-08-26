package Second;

/*No of lines reduced then code efficient*/
/*Scanner takes the obj from user and it is a class*/
import java.util.Scanner;

public class Demo 
{
  
	public static void main(String[] args)/*Passed as value,main()-method,Any keyword in caps is class*/
	
	/*public int a=10,b=20;
	public static int sum;*/
	/*normal variable and static variable takes more space*/
	/*The system.out.println brings to the array string[Hi Welcome]value 
	 which we have passed go through the object ie aalia(arg)*/
	{    
		/*int a=10,b=20*/
		
		System.out.println("Hi Welcome");/*system-class, out-keyword*/

		
		int a,b,sum,diff,mul,quo,rem;
		double c,d,sumd,diffd,muld,quod,remd;
		float e,f,sumf,difff,mulf,quof,remf;
		String s1,s2,s3;
		
		Scanner obj = new Scanner(System.in);/*Scanner opens*/
		 
		/*For integer*/
		
		System.out.println("Enter the first number:");
		a=obj.nextInt();
		System.out.println("Enter the second number:");
		b=obj.nextInt();
		
		
		/*Performing the functions*/
		
		sum=a+b;
		diff=a-b;
		mul=a*b;
		quo=a/b;
		rem=a%b;
		System.out.println("Sum is "+sum+"\nDiff is"+diff+"\nMul is "+mul+"\nQuo is "+quo+"\nRem is "+rem);
		
		/*For double*/
		
		System.out.println("Enter the double first value:");
		c=obj.nextDouble();
		System.out.println("Enter the double second value:");
		d=obj.nextDouble();
		
		sumd=c+d;
		diffd=c-d;
		muld=c*d;
		quod=c/d;
		remd=c%d;
		System.out.println("Sum is "+sumd+"\nDiff is"+diffd+"\nMul is "+muld+"\nQuo is "+quod+"\nRem is "+remd);
		
		/*For float*/
		
		System.out.println("Enter the float first value:");
		e=obj.nextFloat();
		System.out.println("Enter the floar second value:");
		f=obj.nextFloat();
	
		sumf=e+f;
		difff=e-f;
		mulf=e*f;
		quof=e/f;
		remf=e%f;
		System.out.println("Sum is "+sumf+"\nDiff is"+difff+"\nMul is "+mulf+"\nQuo is "+quof+"\nRem is "+remf);
		
		/*For String*/
		obj.nextLine();/*This will bring the space in-between*/
		System.out.println("Enter the String 1:");
		s1=obj.nextLine();
		System.out.println("Enter the String 2:");
		s2=obj.nextLine();
		s3=s1+s2;
	    System.out.println("The concatinated string is:"+s3);
	    obj.close();/*shoudlnt be readble*/
		
	
		
		
	
		
}

}


