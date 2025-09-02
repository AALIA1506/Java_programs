package Second;
//enumeration: Fixed set of data
enum Day//datatype
{Mon,Tue,Wed,Thur,Fri};//takes value as such and we cannot get from user
//works as constant and these are public,static and final (constant)
public class Switchenum {

	public static void main(String[] args) 
	{  
		//jvm will not allow enum if given inside
		Day today=Day.Mon;
		String monthPrint;
		switch(today)
		{
		case Mon:monthPrint=("It is a Monday");
		break;
		case Tue:monthPrint=("It is a Tuesday");
		break;
		case Wed:monthPrint=("It is a Wednesday");
		break;
		case Thur:monthPrint=("It is a Thursday");
		break;
		case Fri:monthPrint=("It is a Friday");
		break;
		default:monthPrint=("It is not in the enum list");
		break;
		}
		System.out.println(monthPrint);
		

	}

}
