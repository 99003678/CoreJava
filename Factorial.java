package workspace;

import java.util.Scanner;
public class Factorial
{
    public static void fact(int m)
    {
        int a, i,b=0;;
 
       
        int length1 = String.valueOf(m).length();//
		int[] max=new int[length1];
        while(m > 0)
        {
            a = m % 10;
			int fac=1;
			
            for(i=1;i<=a;i++)
			{
				fac=fac*i;
				
			}
            max[b]=fac;
            m = m / 10;
			b++;
        }
        for(int k=max.length-1;k>=0;k--)
        {
        	System.out.println(max[k]);
        }
		
    }
    public static void main(String args[])
    {      
    	Scanner sc=new Scanner(System.in);
    	
    	 System.out.print("Enter any number:");
         int n= sc.nextInt();
         if(n>32967)
         {
        	 System.out.println("Number too large");
         }
         else if(n<0)
         {
        	 System.out.println("Number too small");
         }
         else
         {
         fact(n);
         }
    }
}
