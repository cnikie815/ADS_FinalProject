
public class HalfDeck {
	private DeckOfCards d = new DeckOfCards();
	String player[];
	String comp[];
	public HalfDeck(){
		d.Shuffle();
		for (int i = 0; i < 53; i++){
			player[i] = d.Deal();
			comp[i] = d.Deal();
		}
	}
	public String getPlayerCard(int i){
		return player[i];
	}
	public String getCompCard(int i){
		return comp[i];
	}
	public void shuffleDeck(){
		
	}
}
