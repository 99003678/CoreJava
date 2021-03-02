import java.util.*;

class InvalidAgeRangeException extends Exception
{
	InvalidAgeRangeException()
	{
		System.out.println("CustomException: InvalidAgeRangeException");
		System.exit(0);
	}
}


public class Age
{
	public static void main(String args[]) throws InvalidAgeRangeException  
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the player name");
		String name=sc.next();
		System.out.println("Enter player age");
		int age=sc.nextInt();
			
		if(age<=19)
		{
			throw new InvalidAgeRangeException();     
		}
		else
		{
			System.out.println(age);
		}
		System.out.println("Player Name: "+name);
		System.out.println("Player Age: "+age);	
	}
}