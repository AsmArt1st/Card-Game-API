//imports yay
import java.util.*;

public class Deck {
    
    //Fields
    private ArrayList<Card> cards;

    //Class Constructor
    public Deck() {
        cards = new ArrayList<>(52);
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        for (String suit : suits) {
            for (String rank : ranks) {
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
}