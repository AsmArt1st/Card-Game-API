//imports yay
import java.util.*;

public class Hand {

    ArrayList<Card> cards;
    String handName;

    public Hand(String handName) {
        cards = new ArrayList<Card>();
        this.handName = handName;
    }

    public void addCards(Card card) {
        cards.add(card);
    }

    public void removeCards(Card card) {
        cards.remove(card);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    //hand string formatting
    @Override
    public String toString(){
        String hand = handName + ":" + "\n";
        for (Card card: cards) {
            hand += card;
            hand += "\n";
        }
        return hand;
    }
}
