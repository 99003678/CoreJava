
public class ODIMatch extends Match
{
	 
	   public int calculateBalls(int C_over)
	   {
		   int RemainingBalls;
		   RemainingBalls=(50-C_over)*6;
		   return RemainingBalls;
	   }
	   public float calculateRunRate(int currentScore, int targetScore)
	   {
		   int remainingScore=targetScore-currentScore;
		   float runrate=(remainingScore/(calculateBalls()))/6;
		   return runrate;
		   
	   }
	   public void display(int currentScore, int targetScore,int overs)
	   {
		   
		   System.out.println("Need "+ (targetScore-currentScore) +"runs in " +((50-overs)*6) +" balls");
		   System.out.println("Required Runrate: " +((targetScore-currentScore)/(50-overs)));
	   }
	@Override
	public float calculateRunRate() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int calculateBalls() {
		// TODO Auto-generated method stub
		return 0;
	}
}
	


