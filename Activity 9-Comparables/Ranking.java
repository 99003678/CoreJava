package activity9;
import java.util.*;

public class Ranking implements Comparable<Ranking>{

	private String name;
	private int score;
	private int i;
	

	
	
	public Ranking(String name, int score, int i) {
		super();
		this.name = name;
		this.score = score;
		this.i = i;
	}


	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int compareTo(Ranking r){  
		
		if(score==r.score)  
		return 0;  
		
		else if(score>r.score)  
		return 1;  
		
		else  
		return -1; 
}


	@Override
	public String toString() {
		return i+" " + name + " " + score ;
	}
}

