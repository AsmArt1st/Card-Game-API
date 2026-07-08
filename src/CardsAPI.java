public class CardsAPI {

    //test
    public static void main(String[] args){

        int gameHandSize = 5;
        Deck testDeck = new Deck();
        Hand dealerHand = new Hand();
        Hand playerHand = new Hand();

        testDeck.shuffle();
        testDeck.deal(playerHand, gameHandSize);
        testDeck.deal(dealerHand, gameHandSize);
        
        System.out.println("---Player Hand---");
        for (Card card : playerHand.getCards()) {
            System.out.println(card);
        }

        System.out.println();
        System.out.println("---Dealer Hand---");
        for (Card card : dealerHand.getCards()) {
            System.out.println(card);
        }
    }
}