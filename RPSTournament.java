import java.util.*;

/**
 * This class is responsible for doing all of the user facing work. 
 * It consists of the main method, and a helper method for generating the computerÕs choices. 
 * @author Avdeep Sahi
 *
 */

public class RPSTournament {
	private static String playerBChoice;
	
	/**
	 * This is a static method that uses the random function to generate user choices. 
	 * This method is static so that it can be referenced from the main method below.
	 * @return
	 */
	
	public static String generateRandom() {
		Random rand = new Random();
		int value = rand.nextInt(3);
		if (value == 0) {
			String playerBChoice = "rock";
			return playerBChoice;
		}
		else if(value == 1) {
			String playerBChoice = "paper";
			return playerBChoice;
		}
		else if (value == 2) {
			String playerBChoice = "scissors";
			return playerBChoice;
		}
		return playerBChoice;
	}
	
	/**
	 * This is the main method that gets the playerÕs name, and then create an RPSPlayer object for the user and one for the computer. 
	 * It then prompts the user for the number of games they would like to play. 
	 * The program then allows the user to play as many or as few games as they would like; for every game, 
	 * the method below creates a new RPSGame object, prompts the user for their choice, generates a computer choice, 
	 * and uses the RPSGame object to determine who won. 
	 * After every game, the current score is printed to the user.
	 * @param args
	 */
	
	public static void main (String[] args) {
		System.out.println("Enter your name here:");
		Scanner key = new Scanner(System.in);
		String playerAName = key.nextLine();
		RPSPlayer playerA = new RPSPlayer(playerAName);
		RPSPlayer playerB = new RPSPlayer("Computer");
		System.out.println("How many games do you want to challange the Computer to?");
		int gamesToPlay = key.nextInt();
		int totalGames = gamesToPlay;
		while (gamesToPlay > 0) {
			gamesToPlay -= 1;
			System.out.println(playerAName + " enter your choice.");
			String playerAChoice = key.next();
			String playerBChoice = generateRandom();
			System.out.println("Computer chose " + playerBChoice);
			RPSGame play = new RPSGame(playerA, playerB);
			play.keepTrack(playerAChoice, playerBChoice);
			int scoreA = playerA.getPlayerScore();
			int scoreB = playerB.getPlayerScore();
			System.out.println("Score: " + playerAName + " --- " + scoreA + "\t" + "Computer" + " --- " + scoreB);
			
		}
		int finalScoreA = playerA.getPlayerScore();
		int finalScoreB = playerB.getPlayerScore();
		
		if (finalScoreA > finalScoreB) {
			System.out.println(playerAName + " is the winner " + finalScoreA + "/" + totalGames + " total games!");
		}
		else if (finalScoreB > finalScoreA) {
			System.out.println("Computer won with " + finalScoreB + "/" + totalGames + " total games!");
		}
		else {
			System.out.println("You guys tied!");
		}
		
	}
}
