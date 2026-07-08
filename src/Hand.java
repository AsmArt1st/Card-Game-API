//imports yay
import java.util.*;

public class Hand {

    private List<Card> cards;
    private String handName;

    public Hand(String handName) {
        cards = new ArrayList<Card>();
        this.handName = handName;
    }

    //hand commands
    public void addCard(Card card) {
        cards.add(card);
    }

    public void removeCard(Card card) {
        cards.remove(card);
    }

    public List<Card> getCards() {
        return Collections.unmodifiableList(cards);
    }

    public String getHandName() {
        return handName;
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
