package Second;

/*Casting: only datatype sizes can be casted no classes or objects 
 * smaller to higher- widening casting or automatic casting 
 * 
 * byte>short>char>int>long>float>double
 * 
 *  higher to smaller- Narrowing casting or Manual casting 
 */
public class casting 
{
public static void main(String[] args)
{
    int myInt=9;
    double myDouble=myInt;
    System.out.println("The value of myInt1 is:"+myInt);
    System.out.println("The value of myDouble1 is:"+myDouble);
    
    double myDouble1=9.78d;
    int myInt1=(int)myDouble1;
    System.out.println("The value of myInt1 is:"+myInt1);
    System.out.println("The value of myDouble1 is:"+myDouble1);
}

}