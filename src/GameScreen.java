import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameScreen {
	public static void main(String[] args){
		play("War");
	}
	
	public static void play(String s){
		HalfDeck playerCards = new HalfDeck();
		HalfDeck compCards = new HalfDeck();
		for (int i = 0; i < 27; i++){
			System.out.println(playerCards.getPlayerCard(i));
			System.out.println(playerCards.getCompCard(i));

		}
	}
}
