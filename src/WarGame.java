import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WarGame {
	public static void main(String args[]){
		JFrame f = new JFrame();
		ImageGrab.loadCards();
		f.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
		JPanel p = new JPanel();
		BoxLayout b = new BoxLayout(p, BoxLayout.PAGE_AXIS);
		JButton go = new JButton("press");
		go.setAlignmentX(Component.CENTER_ALIGNMENT);
		CardLabel playerDeck = new CardLabel();
		playerDeck.setBounds(0, 0, 50, 100);
		playerDeck.setAlignmentX(Component.CENTER_ALIGNMENT);
		final CardLabel playerRun = new CardLabel();
		playerRun.setAlignmentX(Component.CENTER_ALIGNMENT);
		final CardLabel compRun = new CardLabel();
		compRun.setAlignmentX(Component.CENTER_ALIGNMENT);
		CardLabel compDeck = new CardLabel();
		compDeck.setAlignmentX(Component.CENTER_ALIGNMENT);
		p.setLayout(b);
		p.add(go);
		p.add(playerDeck);
		p.add(playerRun);
		p.add(compRun);
		p.add(compDeck);
		f.add(p);
		f.pack();
		f.setVisible(true);
		int half;
		Deck d = new Deck();
		final Deck d1 = new Deck();
		final Deck d2 = new Deck();
		for (int a = 2; a < 15; a++){
			if (a == 11){
				d.add(new Card(CardName.JackSpade));
				d.add(new Card(CardName.JackHeart));
				d.add(new Card(CardName.JackClub));
				d.add(new Card(CardName.JackDiamond));
			} else if (a == 12){
				d.add(new Card(CardName.QueenSpade));
				d.add(new Card(CardName.QueenHeart));
				d.add(new Card(CardName.QueenClub));
				d.add(new Card(CardName.QueenDiamond));
			} else if (a == 13){
				d.add(new Card(CardName.KingSpade));
				d.add(new Card(CardName.KingHeart));
				d.add(new Card(CardName.KingClub));
				d.add(new Card(CardName.KingDiamond));
			} else if (a == 14){
				d.add(new Card(CardName.AceSpade));
				d.add(new Card(CardName.AceHeart));
				d.add(new Card(CardName.AceClub));
				d.add(new Card(CardName.AceDiamond));
			} else if (a == 2){
				d.add(new Card(CardName.TwoSpade));
				d.add(new Card(CardName.TwoHeart));
				d.add(new Card(CardName.TwoClub));
				d.add(new Card(CardName.TwoDiamond));
			}else if (a == 3){
				d.add(new Card(CardName.ThreeSpade));
				d.add(new Card(CardName.ThreeHeart));
				d.add(new Card(CardName.ThreeClub));
				d.add(new Card(CardName.ThreeDiamond));
			}else if (a == 4){
				d.add(new Card(CardName.FourSpade));
				d.add(new Card(CardName.FourHeart));
				d.add(new Card(CardName.FourClub));
				d.add(new Card(CardName.FourDiamond));
			}else if (a == 5){
				d.add(new Card(CardName.FiveSpade));
				d.add(new Card(CardName.FiveHeart));
				d.add(new Card(CardName.FiveClub));
				d.add(new Card(CardName.FiveDiamond));
			}else if (a == 6){
				d.add(new Card(CardName.SixSpade));
				d.add(new Card(CardName.SixHeart));
				d.add(new Card(CardName.SixClub));
				d.add(new Card(CardName.SixDiamond));
			}else if (a == 7){
				d.add(new Card(CardName.SevenSpade));
				d.add(new Card(CardName.SevenHeart));
				d.add(new Card(CardName.SevenClub));
				d.add(new Card(CardName.SevenDiamond));
			}else if (a == 8){
				d.add(new Card(CardName.EightSpade));
				d.add(new Card(CardName.EightHeart));
				d.add(new Card(CardName.EightClub));
				d.add(new Card(CardName.EightDiamond));
			}else if (a == 9){
				d.add(new Card(CardName.NineSpade));
				d.add(new Card(CardName.NineHeart));
				d.add(new Card(CardName.NineClub));
				d.add(new Card(CardName.NineDiamond));
			}else if (a == 10){
				d.add(new Card(CardName.TenSpade));
				d.add(new Card(CardName.TenHeart));
				d.add(new Card(CardName.TenClub));
				d.add(new Card(CardName.TenDiamond));
			}
			}
		d.shuffle();
		for(int i = 0; i < 52; i++){
			if (i%2 == 0){
				d1.add(d.getTop());
			} else {
				d2.add(d.getTop());
			}
		}
		go.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				playerRun.setCardName(d1.getTop().getCardName());
				compRun.setCardName(d2.getTop().getCardName());
			}
			
		});
	}
}
