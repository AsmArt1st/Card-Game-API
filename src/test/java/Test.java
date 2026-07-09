public class Test {

    public static void main(String[] args) {
        
        //testing
        Hand testHand = new Hand("Test Hand");
        Card testCard = new Card(Rank.ACE, Suit.SPADES);
        Deck testDeck = new Deck("Test Deck");
        testHand.addCard(testCard);
        System.out.println(testDeck.size());
        testDeck.shuffle();
        testDeck.deal(testHand, -1);
        System.out.println(testDeck.size());
    }
}
