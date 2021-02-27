import java.util.*;
public class MatchMain 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
				
		System.out.println("Enter the match format");
		System.out.println("1. ODI");
		System.out.println("2. T20");
		System.out.println("3. Test");
		int mf=sc.nextInt();
		if(mf==1)
		{
			System.out.println("Enter the current score");
			int cs1=sc.nextInt();
			System.out.println("Enter the current over");
			int co1=sc.nextInt();
			System.out.println("Enter the target score");
			int ts1=sc.nextInt();
			System.out.println("Requirements");
			ODIMatch om=new ODIMatch();
			om.calculateRunRate();
			om.calculateBalls();
			om.display(cs1,ts1,co1);
		}
		else if(mf==2)
		{
			System.out.println("Enter the current score");
			int cs2=sc.nextInt();
			System.out.println("Enter the current over");
			int co2=sc.nextInt();
			System.out.println("Enter the target score");
			int ts2=sc.nextInt();
			T20Match tm=new T20Match();
			tm.calculateRunRate();
			tm.calculateBalls();
			tm.display(cs2,ts2,co2);
		}
		else if(mf==3)
		{
			System.out.println("Enter the current score");
			int cs3=sc.nextInt();
			System.out.println("Enter the current over");
			int co3=sc.nextInt();
			System.out.println("Enter the target score");
			int ts3=sc.nextInt();
			TestMatch tem=new TestMatch();
			tem.calculateRunRate();
			tem.calculateBalls();
			tem.display(cs3,ts3,co3);
		}
		else
		{
			System.out.println("Invalid Input");
		}

	}

}
