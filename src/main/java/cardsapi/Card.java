package cardsapi;

//imports
import java.util.Objects;


/**
 * Formats Card objects with suits and ranks
 * 
 * Uses the suits and ranks from a standard deck of 52 cards and stores them in objects
 */

public class Card {

    //fields
    private final Rank rank;
    private final Suit suit;


    /**
     * Constructs a card object
     * 
     * @param rank takes in a rank enum as a parameter to store the rank of the card
     * @param suit takes in a suit enum as a parameter to store the suit of the card
     * @throws IllegalArgumentException if rank or suit parameter is null
     */

    public Card(Rank rank, Suit suit) {

        //validation
        if (rank == null) {
            throw new IllegalArgumentException("Rank cannot be null");
        }

        if (suit == null) {
            throw new IllegalArgumentException("Suit cannot be null");
        }

        this.rank = rank;
        this.suit = suit;
    }


    /**
     * Allows caller to get the rank of given card
     * 
     * @return returns rank of given card
    */

    public Rank getRank() {
        return rank;
    }


    /**
     * Allows caller to get the suit of given card
     * 
     * @return returns suit of given card
     */

    public Suit getSuit() {
        return suit;
    }


    //card string formatting
    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    /**
     * equals() override in order  to compare a cards rank and suit enums
     */
    
    @Override
    public boolean equals(Object inCard) {

        if (!(inCard instanceof Card otherCard)) {
            return false;
        }

        return rank == otherCard.rank && suit == otherCard.suit;
    }

    //hashCode method override
    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }
}