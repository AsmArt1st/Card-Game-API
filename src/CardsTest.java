public class CardsTest {

    //test
    public static void main(String[] args) {

        Deck testDeck = new Deck("Test Deck");
        Hand dealerHand = new Hand("Dealer's Hand");
        Hand playerHand = new Hand("Player's Hand");

        testDeck.shuffle();
        testDeck.deal(playerHand, -1);
        testDeck.deal(null, 12);
        
        System.out.println(dealerHand);
        System.out.println();
        System.out.println(playerHand);
    }
}