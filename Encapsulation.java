package oops;

class Person
{
	private String name;//private attributes
	private int age;//private attributes
	
	//public method to access and update the data 
	
	public void setName(String newName)
	{//for assigning the values 
		name=newName;
	}
	public String getName()
	{//for printing the values 
		return name;
	}
	public void setAge(int newAge)
	{
		if(newAge>0)
		{
			age=newAge;
		}
	}
	public int getAge()
	{
		return age;
	}
}


public class Encapsulation {

	//Encapsulation: Datahiding+controlled access(getter and setter, private)
	public static void main(String[] args) 
	{
	    Person obj=new Person();
		obj.setName("Aalia");//syntax:obj.methodname(value);
		obj.setAge(18);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());

	}

}
