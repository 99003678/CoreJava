package workspace;
public class Innings {
	
	private String teamname;
	private String inningsname;
	private int runs;
	
	public String getTeamname() {
		return teamname;
	}
	
	public void setTeamame(String tn)
	{
		teamname=tn;
	}
	public String getInningsname() {
		return inningsname;
	}
	public void setInningsname(String in)
	{
		inningsname=in;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int r)
	{
		runs=r;
	}
	
	public void displayInningsDetails() 
	{
		System.out.println("Team Name: "+teamname);
		System.out.println("Innings Name: "+inningsname);
		if(inningsname.equals("second"))
		{
			System.out.println(teamname +" Needs " + (runs+1) +" runs to win");
		}
		else {
		System.out.println("Runs: "+runs);
		System.out.println("Match Ended");
		}
}
}
