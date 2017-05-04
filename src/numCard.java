import javax.swing.ImageIcon;

public class numCard {
	private int cardValue;
	private String imageName, face, character;
	private ImageIcon cardImage;
	public numCard(String face, int value){
		this.cardValue = value;
		this.face = face;
		this.imageName = value + face + ".png";
		if(value < 11){
			this.character = "" + value;
		} else if(value == 11){
			this.character = "J";
		} else if(value == 12){
			this.character = "Q";
		} else if(value == 13){
			this.character = "K";
		} else if(value == 14){
			this.character = "A";
		}
		setImage(imageName);
	}
	public int getValue(){
		return cardValue;
	}
	public String getChar(){
		return character;
	}
	public String getFace(){
		return face;
	}
	public ImageIcon getImage(){
		return cardImage;
	}
	public ImageIcon setImage(String imageName){
		cardImage.setImage(new ImageIcon(imageName));
	}
}
