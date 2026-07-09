//imports
import java.util.*;

//creating deck
public class Deck {

    private ArrayList<Card> cards;

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
        for (int i = 0; i < dealSize; i++) {
            Card topCard = cards.remove(0);
            hand.addCard(topCard);
        }
    }
}