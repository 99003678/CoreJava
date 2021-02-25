package workspace;
import java.util.Scanner;
public class PlayerName {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter First player name");
	String p1= sc.nextLine();
	System.out.println("Enter Second player name");
	String p2= sc.nextLine();

	String [] name1=p1.split(" ");
	String [] name2=p2.split(" ");
	if(name1[name1.length-1].equals(name2[name2.length-1]))
	{
		System.out.println("Yes");
	}
	else
	{
		System.out.println("No");
	}
}
}
