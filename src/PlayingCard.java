import java.util.*;
public class PlayingCard {
    private int suit; //1=S, 2=C, 3=H, 4=D
    private int face; //10=T, 11=J, 12=Q, 13=K, 14=A, otherwise=numeric value
    
    public PlayingCard(int f, int s) {
        face = f;
        suit = s;
    }
    
    public PlayingCard() {
        genRand();
    }
    
    //Pre: f >= 2 and  mf <=14
    public void setFace(int f) {
        face = f;
    }
    //Post: face is assigned f
    
    //Pre: s >= 1 s <= 4
    public void setSuit(int s) {
        suit = s;
    }
    //Post: suit is assigned to s
    
    
    //Pre: none
    public void genRand() {
        Random r = new Random();
        suit = r.nextInt(4) + 1;
        face = r.nextInt(13) + 2;
    }
    //Post: a random face and suit have been genereated and assigned
    
    //Pre: f >= 2 and  mf <=14
    public int getFace() {
        return face;
    }
    //Post: return value of face
    
    //Pre: s >= 1 s <= 4
    public int getSuit() {
        return suit;
    }
    //Post: return value of suit
    
    //Pre: none
    public String getStringSuit() {
        if (suit == 1) {
            return "S";
        } else if (suit == 2) {
            return "C";
        } else if (suit == 3) {
            return "H";
        } else {
            return "D";
        }
    }
    //Post: String will be returned as string equilvelent, 1=S, 2=C, 3=H, 4=D
    
    //Pre: none
    public String getStringFace() {
        if (face == 14) {
            return "A";
        } else if (face == 13) {
            return "K";
        } else if (face == 12) {
            return "Q";
        } else if (face == 11) {
            return "J";
        } else if (face == 10) {
            return "T";
        } else {
            return face + "";
        }
    }
    //Post: fcae will be returned as string equilvelent, 14=A, 13=K, 12=Q, 11=J, 10=T
    
    public String toString() {
        return getStringFace() + getStringSuit();
    }
    public String getData() {
        return getStringFace() + getStringSuit();
    }
}