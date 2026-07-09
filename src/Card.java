//imports
import java.util.*;

//card class formatting
public class Card {

    //Enums
    public enum Rank {
        ACE("Ace"),
        TWO("Two"),
        THREE("Three"),
        FOUR("Four"),
        FIVE("Five"),
        SIX("Six"),
        SEVEN("Seven"),
        EIGHT("Eight"),
        NINE("Nine"),
        TEN("Ten"),
        JACK("Jack"),
        QUEEN("Queen"),
        KING("King");

        private final String rankName;

        Rank(String rankName) {
            this.rankName = rankName;
        }

        @Override
        public String toString() {
            return rankName;
        }
    }

    public enum Suit {
        SPADES("Spades"),
        HEARTS("Hearts"),
        DIAMONDS("Diamonds"),
        CLUBS("Clubs");

        private final String suitName;

        Suit(String suitName) {
            this.suitName = suitName;
        }

        @Override
        public String toString() {
            return suitName;
        }
    }


    //fields
    private final Rank rank;
    private final Suit suit;

    //Class constructor
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


    //card encapsulation methods
    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }


    //card string formatting
    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    //Equals method override
    @Override
    public boolean equals(Object inCard) {

        if (!(inCard instanceof Card)) {
            return false;
        }

        Card otherCard = (Card) inCard;
        if (rank.equals(otherCard.rank) && suit.equals(otherCard.suit)) {
            return true;
        }
        else {
            return false;
        }
    }

    //hashCode method override
    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }
}