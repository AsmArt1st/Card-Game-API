package cardsapi;

//imports yay
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Creates "decks" of 52 cards with the standard 13 ranks and 4 suits
 * 
 * Allows you to create new decks that store cards to be manipulated
 * 
 * Stores card objects
 */

public class Deck {
    
    //Fields
    private final List<Card> cards;
    private final String deckName;


    /**
     * Constructs a deck object
     * 
     * @param deckName needs a string to title the deck for string formatting (toString())
     * @throws IllegalArgumentException if deck name is less than 1 character or is null
     */

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

    //Deck commands

    
    /**
     * Shuffles the given deck
     * 
     * randomizes the position of cards in a given deck
     */

    public void shuffle() {
        Collections.shuffle(cards);
    }


    /**
     * Deals x cards from the given deck to a specified hand
     * 
     * @param hand needs a hand object as an input to deal cards to
     * @param dealSize needs an integer to decide how many cards to deal
     * @throws IllegalArgumentException if hand is null, if dealSize is less than 1, or if there arent enough cards left in specified deck
     */
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


    /**
     * Gets size of given deck
     * 
     * @return returns the number of card objects in a deck list
     */

    public int size() {
        return cards.size();
    }


    /**
     * Gets name of given deck
     * 
     * @return returns the string passed into the deck constructor
     */

    public String getName() {
        return deckName;
    }


    /**
     * Gives an unmodifiable list of cards to caller
     * 
     * @return returns a list of the cards in given deck that cannot be modified
     */

    public List<Card> getCards() {
        return Collections.unmodifiableList(cards);
    }

    //deck string formatting
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