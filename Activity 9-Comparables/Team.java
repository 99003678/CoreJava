package activity9;

import java.util.ArrayList;
import java.util.Collections;

public class Team implements Comparable<Team>{
	private String name;
	ArrayList<String> al=new ArrayList<String>();
	
	
	
	public Team(String name, ArrayList<String> al) {
		super();
		this.name = name;
		this.al = al;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getAl() {
		return al;
	}
	public void setAl(ArrayList<String> al) {
		this.al = al;
	}
	
	public void addPlayer(String playername)
	{
		al.add(playername);
	}
	
	public ArrayList<String> getPlayerList(ArrayList<String> al)
	{
		Collections.sort(al);
		
		return al;
	}
	@Override
	public int compareTo(Team o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
