package Second;

//Compute 5*4*3*2*1
//5*3*1
public class Recursionfact {

	public static void main(String[] args) 
	{
		int i=1,fact=1,num=4;
		while(i<=num)
		{
			
			fact=fact*i;
			i++;
		}
		
		System.out.println("Factorial of  "+num+" is: "+fact);

	}

}
