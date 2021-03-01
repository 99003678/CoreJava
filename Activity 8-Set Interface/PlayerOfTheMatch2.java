import java.util.TreeSet;
import java.util.*;

public class PlayerOfTheMatch2
{
public static void main(String args[])
{
	TreeSet<String> hs=new TreeSet<String>();
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
