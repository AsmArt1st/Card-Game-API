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
      public ArrayList<Card> deckOfCards;
      public Deck() {
        deckOfCards = new ArrayList<>(52);
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] values = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        for (String suit : suits) {
          for (String val : values) {
            deckOfCards.add(new Card(val, suit));
          }
        }
      }
    }


  static Deck deck = new Deck();

  //Shuffle cmd
  public static void shuffle(){
    Collections.shuffle(deck.deckOfCards);
  }

  //Dealing cmd
  public static void deal(ArrayList<Card> role, int dealSize) {
    for (int i = 0; i < dealSize; i++) {
      Card topCard = deck.deckOfCards.remove(0);
      role.add(topCard);
    }
  }

  //test
  public static void main(String[] args){
    ArrayList<Card> dealerHand = new ArrayList<>();
    ArrayList<Card> playerHand = new ArrayList<>();
    CardsAPI.shuffle();
    int gameHandSize = 5;
    System.out.println("---Player Hand---");
    CardsAPI.deal(playerHand, gameHandSize);
    for (Card card : playerHand) {
      System.out.println(card);
    }
    System.out.println();
    System.out.println("---Dealer Hand---");
    CardsAPI.deal(dealerHand, gameHandSize);
    for (Card card : dealerHand) {
    System.out.println(card);
    }
  }
}