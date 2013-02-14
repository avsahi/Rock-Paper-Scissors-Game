/**
 * This class takes a player that should have a name, a score, and a choice (rock, paper, or scissors). 
 * A player should be able to take in a new choice, give its choice to the system, increase its score, give its score to the system.
 * @author Avdeep Sahi
 *
 */
public class RPSPlayer {
	private String name;
	private int score;
	private String choice;
	
	/** 
	 * This constructor takes in a string name and assigns it to player 1.
	 * @param name
	 */
	public RPSPlayer(String name) {
		this.name = name;
	}
	/** 
	 * This method is used to set the score for the players in the game.
	 * @param score
	 */
	
	public void setScore(int score) {
		this.score = score;
	}
	/**
	 * This method is used to set the players' choices.
	 * @param choice
	 */
	
	public void setChoice(String choice) {
		this.choice = choice;
	}
	/** 
	 * This method, when called, returns the player's current score.
	 * @return
	 */
	
	public int getPlayerScore() {
		return score;
	}
	
	/**
	 * This method, when called, returns the player's name.
	 * @return
	 */
	
	public String getPlayerName() {
		return name;
	}
	
	/** 
	 * This method, when called, returns the player's choice, either rock, paper, or scissors.
	 * @return
	 */
	
	public String getPlayerChoice() {
		return choice;
	}

}
