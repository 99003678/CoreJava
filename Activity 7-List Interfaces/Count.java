import java.util.ArrayList;
import java.util.Scanner;

public class Count {
	public static void main(String args[]) 
	{
Scanner sc=new Scanner(System.in);

ArrayList<Integer> al=new ArrayList<Integer>();
int count1=0,count2=0;
int n=sc.nextInt();

for(int i=0;i<n;i++)
{
  int runs=sc.nextInt();
  al.add(runs);
}
for(int i:al)
{
	if(i>=50 && i<=100)
	{
		count1++;
	}
	else if(i>100)
	{
		count2++;
	}
	
}
System.out.println(count1);
System.out.println(count2);

	}
	
}
