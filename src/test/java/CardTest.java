import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CardTest {

    @Test
    void validCardConstructor() {
        Card card = new Card(Rank.ACE, Suit.SPADES);

        assertEquals(Rank.ACE, card.getRank());
        assertEquals(Suit.SPADES, card.getSuit());
    }

    @Test
    void nullRankThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Card(null, Suit.SPADES);
        });
    }

    @Test
    void nullSuitThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Card(Rank.ACE, null);
        });
    }

    @Test
    void toStringFormatsCorrectly() {
        Card card = new Card(Rank.ACE, Suit.SPADES);

        assertEquals("Ace of Spades", card.toString());
    }

    @Test
    void equalsSameCard() {
        Card card = new Card(Rank.ACE, Suit.SPADES);

        assertEquals(card, card);
    }

    @Test
    void equalsDifferentObjectsSameValues() {
        Card first = new Card(Rank.ACE, Suit.SPADES);
        Card second = new Card(Rank.ACE, Suit.SPADES);

        assertEquals(first, second);
    }

    @Test
    void equalsDifferentRank() {
        Card first = new Card(Rank.ACE, Suit.SPADES);
        Card second = new Card(Rank.KING, Suit.SPADES);

        assertNotEquals(first, second);
    }

    @Test
    void equalsDifferentSuit() {
        Card first = new Card(Rank.ACE, Suit.SPADES);
        Card second = new Card(Rank.ACE, Suit.HEARTS);

        assertNotEquals(first, second);
    }

    @Test
    void equalsNullReturnsFalse() {
        Card card = new Card(Rank.ACE, Suit.SPADES);

        assertNotEquals(card, null);
    }

    @Test
    void equalsDifferentTypeReturnsFalse() {
        Card card = new Card(Rank.ACE, Suit.SPADES);

        assertNotEquals(card, "Ace of Spades");
    }

    @Test
    void equalCardsHaveSameHashCode() {
        Card first = new Card(Rank.ACE, Suit.SPADES);
        Card second = new Card(Rank.ACE, Suit.SPADES);

        assertEquals(first.hashCode(), second.hashCode());
    }
}