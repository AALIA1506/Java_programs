package Second;

public class Conditionalelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int a=10,b=30,c=30;
        if(a>b && a>c)
        {
        	System.out.println("A is greatest");
        }
        else if(b>a && b>c)//(b>c) is enough
        {
        	System.out.println("B is greatest");
        }
        else if(c>a && c>b)
        {
        	System.out.println("C is greatest");
        }
        else 
        {
         	System.out.println("Two or more numbers are greatest");
        }
        /*
        int infinite=40;
        if(infinite>=40)
        {
        	System.out.println("Infinite");
        }
        */
	}

}
