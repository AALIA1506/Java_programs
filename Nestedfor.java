package Second;

//Pattern program 
public class Nestedfor {

	public static void main(String[] args) 
	{
		int rows=5;
		for(int i =0;i<=rows;i++)//prints the star
		{
			for(int j=1;j<=i;j++)//jagged array-one array is dependent on another array -print the star on each row
			{
				System.out.print("*");//print and printf can be used -
			}
			  System.out.println();//move to the next line cursor
		 
		}

	}

}
