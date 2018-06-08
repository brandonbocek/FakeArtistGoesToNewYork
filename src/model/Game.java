package model;

import java.util.ArrayList;

public class Game {
	
	private int numOfPlayers;
	private String category;
	private String wordToDraw;
	private int roundNumber=0;
	
	public ArrayList<Player> players;

	public int getNumOfPlayers() {
		return numOfPlayers;
	}

	public void setNumOfPlayers(int numOfPlayers) {
		this.numOfPlayers = numOfPlayers;
	}
	
	public Game(int numOfPlayers){
		this.numOfPlayers = numOfPlayers;
		players = new ArrayList<Player>();
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getWordToDraw() {
		return wordToDraw;
	}

	public void setWordToDraw(String wordToDraw) {
		this.wordToDraw = wordToDraw;
	}
	public Player getPlayer(int num){
		return players.get(num);
	}
	public void addPlayer(String name, String email){
		players.add(new Player(name, email));
	}
	public ArrayList<Player> getAllPlayers(){
		return players;
	}

	public int getRoundNumber() {
		return roundNumber;
	}

	public void setRoundNumber(int roundNumber) {
		this.roundNumber = roundNumber;
	}
	
}
