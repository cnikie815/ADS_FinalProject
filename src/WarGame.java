import java.util.Scanner;

public class WarGame {
	public static void main(String args[]){
		int half;
		Deck d = new Deck();
		Deck d1 = new Deck();
		Deck d2 = new Deck();
		for (int a = 2; a < 15; a++){
			d.add(new Card('H', a));
			d.add(new Card('D', a));
			d.add(new Card('S', a));
			d.add(new Card('C', a));
		}
		d.shuffle();
		half = d.size()/2;
	}
}
