package model;

public class Player {

	private String name;
	private String email="NA";
	private int points=0;
	private String wordToSee;
	private boolean isTheFake;
	private boolean canDraw;
	
	private int numOfViews = 0;
	
	public Player(){};
	
	public Player(String name, String email){
		this.name=name;
		if(email.contains("@"))
			this.email=email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public String getWordToSee() {
		return wordToSee;
	}
	public void setWordToSee(String wordToSee) {
		this.wordToSee = wordToSee;
	}

	public boolean isCanDraw() {
		return canDraw;
	}

	public void setCanDraw(boolean canDraw) {
		this.canDraw = canDraw;
	}

	public boolean isTheFake() {
		return isTheFake;
	}

	public void setTheFake(boolean isTheFake) {
		this.isTheFake = isTheFake;
	}

	public int getNumOfViews() {
		return numOfViews;
	}

	public void setNumOfViews(int numOfViews) {
		this.numOfViews = numOfViews;
	}


	
}
