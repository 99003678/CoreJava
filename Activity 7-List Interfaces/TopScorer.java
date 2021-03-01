import java.util.*;

public class TopScorer {
	public static void main(String args[]) 
	{
Scanner sc=new Scanner(System.in);
ArrayList<String> al1=new ArrayList<String>();
ArrayList<String> al2=new ArrayList<String>();
System.out.println("ENter the top 5 scorers of IPL Season 13");
for(int i=0;i<5;i++)
{
  String str1=sc.nextLine();
  al1.add(str1);
}
System.out.println("ENter the top 5 scorers of IPL Season 13");
for(int i=0;i<5;i++)
{
  String str2=sc.nextLine();
  al2.add(str2);
}

al1.retainAll(al2); // use of retain all method

System.out.println("Consistent Run Scorer");
for(String s:al1)
{
	System.out.println(s);
}
	}

}
