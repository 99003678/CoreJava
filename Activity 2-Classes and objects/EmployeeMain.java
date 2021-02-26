package workspace;
import java.util.*;
public class EmployeeMain {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name: ");
	String str1=sc.next();
	System.out.println("Enter address: ");
	String str2=sc.next();
	System.out.println("Enter mobile no: ");
	String str3=sc.next();
	Employee e=new Employee();
	e.setName(str1);
	e.setAddress(str2);
	e.setMobile(str3);
	e.display();
	e.menu();
	
}
}
