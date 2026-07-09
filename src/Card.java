 //card class formatting
public class Card{

    //fields
    private final String rank;
    private final String suit;

    //Class constructor
    public Card(String r, String s) {

        //validaiton errors
        if (!( "Ace".equals(r) || "Two".equals(r) ||"Three".equals(r) ||"Four".equals(r) ||"Five".equals(r) ||"Six".equals(r) ||"Seven".equals(r) ||"Eight".equals(r) ||"Nine".equals(r) ||"Ten".equals(r) ||"Jack".equals(r) ||"Queen".equals(r) ||"King".equals(r))) {
            throw new IllegalArgumentException("Invalid Rank");
        }

        if (!( "Spades".equals(s) || "Hearts".equals(s) || "Diamonds".equals(s) || "Clubs".equals(s))) {
            throw new IllegalArgumentException("Invalid Suit");
        }


        //fields
        rank = r;
        suit = s;
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
}