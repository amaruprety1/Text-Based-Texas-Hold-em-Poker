/*Amar, Derek, Sameer, Nathan
 * Texas Poker
 * Semester Project
 */
import java.util.*;

// player class where it keeps track of players hand and money
public class Player {
	Scanner scan = new Scanner(System.in);
	private double dMoney;// money for each player
	private ArrayList<Card> hand = new ArrayList<Card>();
	Table table;
	private int iHighCard, iScore;
	private boolean hasFolded;
	
	
	public Player()
	{
		setMoney(50);
		hasFolded = false;
		
		
	
	}

	public ArrayList<Card> getHand() {// hand array or cards in hand
		return hand;
	}
	
	public void Addcard(Card ocard)//add card to the hand
	{
		hand.add(ocard);
	}
	
	public void Drophand()// clear hand
	{
		hand.clear();
	}
	
	public double getMoney() {// get money and set money value
		return dMoney;
	}

	public void setMoney(double dMoney) {
		this.dMoney = dMoney;
	}

	public double Bet()// in case the player bets
	{
			System.out.print("Please enter the amount you want to bet:> ");
			Double dBet = scan.nextDouble();
			Double tempbet = this.dMoney- dBet;
			while (tempbet<0)
			{
				System.out.println("You can't bet that. You don't have that much money.");
				System.out.print("Please enter the amount you want to bet:> ");
				 dBet = scan.nextDouble();
				 tempbet = this.dMoney- dBet;
			}
			setMoney(this.dMoney- dBet);
			System.out.println("Your balance: "+this.dMoney);
			return dBet;
		
		
	}
	
	public void print()// print the card in the hand
	{
		for (Card odcard: hand)
		{
			System.out.println(odcard.toString());
		}
	}

	public int getiHighCard() {// get high card from hand
		return iHighCard;
	}

	public void setiHighCard(int iHighCard) {
		this.iHighCard = iHighCard;
	}

	public int getiScore() {// for winner checker so that we have a numeric value for each combinations
		return iScore;
	}

	public void setiScore(int iScore) {
		this.iScore = iScore;
	}
	
	public ArrayList<Card> getCards(){
		return hand;
	}

	public boolean isHasFolded() {
		return hasFolded;
	}

	public void setHasFolded(boolean hasFolded) {
		this.hasFolded = hasFolded;
	}

	
}
