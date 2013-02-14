/**
 * This class contains the logic for a single Rock Paper Scissors game.
 *  It will have the two players, a way to set their choices, and a way to determine who won based on those choices. 
 *  When it determines who won, it increments that player’s score.
 * @author Avdeep Sahi
 *
 */

public class RPSGame {
	
	private RPSPlayer p1;
	private RPSPlayer p2;
	public final String ROCK = "rock";
	public final String PAPER = "paper";
	public final String SCISSORS  = "scissors";
	
	/** 
	 * This constructor takes in 2 parameters which are the player's names and assigns them to th correct variable.
	 * @param p1
	 * @param p2
	 */
	public RPSGame(RPSPlayer p1, RPSPlayer p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	/** 
	 * This method takes in both the player's choices as strings and goes through the logic to assign who the winner is based on
	 * their choices.
	 * @param playerAChoice
	 * @param playerBChoice
	 */
	
	public void keepTrack( String playerAChoice, String playerBChoice) {
		p1.setChoice(playerAChoice);
		p2.setChoice(playerBChoice);
		int playerAScore = p1.getPlayerScore();
		int playerBScore = p2.getPlayerScore();
		
		if (playerAChoice.equalsIgnoreCase(ROCK)) {
			if (playerBChoice.equalsIgnoreCase(PAPER)) {
				playerBScore += 1;
				String outcome = p2.getPlayerName();
				p2.setScore(playerBScore);
				System.out.println(outcome + " won this round!");
			}
			if (playerBChoice.equalsIgnoreCase(SCISSORS)) {
				playerAScore += 1;
				String outcome = p1.getPlayerName();
				p1.setScore(playerAScore);
				System.out.println(outcome + " won this round!");
			}
		}
		
		if (playerAChoice.equalsIgnoreCase(PAPER)) {
			if (playerBChoice.equalsIgnoreCase(ROCK)) {
				playerAScore += 1;
				String outcome = p1.getPlayerName();
				p1.setScore(playerAScore);
				System.out.println(outcome + " won this round!");
			}
			if (playerBChoice.equalsIgnoreCase(SCISSORS)) {
				playerBScore += 1;
				String outcome = p2.getPlayerName();
				p2.setScore(playerBScore);
				System.out.println(outcome + " won this round!");
			}
		}
		
		if (playerAChoice.equalsIgnoreCase(SCISSORS)) {
			if (playerBChoice.equalsIgnoreCase(PAPER)) {
				playerAScore += 1;
				String outcome = p1.getPlayerName();
				p1.setScore(playerAScore);
				System.out.println(outcome + " won this round!");
			}
			if (playerBChoice.equalsIgnoreCase(ROCK)) {
				playerBScore += 1;
				String outcome = p2.getPlayerName();
				p2.setScore(playerBScore);
				System.out.println(outcome + " won this round!");
			}
		}
		
		if (playerAChoice.equalsIgnoreCase(playerBChoice)) { 
			String outcome = "This round is a tie!";
			System.out.println(outcome);
		}

		
	}
	
}
