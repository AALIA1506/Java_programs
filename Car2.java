package oops;

 class Car {
	//properties also called attributes
	
		String color;
		int year;
		//method(behaviour)
		
		void startEngine()
		{
			System.out.println("Engine Started");
		}

	}

public class Car2//filename to be given in class which has main
{
	public static void main(String[] args)
	
	{
		Car mycar=new Car ();
		mycar.color="yellow";
		mycar.year=2025;
		System.out.println("My car color is:"+mycar.color);
		System.out.println("My car color is:"+mycar.year);
		
		mycar.startEngine();
		
	}
}


