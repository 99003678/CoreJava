package activity9;
import java.util.*;
public class RankingMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Ranking> al=new ArrayList<Ranking>();
	System.out.println("Enter the no of players");
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter the name of the player "+(i+1));
		String str=sc.next();
		
		System.out.println("Enter the score of the player "+(i+1));
		int a=sc.nextInt();
		al.add(new Ranking (str,a,i+1));
		
	}
	
	Collections.sort(al);  
	System.out.println("Player Details by Score(High to Low)");
	for(Ranking r:al)
	{  
		System.out.println(r);  
	 } 
	}
}
