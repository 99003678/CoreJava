
import java.util.*;
public class Great
{
	public static void findCricketerId()
	{
	Scanner sc=new Scanner(System.in);
	int n,m,i,c=0;
	
	n=sc.nextInt();
	if(n<0)
	{
		System.out.println("Invlid Input");
		System.exit(0);
	}
	
	int [] arr=new int[100];
	for(i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
		if(arr[i]<0)
		{
			System.out.println("Invlid Input");
			System.exit(0);
		}
		
	}
	m=sc.nextInt();
	if(m<0)
	{
		System.out.println("Invlid Input");
		System.exit(0);
	}
	
	for(i=0;i<n;i++)
	{
	if(m<arr[i])
	{
		System.out.println(arr[i-1]);
	}
	}
	
}
	public static void main(String args[])
	{
		findCricketerId();
	}
}