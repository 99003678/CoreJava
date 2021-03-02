import java.util.Scanner;

public class CricketArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the no of overs: ");
		int over=sc.nextInt();
		System.out.println("Enter the no of runs in each over: ");
		int arr []=new int[over];
		for(int i=0;i<over;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter over number: ");
		int on=sc.nextInt();
	    System.out.println("Runs scored in the over: "+arr[on]);
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
