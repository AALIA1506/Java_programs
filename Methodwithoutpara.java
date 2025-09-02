package Second;

import java.util.Scanner;

public class Methodwithoutpara {

	
	//type 1
	    public int subNumbers(int x, int y) {
		int subtract = x - y;
		// return a value
		return subtract;
	}
	
	
	//type 2
	    public void subNumbers() {
		System.out.println("Enter values of x & y: ");
		Scanner obj = new Scanner(System.in);
		int x = obj.nextInt();
		int y = obj.nextInt();
		int subtract = x - y;
		// return a value
		System.out.println("Subtracted value is: "+subtract);
		obj.close();
	}
	
	    
	  //type 2
        public static void main(String[] args) {
        Methodwithoutpara obj1 = new Methodwithoutpara();
	    obj1.subNumbers();
     
	}
	
//	
	
//	//type 1
//        public static void main(String[] args) {
//		int a = 20, b = 10;
//     	Methodwithoutpara obj = new Methodwithoutpara();
//    	// calling the method
//    	//int outcome = obj.subNumbers(a, b); 
//  	  int outcome = obj.subNumbers(20, 10);  							// can do like this also
//     	System.out.println("The result is "+outcome);
//	
//	}
	
	

	

	


	}


