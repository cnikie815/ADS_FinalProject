
public class Card implements Comparable{
	private Suit s;
	private boolean up;
	private int n;
	public Card (Suit suit, int num){
		s = suit;
		num = num;
		up = false;
	}
	public boolean equals(Object c){
		if(this==c){
			return true;
		} else if(! (c instanceof Card)){
			return false;
		} else {
			Card c2 = (Card)c;
			return n == c2.n;
		}
	}
	public int compare(Object c){
		if (!(c instanceof Card)){
			throw new IllegalArgumentException("not a card");
		}
		Card c2 = (Card)c;
		return n - c2.n;
	}
	public int getSuit(){
		return s;
	}
	public int getN(){
		return n;
	}
	public boolean isHeartOrDiamond(){
		return s == Suit.diamond || Suit.heart;
	}
	public boolean isUp(){
		return up;
	}
	public void turn(){
		up = !up;
	}
	public String toString(){
		return numToString() + " of " + s;
	}
	private String numToString(){
		if(n == 11){
			return "Jack";
		} else if( n == 12){
			return "Queen";
		} else if(n == 13){
			return "King";
		} else if (n == 1){
			return "Ace";
		} else {
			return "" + n;
		}
		
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
