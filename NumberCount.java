
import java.util.*;
public class NumberCount
{
	public static void findElementCount()
	{
	Scanner sc=new Scanner(System.in);
	int n,m,i,c=0;
	
	n=sc.nextInt();
	if(n<0)
	{
		System.out.println("Invlid Input");
		System.exit(0);
	}
	int [] arr=new int[n];
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
	for(i=0;i<n;i++)
	{
	if(m==arr[i])
	{
		c++;
	}
	}
	System.out.println(c);
}
	public static void main(String args[])
	{
		findElementCount();
	}
}