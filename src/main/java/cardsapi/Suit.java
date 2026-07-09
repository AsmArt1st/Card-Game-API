package cardsapi;

/**
 * Enum list of all 4 suits in a standard 52 card deck
 */

public enum Suit {
    
    SPADES("Spades"),
    HEARTS("Hearts"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs");

    private final String suitName;

    Suit(String suitName) {
        this.suitName = suitName;
    }

    @Override
    public String toString() {
        return suitName;
    }
}
