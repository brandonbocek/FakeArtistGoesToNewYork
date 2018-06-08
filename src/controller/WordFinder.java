package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import model.Game;

public class WordFinder {
	
	private Game game;
	private String filename = "/Users/brandonbocek/Documents/workspace/FakeArtist/src/x.txt";
	private PlayersGetWord pgw;
	
	public WordFinder(Game game){
		this.game=game;
	}
	
	public int setWordToGame(){
		
		int numOfLines = getNumberOfLines();
		game.setWordToDraw(getWord(numOfLines));
		pgw = new PlayersGetWord(game);
		return game.getRoundNumber();
		
	}
	
	private String getWord(int size){
		try
		  {
		    BufferedReader reader = new BufferedReader(new FileReader(filename));
		    String line, word="NA";
		    int i=0, randomNum = 1 + (int)(Math.random() * size); 
		    while ((line = reader.readLine()) != null){
		    	i++;
		    	if(randomNum==i){
		    		word = line;
		    	}
		    }
		    reader.close();
		    return word;
		  }
		  catch (Exception e)
		  {
		    System.err.format("Exception occurred trying to read '%s'.", filename);
		    e.printStackTrace();
		    return "NA";
		  }
		
	}
	
	private int getNumberOfLines(){
		  
		  try
		  {
		    BufferedReader reader = new BufferedReader(new FileReader(filename));
		    String line;
		    int i=0;
		    while ((line = reader.readLine()) != null){
		    
		    	i++;
		    }
		    reader.close();
		    return i;
		  }
		  catch (Exception e)
		  {
		    System.err.format("Exception occurred trying to read '%s'.", filename);
		    e.printStackTrace();
		    return 0;
		  }
		}

}

