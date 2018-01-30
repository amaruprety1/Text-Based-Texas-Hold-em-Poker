/*Amar, Derek, Sameer, Nathan
 * Texas Poker
 * Semester Project
 */
public class Card {
	private int iSuit, iNumber;// instantiate it

	public Card()// constructor
	{
		iSuit = 0;
		iNumber = 0;
	}
	public Card(int itempsuit, int itempnumber)
	{
		setSuit(itempsuit);
		setNumber(itempnumber);
	}
	//accessor and mutators
	public int getSuit() {
		return iSuit;
	}

	public void setSuit(int iSuit) {
		this.iSuit = iSuit;
	}

	public int getNumber() {
		return iNumber;
	}

	public void setNumber(int iNumber) {
		this.iNumber = iNumber;
	}
	//tostring to print
	public String toString()
	{
		String sNumber = "";
		if (iNumber == 2)
			sNumber = "2";
		if (iNumber == 3)
			sNumber = "3";
		if (iNumber == 4)
			sNumber = "4";
		if (iNumber == 5)
			sNumber = "5";
		if (iNumber == 6)
			sNumber = "6";
		if (iNumber == 7)
			sNumber = "7";
		if (iNumber == 8)
			sNumber = "8";
		if (iNumber == 9)
			sNumber = "9";
		if (iNumber == 10)
			sNumber = "10";
		
		if (iNumber == 11)
			sNumber = "Jack";
		if (iNumber == 12)
			sNumber = "Queen";
		if (iNumber == 13)
			sNumber = "King";
		if (iNumber == 14)
			sNumber = "Ace";
		
		String sSuit = "";
		if (iSuit == 1)
			sSuit = "Spades";
		if (iSuit == 2)
			sSuit = "Clubs";
		if (iSuit == 3)
			sSuit = "Hearts";
		if (iSuit == 4)
			sSuit = "Diamonds";
		
		return "Suit: " +  sSuit + " card value: " + sNumber;
	}
	
	
}
