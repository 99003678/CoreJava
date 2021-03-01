package activity9;
import java.util.*;

public class Match implements Comparable<Match>{

	private String date;
	private String team1;
	private String team2;
	
	
	
	
	public Match(String date, String team1, String team2) {
		super();
		this.date = date;
		this.team1 = team1;
		this.team2 = team2;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	@Override
	public int compareTo(Match m) {
		if(date.compareTo(m.date) == 0)  
			return 0;  
			
			else if(date.compareTo(m.date) < 0)  
			return 1;  
			
			else  
			return -1; 
	
	}
	@Override
	public String toString() {
		return "Team 1 "+team1 + "\n"+ "Team 2 "+team2+ "\n" + "Match held on "+ date;
	
	}
	
}
	