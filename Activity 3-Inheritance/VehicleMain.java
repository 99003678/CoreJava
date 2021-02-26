import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class VehicleMain {
	public static void main(String args[]) throws IOException
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("1. Two Wheeler");
		System.out.println("2. Four Wheeler");
		System.out.println("Enter vehicle Type");
		
		int no=Integer.parseInt(br.readLine());
		
		if(no==1)
		{
			System.out.println("Vehicle Make: ");
			String make=br.readLine();
			System.out.println("Vehicle Number: ");
			String num=br.readLine();
			System.out.println("Fuel Type: ");
			System.out.println("1. Petrol");
			System.out.println("2. Diesel");
			int t=Integer.parseInt(br.readLine());
			String fuel="";
			if(t==1) {
				fuel="Petrol";
			}
			else if(t==2)
			{
				fuel="Diesel";
			}
			else
			{
				fuel="";
			}
			System.out.println("Fuel Capacity:");
			int cap=Integer.parseInt(br.readLine());
			System.out.println("CC:");
			int cc=Integer.parseInt(br.readLine());
			System.out.println("KickStart available[Yes/No]");
	         String im=br.readLine();
	         boolean b=true;
	        if(im.equalsIgnoreCase("Yes")) {
	        	b=true;
	        }
	        else
	        {
	        	b=false;
	        }
	      TwoWheeler tw=new TwoWheeler(make,fuel,num,cap,cc,b);
	       tw.displaymake();
	      tw.displayBasicInfo();
	      
	      tw.displayDetailInfo();
		}
		else if(no==2)
		{
			System.out.println("Vehicle Make: ");
			String make1=br.readLine();
			System.out.println("Vehicle Number: ");
			String num1=br.readLine();
			System.out.println("Fuel Type: ");
			System.out.println("1. Petrol");
			System.out.println("2. Diesel");
			int t1=Integer.parseInt(br.readLine());
			String fuel1="";
			if(t1==1) {
				fuel1="Petrol";
			}
			else if(t1==2)
			{
				fuel1="Diesel";
			}
			else
			{
				fuel1="";
			}
			System.out.println("Fuel Capacity:");
			int cap1=Integer.parseInt(br.readLine());
			System.out.println("CC:");
			int cc1=Integer.parseInt(br.readLine());
			System.out.println("Audio System: ");
	         String as=br.readLine();
	         System.out.println("no of doors");
	         int door=Integer.parseInt(br.readLine());
	         
	         FourWheeler f=new FourWheeler(make1,num1,fuel1,cap1,cc1,as,door);
	         f.displaymake();
		      f.displayBasicInfo();
		      
		      f.displayDetailInfo();
		}
		else
		{
			System.out.println("Invalid Input");
		}
		
	}

}
