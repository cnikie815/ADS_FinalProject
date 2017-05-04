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
		JFrame f = new JFrame();
		JPanel p = new JPanel(new GridLayout(5, 5));
		JLabel playerDiscard = new JLabel();
		playerDiscard.setBackground(Color.blue);
		JLabel playerDeck = new JLabel();
		playerDeck.setBackground(Color.black);
		JLabel compDiscard = new JLabel();
		compDiscard.setBackground(Color.red);
		JLabel compDeck = new JLabel();
		compDiscard.setBackground(Color.green);
		JPanel playerRun = new JPanel(new GridLayout(1, 5));
		playerRun.setBackground(Color.yellow);
		JPanel compRun = new JPanel(new GridLayout(1, 5));
		compRun.setBackground(Color.gray);
		JButton playCard = new JButton("Play Card");
		f.setSize(800, 800);
		p.setVisible(true);
		f.setVisible(true);
		p.add(playCard);
		p.add(playerDiscard, 1,1);
		p.add(playerDeck, 1, 3);
		p.add(playerRun);
		p.add(compRun);
		p.add(compDeck, 4, 1);
		p.add(compDiscard, 4, 3);
		f.add(p);
	}
}
