 //card class formatting
public class Card{
    private final String rank;
    private final String suit;
    public Card(String r, String s){
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