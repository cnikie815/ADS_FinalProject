import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * Loads the images of cards and the back of the card, then returns the card when requested
 * @author Morgan
 *
 */
public class ImageGrab {
	private static HashMap<CardName, Image> cards = new HashMap<>();
	private static Image cardBack;
	/**
	 * Loads the cards for each CardName into a HashMap for faster processing and less calls to the card files themselves.
	 * <br><b>THIS MUST BE CALLED BEFORE USING OTHER ImageGrab METHODS!!!!! (Preferably at startup)</b><br>
	 * This takes the list of names in the enum CardName and checks for a file with the same name as the cardNames' toString()
	 * method in the directory mbcards/. For example, {@code CardName.MILE_25} returns "25 Miles" in its toString() method, so
	 * ImageGrab searches for mbcards/25 Miles.png
	 */
	public static void loadCards() {
		for (CardName c : CardName.values()){
			cards.put(c, new ImageIcon(ImageGrab.class.getResource("mbcards/"+c.toString()+".png")).getImage());
		}
		cardBack = new ImageIcon(ImageGrab.class.getResource("mbcards/MilleBornesCardBack.png")).getImage();
	}
	/**
	 * Gets the pre-loaded graphic for the card in question.<br>
	 * Pre: ImageGrab.loadCards() has been called to initialize the card-array
	 * @param c The CardName of the graphic
	 * @return the Image corresponding with <b>c</b>. (This still would need to be cast as an Icon to use with JLabel)
	 */
	public static Image getCardGraphic(CardName c) {
		if (cards==null) return null;
		return cards.get(c);
	}
	
	/**
	 * Returns the back of the card.<br>
	 * Pre: ImageGrab.loadCards() has been called to initialize the cardback-image
	 */
	public static Image getCardBack() {
		if (cardBack==null) return null;
		return cardBack;
	}
}