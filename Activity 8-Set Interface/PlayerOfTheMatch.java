import java.util.HashSet;
import java.util.*;

public class PlayerOfTheMatch 
{
public static void main(String args[])
{
	HashSet<String> hs=new HashSet<String>();
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		String str=sc.next();
		hs.add(str);
	}
	for(String s:hs)
	{
		System.out.println(s);
	}
	
	
}
}
