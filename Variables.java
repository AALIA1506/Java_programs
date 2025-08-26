package Second;

public class Variables 
{
	int age=5;//instance variable
	static int staticvar=10;//static or class variable and no need for obj
	
	public void myMethod()
	{
		int localvar=4;//local variable
		System.out.println(localvar);
	}

	/*without main we can run the program but the particular program will not be called properly*/
	public static void main(String[] args)
	{
	
		//public void myMethod()//will not be called since java is oops so can be done only using objects
		Variables obj=new Variables();//obj inside class
		obj.myMethod();
		System.out.println(staticvar);//System -class, out-method
		System.out.println(obj.age);
		int year=2025;//Local variable can be declared in main also 
		System.out.println(year);
		
	}
	
	/*
	package second;
	public class nomain
	{
		static
		{
			System.out.println("hello");
			System.exit(0);//exit from program so that jvm doesnt look for main
		}
	}
	*/
		

}
