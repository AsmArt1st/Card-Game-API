//imports yay
import java.util.*;

public class Deck {
    
    //Fields
    private ArrayList<Card> cards;
    private final String deckName;

    //Class Constructor
    public Deck(String deckName) {
        
        //validation
        if (deckName == null) {
            throw new IllegalArgumentException("Deck name cannot be null");
        }

        if (deckName.length() < 1) {
            throw new IllegalArgumentException("Deck name must contain at least 1 character");
        }

        //method body
        cards = new ArrayList<>(52);
        this.deckName = deckName;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

//deck commands

    //Shuffle cmd
    public void shuffle() {
        Collections.shuffle(cards);
    }

    //Dealing cmd
    public void deal(Hand hand, int dealSize) {

        //validation
        if (hand == null) {
            throw new IllegalArgumentException("Hand cannot be null");
        }

        if (dealSize < 1) {
            throw new IllegalArgumentException("Must deal at least 1 card");
        }

        if (dealSize > cards.size()) {
            throw new IllegalArgumentException("Not enough cards left in deck");
        }
        
        //method body
        for (int i = 0; i < dealSize; i++) {
            Card topCard = cards.remove(0);
            hand.addCard(topCard);
        }
    }

    //Size cmd
    public int size() {
        return cards.size();
    }

    //Name get cmd
    public String getName() {
        return deckName;
    }

    public List<Card> getCards() {
        return Collections.unmodifiableList(cards);
    }

    //hand string formatting
    @Override
    public String toString() {
        String deck = deckName + ":" + "\n";
        for (Card card: cards) {
            deck += card;
            deck += "\n";
        }
        return deck;
    }
}