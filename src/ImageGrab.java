import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ImageGrab {
	private static HashMap<CardName, Image> cards = new HashMap<>();
	private static Image cardBack;
	public static void loadCards() {
		for (CardName c : CardName.values()){
			cards.put(
						c,
						new ImageIcon(
								ImageGrab.class.getResource(
										"DeckCards/"+c.toString()+".png")
								).getImage());
		}
		cardBack = new ImageIcon(ImageGrab.class.getResource("DeckCards/CardBack.png")).getImage();
	}
	public static Image getCardGraphic(CardName c) {
		if (cards==null) return null;
		return cards.get(c);
	}
	public static Image getCardBack() {
		if (cardBack==null) return null;
		return cardBack;
	}
}