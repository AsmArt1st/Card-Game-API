//imports
import java.util.*;

//card class formatting
public class Card{

    //fields
    private final String rank;
    private final String suit;

    //Class constructor
    public Card(String rank, String suit) {

        //validaiton errors
        if (!( "Ace".equals(rank) || "Two".equals(rank) ||"Three".equals(rank) ||"Four".equals(rank) ||"Five".equals(rank) ||"Six".equals(rank) ||"Seven".equals(rank) ||"Eight".equals(rank) ||"Nine".equals(rank) ||"Ten".equals(rank) ||"Jack".equals(rank) ||"Queen".equals(rank) ||"King".equals(rank))) {
            throw new IllegalArgumentException("Invalid Rank");
        }

        if (!( "Spades".equals(suit) || "Hearts".equals(suit) || "Diamonds".equals(suit) || "Clubs".equals(suit))) {
            throw new IllegalArgumentException("Invalid Suit");
        }


        //variables
        this.rank = rank;
        this.suit = suit;
    }


    //card encapsulation methods
    public String getRank() {
        return rank;
    }

    public String getSuit() {
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