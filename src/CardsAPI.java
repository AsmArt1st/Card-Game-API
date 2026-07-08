public class CardsAPI {

    //test
    public static void main(String[] args){

        int gameHandSize = 5;
        Deck testDeck = new Deck();
        Hand dealerHand = new Hand("Dealer's Hand");
        Hand playerHand = new Hand("Player's Hand");

        testDeck.shuffle();
        testDeck.deal(playerHand, gameHandSize);
        testDeck.deal(dealerHand, gameHandSize);
        
        System.out.println(playerHand);
        System.out.println();
        System.out.println(dealerHand);
    }
}