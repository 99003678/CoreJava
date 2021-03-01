package activity9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class MatchMain {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Match> al=new ArrayList<Match>();
	System.out.println("Enter the no of matches");
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter match date in (MM-dd-yyyy)");
		String date=sc.next();
		
		System.out.println("Enter Team 1 ");
		String str1=sc.next();
		System.out.println("Enter Team 2 ");
		String str2=sc.next();
		
		al.add(new Match (date,str1,str2));
		
	}
	
	Collections.sort(al);  
	for(Match m:al)
	{  
		System.out.println(m);  
	 } 
	
}
	
}