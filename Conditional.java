package Second;

public class Conditional
{
    public static void main(String[] args)
    {
    	int i=1,N=5;
    	if(N<=5)/*one time execuatble*/
    	{
    	  i++;
    	  if(i<=N)
    	  {  
    		System.out.println("The number is:"+i*10);
    			//i++;only if another o/p stmt is given this will work
    	  }
    	 }
    	 
    	
    }
}
