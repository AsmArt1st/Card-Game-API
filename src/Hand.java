//imports yay
import java.util.*;

public class Hand {

    private List<Card> cards;
    private final String handName;

    public Hand(String handName) {

        //validation
        if (handName == null) {
            throw new IllegalArgumentException("Hand name cannot be null");
        }

        if (handName.length() < 1) {
            throw new IllegalArgumentException("Hand name must contain at least 1 character");
        }

        //Constructor body
        cards = new ArrayList<Card>();

        this.handName = handName;
    }

    //hand commands
    public void addCard(Card card) {

        //validation
        if (card == null) {
            throw new IllegalArgumentException("Card cannot be null");
        }

        //Method body
        cards.add(card);
    }

    public void removeCard(Card card) {
        cards.remove(card);
    }

    public List<Card> getCards() {
        return Collections.unmodifiableList(cards);
    }

    public String getName() {
        return handName;
    }

    public int size() {
        return cards.size();
    }

    //hand string formatting
    @Override
    public String toString() {
        String hand = handName + ":" + "\n";
        for (Card card: cards) {
            hand += card;
            hand += "\n";
        }
        return hand;
    }
}
