import java.util.*;
public class Arith {
	public static int Arithmetic()
	{
		int a,b,c,ans;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the inputs");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
	
		if(c==1 && a>0 && a<32767 && b>0 && b<32767)
		{
			ans=a+b;
		}
		else if(c==2 && a>0 && a<32767 && b>0 && b<32767)
		{
			ans=a-b;
		}
		else if(c==3 && a>0 && a<32767 && b>0 && b<32767)
		{
			ans=a*b;
		}
		else if(c==4 && a>0 && a<32767 && b>0 && b<32767)
		{
			ans=a/b;
		}
		else
		{
			ans=-1;
		}
		
		return ans;
	}
	public static void main(String[] args) {
		
		int ak=Arithmetic();
		
		if(ak==-1)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			System.out.println(ak);
		}
		
	}

}
