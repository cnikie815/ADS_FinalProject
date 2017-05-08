import java.util.*;
public class DeckOfCards
{
    ArrayList<PlayingCard> Deck = new ArrayList<PlayingCard>();
    private Random r = new Random();
    private PlayingCard Temp;
    private String list;
    private int index;
    private String cardData;
    public DeckOfCards() {
        for (int i = 1; i < 5; i++) {
            for (int k = 2; k < 15; k++) {
                Deck.add(new PlayingCard(k, i));
            }
        }
    }

    public void Shuffle() {
        for (int i = 0; i < 104; i++){
            int c1 = r.nextInt(Deck.size());
            int c2 = r.nextInt(Deck.size());
            while (c1 == c2) {
                c2 = r.nextInt(Deck.size());
            }
            Temp = Deck.get(c1);
            Deck.set(c1, Deck.get(c2));
            Deck.set(c2, Temp);
        }
    }
    
    public String Deal() {
        index = Deck.size() - 1;
        cardData = Deck.get(index).getData();
        Deck.remove(index);
        return cardData;
    }
    
    public int CardsLeft() {
        return Deck.size();
    }
    
    public String Cards() {
        list = "";
        for (PlayingCard i : Deck) {
            list = list + "(" + i.getData() + ")";
        }
        return list;
    }
}
