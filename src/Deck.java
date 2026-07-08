//imports
import java.util.*;

//creating deck
public class Deck {
  public ArrayList<Card> cards;
  public Deck() {
    cards = new ArrayList<>(52);
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] values = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    for (String suit : suits) {
      for (String val : values) {
        cards.add(new Card(val, suit));
      }
    }
  }

//deck commands

  //Shuffle cmd
  public void shuffle(){
    Collections.shuffle(cards);
  }

  //Dealing cmd
  public void deal(ArrayList<Card> role, int dealSize) {
    for (int i = 0; i < dealSize; i++) {
      Card topCard = cards.remove(0);
      role.add(topCard);
    }
  }
}