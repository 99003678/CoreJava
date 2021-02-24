import java.util.*;
public class Leap {
	public static int CheckLeapYear()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year to check for leap year: ");
		int year=sc.nextInt();
		int result = 0;
		if(year%4==0 && year>=0)
		{
			result=1;
		}
		else if(year%4!=0 && year>=0)
		{
			result=0;
		}
		else
		{
			result=-1;
		}
		return result;
	}
	public static void main(String[] args) {
		
		int y=CheckLeapYear();
		if(y==1)
		{
			System.out.println("yes");
		}
		else if(y==0)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("invalid input");
		}
		
	}

}

	