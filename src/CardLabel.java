import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 * Label that displays a card 
 *
 */
public class CardLabel extends JLabel{
	private static final long serialVersionUID = 8723625656455376178L;
	private CardName card;
	public CardLabel(CardName c) {
		super(new ImageIcon(ImageGrab.getCardGraphic(c)));
		card=c;
	}
	/**
	 * CardLabel's "card" is the back of a card
	 */
	public CardLabel() {
		super(new ImageIcon(ImageGrab.getCardBack()));
	}
	public CardName getCardName() {
		return card;
	}
	public void setCardName(CardName c) {
		card=c;
		super.setIcon(new ImageIcon(ImageGrab.getCardGraphic(c)));
	}
	public void setCardToBack() {
		card=null;
		super.setIcon(new ImageIcon(ImageGrab.getCardBack()));
	}
}