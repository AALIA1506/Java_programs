package oops;

public class Encapsulation1 {
	
	private String name;
	
	public void setName(String newName)
	{
		this.name=newName;//"this" is used in same class
	}
	public String getName()
	{
		return name;
	}

	public static void main(String[] args) 
	{
		Encapsulation1 obj=new Encapsulation1();
		obj.setName("Anto");
		System.out.println(obj.getName());
 
	}

}
