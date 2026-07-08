//imports yay
import java.util.*;

public class Hand {

    ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<Card>();
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
}
