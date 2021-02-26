import java.util.*;
public class Employee1Main {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name=sc.nextLine();
		System.out.println("Enter the address : ");
		String add=sc.nextLine();
		System.out.println("Enter the mobile number : ");
		String mob=sc.nextLine();
		Employee1 e1= new Employee1();
		e1.setname(name);
		e1.setaddress(add);
		e1.setmobile(mob);
		System.out.println("Employee Details");
		System.out.println("Name: "+ e1.getname());
		System.out.println("Address: "+ e1.getaddress());
		System.out.println("Mobile: "+ e1.getmobile());
	}

}
