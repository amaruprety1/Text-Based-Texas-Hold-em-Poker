/*Amar, Derek, Sameer, Nathan
 * Texas Poker
 * Semester Project
 */
import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("How many players are supposed to play this game:> ");
		int iPlayers = scan.nextInt();// numbe rof players input
		Table otable = new Table(iPlayers);// create table object
		otable.Deal();// deal the cards
		int counter = 0;

		while (otable.Playersize()>1 && counter < 3)
		{
			for (int i = 1; i<=otable.Playersize(); i++){
				if (otable.folded()==false){
					System.out.println("Player " + i+  " has following cards in his/her hand.");
					otable.Fold();// check to bet or fold
					if (otable.Playersize()==1)// if there is only 1 player left
					{
						System.out.println("Game Over, Last player left wins");
						System.out.println("Last Player won "+ otable.getPot());
						System.out.println("Thanks for playing!!!!");
						System.exit(0);
					}

					otable.Nextplayer();//go to nextplayer
					System.out.println("Total Pot: " + otable.getPot());// total pot value
					System.out.println();//spacing
				}
			}
			otable.Drawcard();// drawcard in table
			counter +=1;
		}

		otable.Score();// check the score to who won the game
		System.out.println(otable.winnerchecker() + " wins " + otable.getPot());// print the winner.
		








	}
}