import java.util.*;

public class IPL 
{
	public static void main(String args[]) 
	
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter team Names");

String str1=sc.next();
String str2=sc.next();
String str3=sc.next();
String str4=sc.next();
String str5=sc.next();


System.out.println("Enter swap positions");
int sw=sc.nextInt();

ArrayList<String> al=new ArrayList<String>();
al.add(str1);
al.add(str2);
al.add(str3);
al.add(str4);
al.add(str5);

Collections.swap(al, sw, 0);
for(String s:al)
{
	System.out.println(s);
}

}
}