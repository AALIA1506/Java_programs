package Second;


/*Wrapper classes:It is called since it is wrapped around a primitive datatype
 * byte//Byte
 * long//Long
 * Autoboxing:Converting primitive data type into objects
 *Unboxing:Converting objects to primtive datatype
 */
public class boxingandautoboxing /*this is implementation of class*/
{

	public static void main(String[] args)
	{
		
		/*Autoboxing*/
		
		
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=50.0F;
		double d=60.0D;
		char c='a';
		boolean b2=true;
		
		/*Creating obj for part var*/
		
		Byte/*Default class*/ byteobj=b;/*Byte is class:syntax: classname classobj= value*;this will save the space*/
		Short shortobj=s;/*Since happening automatically then it is autoboxing*/
		Integer intobj=i;/*new Integer(i)-Boxing*/
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean booleanobj=b2;
		
		System.out.println(" object:"+byteobj);
		System.out.println(" object:"+shortobj);
		System.out.println(" object:"+intobj);
		System.out.println(" object:"+longobj);
		System.out.println(" object:"+floatobj);
		System.out.println(" object:"+doubleobj);
		System.out.println(" object:"+charobj);
		System.out.println(" object:"+booleanobj);
		
		
		/*Unboxing*/
		
		byte bytevalue=byteobj;/*syntax: data-type variable=value*/
		short shortvalue=shortobj;/*So this is auto-unboxing*/
		int intvalue=intobj;/*int num2=num1.intValue(): this is for assigning a object value to a primitive datatype*/
		long longvalue=longobj;
		float floatvalue=floatobj;
		double doublevalue=doubleobj;
		char charvalue=charobj;
		boolean booleanvalue=booleanobj;
		
	
		
		System.out.println(" object1:"+bytevalue);
		System.out.println(" object1:"+shortvalue);
		System.out.println(" object1:"+intvalue);
		System.out.println(" object1:"+longvalue);
		System.out.println(" object1:"+floatvalue);
		System.out.println(" object1:"+doublevalue);
		System.out.println(" object1:"+charvalue);
		System.out.println(" object1:"+booleanvalue);
		
	}
}
