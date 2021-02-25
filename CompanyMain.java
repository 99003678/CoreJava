package workspace;
import java.util.*;

public class CompanyMain {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name of company");
	String str=sc.next();
	System.out.println("Enter name of employyes separated by commas");
	String str1=sc.next();
	System.out.println("Enter name of team lead");
	String str2=sc.next();
	int a=0;
	String [] str3=str1.split(",");
	for(int i=0;i<str3.length;i++)
	{
		if(str2.equals(str3[i]))
		{
			a++;
			break;
		}
	}
	if(a==0)
	{
		System.out.println("Invalid Input");
		System.exit(0);
	}
	
		Company c=new Company();
		c.setName(str);
		c.setEmployees(str1);
		c.setTeamlead(str2);
		c.display();
	
}
}