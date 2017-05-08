import java.util.*;
public class Card
{
    public static void main (String[] args) {
        PlayingCard c1 = new PlayingCard(14, 3);
        for (int i = 0; i < 21; i++) {
            c1.genRand();
            System.out.println(c1);
        }
    }
}