import java.util.ArrayList;
import java.util.Random;

public class Deck {
	public static final int totalSize =52;
	private ArrayList<Card> cards;
	Card n;
	public Deck(){
		reset();
	}
	private void reset(){
		cards = new ArrayList<Card>();
	}
	public boolean empty(){
		return cards.isEmpty();
	}
	public void clear(){
		cards.clear();
	}
	public void add(Card c){
		cards.add(c);
	}
	public Card deal(){
		if (empty()){
			return null;
		} else {
			return cards.remove(cards.size() -1);
		}
	}
	public Card[] deal(int n){
		if (n > cards.size()){
			return null;
		} else {
			Card[] player = new Card[n];
			for (int a = 0; a < player.length; a++){
				player[a] = deal();
				return player;
		}
		}
		return null;
	}
	public Card getTop(){
		return cards.remove(0);
	}
	public int size(){
		return cards.size();
	}
	public void shuffle(){
		if(cards.size() < totalSize){
			return;
		}
		Random x = new Random();
		Card[] array = new Card[totalSize];
		while (cards.size() > 0){
			Card c = cards.remove(cards.size() - 1);
			int a = x.nextInt(totalSize);
			while ( array[a] != null){
				a = x.nextInt(totalSize);
				array[a] = c;
			}
		}
		for (Card c : array){
			cards.add(c);
		}
	}
	public String toString(){
		String z = "";
		for (Card c: cards){
			z+= c + "\n";
		}
		return z;
	}
}
