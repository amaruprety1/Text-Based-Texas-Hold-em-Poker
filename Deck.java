import java.util.*;
/*Amar, Derek, Sameer, Nathan
 * Texas Poker
 * Semester Project
 */
public class Deck {

	private int [] card;// card array


	private int[] suit;//suit array

	private ArrayList<Card> deck = new ArrayList<Card>();// create a deck array

	public Deck()
	{
		card = new int[] {2,3,4,5,6,7,8,9,10,11,12,13,14};//construct
		suit = new int[] {1,2,3,4};
		for (int i: card)
		{
			for (int j: suit)
			{
				Card oCard = new Card(j,i);
				deck.add(oCard);
			}
		}
		
	}
	
	public void Shuffle()// shuffle the card in the deck
	{
		for (int i = 0; i< 150; i++){
			Random random = new Random();
			Card tempcard = deck.get(random.nextInt(52));
			deck.remove(tempcard);
			deck.add(tempcard);
		}
		
	}
	
	public Card Draw()// draw a card from the deck
	{
		Card tempcard = deck.get(0);
		deck.remove(tempcard);
		return tempcard;
	}
}
