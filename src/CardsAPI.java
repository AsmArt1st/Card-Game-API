//imports yay
import java.util.*;

//API with commands hopefully
public class CardsAPI {

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