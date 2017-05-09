import java.util.Scanner;

public class WarGame {
	public static void main(String args[]){
		int half;
		Deck d = new Deck();
		Deck d1 = new Deck();
		Deck d2 = new Deck();
		for (int a = 2; a < 15; a++){
			if (i == 11){
				d.add(new Card("Jack of Spades"));
				d.add(new Card("Jack of Diamonds"));
				d.add(new Card("Jack of Clubs"));
				d.add(new Card("Jack of Hearts"));
			} else if (i == 12){
				d.add(new Card("Queen of Spades"));
				d.add(new Card("Queen of Diamonds"));
				d.add(new Card("Queen of Clubs"));
				d.add(new Card("Queen of Hearts"));
			} else if (i == 12){
				d.add(new Card("King of Spades"));
				d.add(new Card("King of Diamonds"));
				d.add(new Card("King of Clubs"));
				d.add(new Card("King of Hearts"));
			} else if (i == 12){
				d.add(new Card("Ace of Spades"));
				d.add(new Card("Ace of Diamonds"));
				d.add(new Card("Ace of Clubs"));
				d.add(new Card("Ace of Hearts"));
			} else {
				d.add(new Card(a + " of Spades"));
				d.add(new Card(a + " of Diamonds"));
				d.add(new Card(a + " of Clubs"));
				d.add(new Card(a + "of Hearts"));
			}
		d.shuffle();
		half = d.size()/2;
	}
}
