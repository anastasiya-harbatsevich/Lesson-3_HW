package org.example.homework13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackJackHandTest {

    @Test
    void getValueNumericCaseEquals21() {
        var blackJackHand = new BlackJackHand();
        blackJackHand.addCard(new Card(Suit.HEARTS, Rank.EIGHT));
        blackJackHand.addCard(new Card(Suit.DIAMONDS, Rank.FOUR));
        blackJackHand.addCard(new Card(Suit.HEARTS, Rank.TWO));
        blackJackHand.addCard(new Card(Suit.HEARTS, Rank.SEVEN));

        int result = blackJackHand.getValue();

        assertEquals(21, result);
    }

    @Test
    void getValueNumericCaseLess21() {
        var blackJackHand = new BlackJackHand();

        blackJackHand.addCard(new Card(Suit.HEARTS, Rank.EIGHT));
        blackJackHand.addCard(new Card(Suit.DIAMONDS, Rank.FOUR));
        blackJackHand.addCard(new Card(Suit.HEARTS, Rank.TWO));
        blackJackHand.addCard(new Card(Suit.HEARTS, Rank.THREE));

        int result = blackJackHand.getValue();

        assertEquals(17, result);
    }
    @Test
    void getValueNumericCaseMore21() {
        var blackJackHand = new BlackJackHand();

        blackJackHand.addCard(new Card(Suit.HEARTS, Rank.EIGHT));
        blackJackHand.addCard(new Card(Suit.DIAMONDS, Rank.FOUR));
        blackJackHand.addCard(new Card(Suit.HEARTS, Rank.SIX));
        blackJackHand.addCard(new Card(Suit.HEARTS, Rank.NINE));

        int result = blackJackHand.getValue();

        assertEquals(27, result);
    }

    @Test
    void getValueAces() {
        var blackJackHand = new BlackJackHand();

        blackJackHand.addCard(new Card(Suit.HEARTS, Rank.ACE));
        blackJackHand.addCard(new Card(Suit.DIAMONDS, Rank.ACE));
        blackJackHand.addCard(new Card(Suit.SPADES, Rank.ACE));

        int result = blackJackHand.getValue();

        assertEquals(13, result);
    }

    @Test
    void getValueDifferentRanks() {
        var blackJackHand = new BlackJackHand();

        blackJackHand.addCard(new Card(Suit.HEARTS, Rank.ACE));
        blackJackHand.addCard(new Card(Suit.DIAMONDS, Rank.JACK));
        blackJackHand.addCard(new Card(Suit.SPADES, Rank.TEN));

        int result = blackJackHand.getValue();

        assertEquals(21, result);
    }

    @Test
    void getCards() {
        var blackJackHand = new BlackJackHand();

        blackJackHand.addCard(new Card(Suit.HEARTS, Rank.EIGHT));
        blackJackHand.addCard(new Card(Suit.CLUBS, Rank.EIGHT));
        blackJackHand.addCard(new Card(Suit.DIAMONDS, Rank.EIGHT));

        assertEquals(3, blackJackHand.getCards().size(), "Hand should contain 3 cards");
    }

    @Test
    void isBusted() {
        var blackJackHand = new BlackJackHand();

        blackJackHand.addCard(new Card(Suit.HEARTS, Rank.EIGHT));
        blackJackHand.addCard(new Card(Suit.CLUBS, Rank.EIGHT));
        blackJackHand.addCard(new Card(Suit.DIAMONDS, Rank.EIGHT));

        boolean result = blackJackHand.isBusted();
        assertTrue(result);
    }

    @Test
    void isBlackJackMoreCards() {
        var blackJackHand = new BlackJackHand();

        blackJackHand.addCard(new Card(Suit.HEARTS, Rank.ACE));
        blackJackHand.addCard(new Card(Suit.DIAMONDS, Rank.JACK));
        blackJackHand.addCard(new Card(Suit.SPADES, Rank.TEN));

        boolean result = blackJackHand.isBlackJack();
        assertFalse(result);
    }
    @Test
    void isBlackJack() {
        var blackJackHand = new BlackJackHand();

        blackJackHand.addCard(new Card(Suit.DIAMONDS, Rank.ACE));
        blackJackHand.addCard(new Card(Suit.SPADES, Rank.TEN));

        boolean result = blackJackHand.isBlackJack();
        assertTrue(result);
    }

    @Test
    void addCard() {
        var blackJackHand = new BlackJackHand();
        var card = new Card(Suit.CLUBS, Rank.ACE);

        blackJackHand.addCard(card);

        assertEquals(1, blackJackHand.getCards().size(), "Hand should contain 1 card after adding a single card");
        assertEquals(card, blackJackHand.getCards().getFirst(), "Added card should be the same as the card in the hand");
    }

    @Test
    void testToString() {
        var blackJackHand = new BlackJackHand();

        blackJackHand.addCard(new Card(Suit.DIAMONDS, Rank.ACE));
        blackJackHand.addCard(new Card(Suit.SPADES, Rank.TEN));

        assertEquals(blackJackHand.getCards().toString(), blackJackHand.toString());
    }
}