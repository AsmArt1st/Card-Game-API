package cardsapi;

//imports yay
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Creates "Piles" which store Card objects
 * 
 * Allows you to create specific types of piles using the Pile abstract class
 */

public abstract class Pile {

    private final List<Card> cards;
    private final String name;

    
    /**
     * Constructs a Pile object
     * 
     * @param name needs a string to title the pile for string formatting (StringBuilder)
     * @throws IllegalArgumentException if input is a string with less than 1 character or null
     */
    
    public Pile(String name) {
        
        //validation
        if (name == null) {
            throw new IllegalArgumentException("Pile name cannot be null");
        }

        if (name.length() < 1) {
            throw new IllegalArgumentException("Pile name must contain at least 1 character");
        }

        //constructor body
        cards = new ArrayList<Card>();
        this.name = name;
    }


    /**
     * Gives an unmodifiable list of cards to caller
     * 
     * @return returns a list of the cards in given pile that cannot be modified
     */

    public List<Card> getCards() {
        return Collections.unmodifiableList(cards);
    }


    /**
     * Gets size of given pile
     * 
     * @return returns the number of card objects in a pile list
     */

    public int size() {
        return cards.size();
    }


    /**
     * Constructs a string to represent cards in a given pile
     * 
     * @return returns the given pile as a formatted list of card objects and the pile's name
     */

    @Override
    public String toString() {

        StringBuilder pile = new StringBuilder();

        pile.append(name + ":");

        for (Card card : cards) {
            pile.append(card + "\n");
        }

        return pile.toString();
    }
}
