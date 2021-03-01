import java.util.*;

public class Cricket {
public static void main(String args[]) 
		{
	Scanner sc=new Scanner(System.in);
	System.out.println("ENter the palyer Details");
	System.out.println("Enter Player Name");
	String pn=sc.nextLine();
	System.out.println("Enter age");
	String age=sc.nextLine();
	System.out.println("Enter Country");
	String co=sc.nextLine();
	
	ArrayList<String> al=new ArrayList<String>();

	al.add(pn);
	al.add(age);
	al.add(co);
	

	for(String s:al)
		
	{
		System.out.println(s);
	}
	System.out.println("Enter skill");
	String skill=sc.next();
	System.out.println("Enter the position to add skill");
	int pos=sc.nextInt();
	al.set(pos,skill);
	for(String s:al)
	{
		System.out.println(s);
	}
	
	System.out.println("Enter the position to be removed");
	int posrem=sc.nextInt();
	
	al.remove(posrem);
	for(String s:al)
	{
		System.out.println(s);
	}
	}
}
