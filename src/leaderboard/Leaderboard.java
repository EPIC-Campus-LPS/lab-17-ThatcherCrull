package leaderboard;

import java.util.ArrayList;

public class Leaderboard {
	private int capacity;
	private ArrayList<Score> scoreboard;
	
	public Leaderboard(int c) {
		capacity = c;
		scoreboard = new ArrayList<>(capacity);
	}
	
	public void addScore(String name, int score) {
		Score player = new Score(name, score);
		for (int i = 0; i < scoreboard.size(); i++) {
			if (player.getScore() > ((scoreboard.get(i)).getScore())) {
				scoreboard.add(i, player);
			}
		}
		while (scoreboard.size() > capacity) {
			scoreboard.remove(scoreboard.size() - 1);
		}
	}
	
	public int getHighScore() {
		return (scoreboard.get(0).getScore());
	}
	
	public int getAverageScore() {
		int avg = 0;
		for (int i = 0; i < scoreboard.size(); i++) {
			avg += scoreboard.get(i).getScore();
		}
		avg = avg / capacity;
		return avg;
	}
	
	public boolean break1000() {
		boolean high_score = false;
		for (int i = 0; i < scoreboard.size(); i++) {
			if (((scoreboard.get(i)).getScore()) > 1000) {
				high_score = true;
			}
		}
		return high_score;
	}
	
	public void printLeaderboard() {
		for (int i = 0; i < scoreboard.size(); i++) {
			System.out.println(scoreboard.get(i).toString());
		}
	}
}
