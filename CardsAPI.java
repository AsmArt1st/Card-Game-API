//imports yay
import java.util.*;

//API with commands hopefully
public class CardsAPI {

  //card class formatting
    public static class Card{
      public String suit;
      public String val;
      public Card(String v, String s){
        val = v;
        suit = s;
      }
      @Override
      public String toString() {
        return val + " of " + suit;
      }
    }

  //creating deck
    public static class Deck {
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

  //test
  public static void main(String[] args){
    ArrayList<Card> dealerHand = new ArrayList<>();
    ArrayList<Card> playerHand = new ArrayList<>();
    Deck testDeck = new Deck();
    testDeck.shuffle();
    int gameHandSize = 5;
    System.out.println("---Player Hand---");
    testDeck.deal(playerHand, gameHandSize);
    for (Card card : playerHand) {
      System.out.println(card);
    }
    System.out.println();
    System.out.println("---Dealer Hand---");
    testDeck.deal(dealerHand, gameHandSize);
    for (Card card : dealerHand) {
    System.out.println(card);
    }
  }
}