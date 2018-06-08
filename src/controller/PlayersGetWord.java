package controller;

import model.Game;
import model.Player;


public class PlayersGetWord {
	
	
	private Game game;
//	private SendEmail se;
	private String wordToGive;
	private int numOfPlayers;
	
	//the random player will not get the word to draw
	private int randomPlayer;
	
	//everything gets done in the constructor
	public PlayersGetWord(Game game){
		this.game=game;
		this.wordToGive=game.getWordToDraw();
		numOfPlayers = game.getNumOfPlayers();
		setRandomNumber();
		iterateRoundNumber();
		assignWordToPlayers();
//		emailThePlayers();
	}
	
	private void iterateRoundNumber(){
		// the round number increases by 1
		int newNum = game.getRoundNumber();
		newNum++;
		game.setRoundNumber(newNum);
	}
	
	//it always chooses 1 if I don't do this extra stuff
	private void setRandomNumber(){
		for(int j=0;j<70;j++){
			randomPlayer = 1 + (int)(Math.random() * numOfPlayers);
		}
	}
	
	private void assignWordToPlayers(){
		int i=1;
		
		for(Player player : game.getAllPlayers()){
			
			//resets the player's view status to prevent cheating
			player.setNumOfViews(0);
			
			if(randomPlayer==i){
				player.setWordToSee("You're the fake artist");
				player.setTheFake(true);
			
			}else{
				player.setWordToSee(wordToGive);
				player.setTheFake(false);
			}
			i++;
		}
		
		
	}
	
	//optional to allow players to see their word on their own cpu
//	private void emailThePlayers(){
//		
//		se = new SendEmail();
//		String email;
//		
//		for(Player player : game.getAllPlayers()){
//			
//			email=player.getEmail();
//			if(email.contains("@")){
//				se.sendEmail(email, "Round "+game.getRoundNumber(), player.getWordToSee());			
//			}
//				
//		}
//		
//	}

}
