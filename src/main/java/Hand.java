//imports yay
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Creates "Hands" which store Card objects
 * 
 * Allows you to create Hand objects to add and remove cards from
 */

public class Hand {

    private final List<Card> cards;
    private final String handName;


    /**
     * Constructs a Hand object
     * 
     * @param handName needs a string to title the hand for string formatting (toString())
     * @throws IllegalArgumentException if input is a string with less than 1 character or null
     */

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


    /**
     * Adds a card to a hand
     * 
     * @param card needs a card object as an input
     * @throws IllegalArgumentException if input is null
     */

    public void addCard(Card card) {

        //validation
        if (card == null) {
            throw new IllegalArgumentException("Cannot add \"null\" to hand");
        }

        //Method body
        cards.add(card);
    }

    
    /** 
     * Removes a card from a hand
     * 
     * @param card needs a card object to remove from hand
     * 
     * If there is no matching card present to remove nothing will happen
    */

    public void removeCard(Card card) {
        cards.remove(card);
    }
    

    /**
     * Gives an unmodifiable list of cards to caller
     * 
     * @return returns a list of the cards in given hand that cannot be modified
     */

    public List<Card> getCards() {
        return Collections.unmodifiableList(cards);
    }

    
    /**
     * Gets name of given hand
     * 
     * @return returns the string passed into the hand constructor
     */

    public String getName() {
        return handName;
    }


    /**
     * Gets size of given hand
     * 
     * @return returns the number of card objects in a hand list
     */

    public int size() {
        return cards.size();
    }


    /**
     * Returns a formatted string of cards in player hand
     * 
     * @return formatted hand contents
     */
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
