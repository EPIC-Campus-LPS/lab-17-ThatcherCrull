package leaderboard;

public class Score {
	private String name;
	private int score;
	
	public Score(String n, int s) {
		name = n;
		score = s;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setScore(int s) {
		score = s;
	}
	
	@Override
	public String toString() {
		return ("Name: "+name+", Score: "+score);
	}
}
