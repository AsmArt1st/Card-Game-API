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
  static String[] dealerHand;
  static String[] playerHand;

  //Shuffle cmd
  public static void shuffle(){
    Collections.shuffle(deck.deckOfCards);
  }

  //Dealing cmd
  public static void deal(String[] role, int dealSize) {
    for (int i = 0; i < dealSize; i++) {
      Card topCard = deck.deckOfCards.remove(0);
      role[i] = topCard.val + " of " + topCard.suit;
    }
  }

  //test
  public static void main(String[] args){
    CardsAPI.shuffle();
    int gameHandSize = 5;
    playerHand = new String[gameHandSize];
    dealerHand = new String[gameHandSize];
    CardsAPI.deal(playerHand, gameHandSize);
    for (String card : playerHand) {
      System.out.println(card);
    }
  }
}