# CardsAPI

Version: 1.0.0

A Java card game API for creating and manipulating standard playing cards, decks of cards, and card hands.
Originally a learning project but we'll see how big this grows


Features:

Card objects with enum ranks and suits
Standard deck creation for 52-card decks (larger deck support planned)
Deck shuffling and dealing x cards to a hand
Hand management through the Hand class
JUnit test files
Maven support


Setup

git clone https://github.com/AsmArt1st/Card-Game-API

Maven stuff:

```bash
mvn test
```
to test code

```bash
mvn javadoc
```
for documentation


Classes

Card
Represents a single playing card with an enum rank and suit

Deck
Creates and manages standard 52 card decks

Hand
Stores and manages "hands" of card objects

## Example Usage

```java
Deck deck = new Deck("Game Deck");
Hand playerHand = new Hand("Player Hand");

deck.shuffle();
deck.deal(playerHand, 5);

System.out.println(playerHand);
```

```markdown
Future Plans
-add support for bigger decks
-more utilities
-additional deck customization

and more to come!
