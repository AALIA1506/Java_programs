package Second;

public class ForwithCondnstmt {

	public static void main(String[] args) {
		// break,continue,jump,goto
		for(int i=0;i<=10;i++)
		{
			if(i==5)
			{
				continue;//skips 5 and prints next values
			}
			if(i==8)
			{
				break;
			}
			System.out.println(i);
		}
		

	}

}
