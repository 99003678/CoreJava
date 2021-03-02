import java.util.*;

public class Cricket {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the total run scored: ");
		int run=sc.nextInt();
		System.out.println("Enter the total over faced: ");
		int over=sc.nextInt();
		float rr=run/over;
		System.out.println("Current Run rate: "+rr);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}