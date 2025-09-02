package Second;

import java.util.Scanner;

public class MethodUsingSkeletonpara {
	
	public int subNumbers(int x,int y)//static int then
	{
		int subtract=x-y;
		return subtract;
	}

	public static void main(String[] args) 
	{
		//int returns zero always ;method always returns a value
		//int num1=50,num2=40;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of num1:");
		int num1=sc.nextInt();
		System.out.println("Enter the value of num2:");
		int num2=sc.nextInt();
		MethodUsingSkeletonpara obj=new MethodUsingSkeletonpara();//this is for creating obj in the specified method
		int outcome=obj.subNumbers(num1,num2);//no need of object :subNumbers()
		System.out.println("The subtracted value using method is:"+outcome);

	}

}
