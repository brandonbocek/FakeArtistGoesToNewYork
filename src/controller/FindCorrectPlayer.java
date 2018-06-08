package controller;

import model.Game;
import model.Player;

public class FindCorrectPlayer {

	Game game;
	String nameToFind;
	
	public FindCorrectPlayer(Game game, String nameToFind){
		this.game=game;
		this.nameToFind=nameToFind;
	}
	
	//the player you clicked on needs the right player's info to display
	public Player getPlayerHint(){
		for(Player player : game.getAllPlayers()){
			
			if(player.getName().equals(nameToFind)){
				//this is to assure the same player isn't clicked twice in a round
				player.setNumOfViews(player.getNumOfViews()+1);
				return player;
			}
		}
		return null;
	}
	
}
