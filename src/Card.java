import java.io.Serializable;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Card implements Serializable{
	private Suit s;
	private boolean up;
	private int n;
	private JLabel c;
	private static final long serialVersionUID = -3158433674904661857L;
	protected CardName name;
	public Card(CardName name) {
		this.name = name;
	}
	public CardName getName() {
		return name;
	}
	public boolean equals(Card c) {
		return c.name==name;
	}
	public String toString() {
		return name.toString();
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
	public int getN(){
		return n;
	}
	public boolean isUp(){
		return up;
	}
	public void turn(){
		up = !up;
	}
	public CardName getCardName(){
		return name;
	}
}
