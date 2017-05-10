import java.awt.Component;
import java.awt.Container;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WarGame {
	public static void main(String args[]){
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
		JPanel p = new JPanel();
		BoxLayout b = new BoxLayout(p, BoxLayout.PAGE_AXIS);
		JButton go = new JButton("press");
		go.setAlignmentX(p.CENTER_ALIGNMENT);
		JLabel playerDiscard = new JLabel("playerDiscard");
		playerDiscard.setAlignmentX(p.CENTER_ALIGNMENT);
		JLabel playerDeck = new JLabel("playerDeck");
		playerDeck.setAlignmentX(p.CENTER_ALIGNMENT);
		JLabel playerRun = new JLabel("playerRun");
		playerRun.setAlignmentX(p.CENTER_ALIGNMENT);
		JLabel compRun = new JLabel("compRun");
		compRun.setAlignmentX(p.CENTER_ALIGNMENT);
		JLabel compDiscard = new JLabel("compDiscard");
		compDiscard.setAlignmentX(p.CENTER_ALIGNMENT);
		JLabel compDeck = new JLabel("compDeck");
		compDeck.setAlignmentX(p.CENTER_ALIGNMENT);
		p.setLayout(b);
		p.add(go);
		p.add(playerDiscard);
		p.add(playerDeck);
		p.add(playerRun);
		p.add(compRun);
		p.add(compDiscard);
		p.add(compDeck);
		f.add(p);
		f.pack();
		f.setVisible(true);
		/*
		int half;
		Deck d = new Deck();
		Deck d1 = new Deck();
		Deck d2 = new Deck();
		for (int a = 2; a < 15; a++){
			if (a == 11){
				d.add(new Card("Jack of Spades"));
				d.add(new Card("Jack of Diamonds"));
				d.add(new Card("Jack of Clubs"));
				d.add(new Card("Jack of Hearts"));
			} else if (a == 12){
				d.add(new Card("Queen of Spades"));
				d.add(new Card("Queen of Diamonds"));
				d.add(new Card("Queen of Clubs"));
				d.add(new Card("Queen of Hearts"));
			} else if (a == 12){
				d.add(new Card("King of Spades"));
				d.add(new Card("King of Diamonds"));
				d.add(new Card("King of Clubs"));
				d.add(new Card("King of Hearts"));
			} else if (a == 12){
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
		*/
	}
}
