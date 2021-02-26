package workspace;
import java.util.*;
public class Employee 
{
Scanner sc=new Scanner(System.in);
	private String name;
	private String address;
	private String mobile;
	
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name=n;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String a)
	{
		address=a;
	}
	public String getMobile()
	{
		return mobile;
	}
	public void setMobile(String m)
	{
		mobile=m;
	}
	public void display()
	{
			System.out.println("Name: "+name);
			System.out.println("Address: "+address);
			System.out.println("Mobile No.: "+mobile);
	}
	public void menu()
	{
		System.out.println("Verify and Update the details:");
		System.out.println("Menu:");
		System.out.println("1. Update Employee name");
		System.out.println("2. Update Employee Address");
		System.out.println("3. Update Employee mobile");
		System.out.println("4. All information correct/Exit");
		int n=sc.nextInt();
		
		if(n==1)
		{
			System.out.println("Current name is: "+name);
			System.out.println("Enter new name: ");
			String name1=sc.next();
			name1=name;
		}
		else if(n==2)
		{
			System.out.println("Current address is: "+address);
			System.out.println("Enter new address: ");
			String address1=sc.next();
		address1=address;
		}
		else if(n==3)
		{
			System.out.println("Current mobile no is: "+mobile);
			System.out.println("Enter new no: ");
			String mobile1=sc.next();
			mobile1=mobile;
			
		}
		else if(n==4)
		{
			display();
		}
		else
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		
	}
	
}
