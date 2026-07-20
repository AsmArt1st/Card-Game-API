package cardsapi;

//imports yay
import java.util.Collection;


/**
 * Represents hands as collections of card objects
 * 
 * Inherits Pile functionality while adding some hand-specific methods
 */

public class Hand extends Pile {

    /**
     * Constructs a Hand object
     * 
     * @param cardCollection collection used to store cards in this hand
     * @param name name assigned to this hand
     * @throws IllegalArgumentException if input is a string with less than 1 character
     * @throws IllegalArgumentException if input is null
     */

    public Hand(Collection<Card> cardCollection, String name) {
        super(cardCollection, name);
    }

     public void playCard(Pile playArea, Card card) {
        transferCard(playArea, card);
    }
}
