package Second;

import java.util.Scanner;

public class Menu_card {

	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number:");
	     int choice;
	     do
	     {
	    	 System.out.println("\n----Menu---");
	    	 System.out.println("1.Say Hello");
	    	 System.out.println("2.Show Date and Time");
	    	 System.out.println("3.Exit");
	    	 System.out.println("Enter your choice:");
	    	 choice=obj.nextInt();
	    	 if(choice==1) 
	    	 {
	    		 System.out.println("Hello there");
	    	 }
	    	 else if (choice==2)
	    	 {
	    		 System.out.println("Current time: "+java.time.LocalDateTime.now());
	    	 }
	    	 else if(choice==3)
	    	 {
	    		 System.out.println("Good bye");
	    	 }
	    	
	       }while(choice!=3);/*since do executes once and after that the while condn is false*/
	      
	       obj.close();
	    	   
	     

	}

}
