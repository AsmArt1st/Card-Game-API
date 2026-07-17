package cardsapi;

//imports yay
import java.util.Collection;
import java.util.Collections;


/**
 * Base class for collections that store card objects
 * 
 * Provides common methods for various pile types
 */

public abstract class Pile {

    private final Collection<Card> cards;
    private final String name;

    
    /**
     * Constructs a Pile object
     * 
     * The provided collection becomes the backing collection for this pile
     * 
     * @param name name assigned to this pile
     * @param cardCollection collection used to store cards in given pile
     * @throws IllegalArgumentException if name is empty
     * @throws IllegalArgumentException if name is null
     * @throws IllegalArgumentException if cardCollection is null
     */
    
    protected Pile(Collection<Card> cardCollection, String name) {
        
        //validation
        if (name == null) {
            throw new IllegalArgumentException("Pile name cannot be null");
        }

        if (name.length() < 1) {
            throw new IllegalArgumentException("Pile name must contain at least 1 character");
        }

        if (cardCollection == null) {
            throw new IllegalArgumentException("Card collection cannot be null");
        }

        //constructor body
        this.cards = cardCollection;
        this.name = name;
    }


    //getter methods

    /**
     * Gives an unmodifiable collection of cards to caller
     * 
     * @return an unmodifiable collection of the cards in this pile
     */

    public Collection<Card> getCards() {
        return Collections.unmodifiableCollection(cards);
    }


    /**
     * Gets name of given pile
     * 
     * @return the name assigned to this pile
     */

    public String getName() {
        return name;
    }


    /**
     * Gets size of given pile
     * 
     * @return the number of cards currently in this pile
     */

    public int size() {
        return cards.size();
    }


    //Manipulation methods

    /**
     * Adds a card to a pile
     * 
     * @param card card to add to this pile
     * @throws IllegalArgumentException if card is null
     */

    protected void addCard(Card card) {

        //validation
        if (card == null) {
            throw new IllegalArgumentException("Cannot add \"null\" to pile");
        }

        //Method body
        cards.add(card);
    }


    /** 
     * Removes a card from a pile
     * 
     * @param card card object to remove from pile
     * 
     * If the specified card isnt in the pile, nothing will happen
    */

    protected void removeCard(Card card) {
        cards.remove(card);
    }


    /**
     * Defines how implementations choose a card for transferring
     * 
     * Implementations must return a card currently contained within the pile
     */
    protected abstract Card selectCard();


    /**
     * Transfers x cards from the given pile to a specified pile
     * 
     * @param pile pile that receives transferred cards
     * @param transferSize how many cards are transferred
     * @throws IllegalArgumentException if pile is null
     * @throws IllegalArgumentException if transferSize is less than 1
     * @throws IllegalArgumentException if there arent enough cards left in source pile
     */

    protected void transferCards(Pile pile, int transferSize) {

        //validation
        if (pile == null) {
            throw new IllegalArgumentException("Pile cannot be null");
        }

        if (transferSize < 1) {
            throw new IllegalArgumentException("Must transfer at least 1 card");
        }

        if (transferSize > cards.size()) {
            throw new IllegalArgumentException("Not enough cards left in pile");
        }
        
        //method body
        for (int i = 0; i < transferSize; i++) {
            Card card = selectCard();
            cards.remove(card);
            pile.addCard(card);
        }
    }


    /**
     * Transfers 1 card from the given pile to a specified pile
     * 
     * @param pile pile that recieves transferred cards
     * @throws IllegalArgumentException if pile is null
     * @throws IllegalArgumentException if there arent enough cards left in source pile
     */

    protected void transferCards(Pile pile) {
        this.transferCards(pile, 1);
    }

    //Overrides

    /**
     * Constructs a string to represent cards in a given pile
     * 
     * @return formatted string of pile name and cards contained
     */

    @Override
    public String toString() {

        StringBuilder pile = new StringBuilder();

        pile.append(name + ":\n");

        for (Card card : cards) {
            pile.append(card + "\n");
        }

        return pile.toString();
    }
}
