package workspace;
import java.util.*;
public class Customer1Main 
{
	public static void main(String args[])
	{
		
Scanner sc=new Scanner(System.in);

System.out.println("Enter Details");
String str=sc.next();

 String [] str1=str.split(",",3);
 String a;
 
 Customer1 c=new Customer1();
 c.setName(str1[0]);
 c.setAddress(str1[1]);
 c.setMobile(str1[2]);
 
 c.display();
 
 }
}


