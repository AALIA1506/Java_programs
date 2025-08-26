package Second;

/*Relational Operators*/
import java.util.Scanner;
public class Demo1 
{
	public static void main(String[] args)
	{
		int x,y;
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the value of x:");
		x=obj.nextInt();
		System.out.println("Enter the value of y:");
		y=obj.nextInt();
		System.out.println(x>y);
		System.out.println(x<y);
		System.out.println(x==y);
		System.out.println(x!=y);
		System.out.println(x>=y);
		System.out.println(x<=y);
		obj.close();
		
	}
	
	

	
}
