//imports yay
import java.util.*;

public class CardsAPI {

    //test
    public static void main(String[] args){

        int gameHandSize = 5;
        Deck testDeck = new Deck();
        ArrayList<Card> dealerHand = new ArrayList<>();
        ArrayList<Card> playerHand = new ArrayList<>();

        testDeck.shuffle();
        testDeck.deal(playerHand, gameHandSize);
        testDeck.deal(dealerHand, gameHandSize);
        
        System.out.println("---Player Hand---");
        for (Card card : playerHand) {
            System.out.println(card);
        }

        System.out.println();
        System.out.println("---Dealer Hand---");
        for (Card card : dealerHand) {
            System.out.println(card);
        }
    }
}