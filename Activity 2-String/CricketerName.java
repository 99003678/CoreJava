package workspace;
import  java.util.*;
public class CricketerName {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter First name");
	String str1= sc.nextLine();
	System.out.println("Enter Last name");
	String str2= sc.nextLine();



	String output = str1.substring(0, 1).toUpperCase() + str1.substring(1).toLowerCase();

	String output1 = str2.toUpperCase();
	String ans=output.concat(" "+output1);
	System.out.println(ans);
}
}
