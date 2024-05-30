package org.example.homework13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void getSuit() {
        var cards = new Card(Suit.HEARTS, Rank.JACK);

        assertEquals("HEARTS", cards.getSuit().toString());
    }

    @Test
    void getRank() {
        var cards = new Card(Suit.HEARTS, Rank.JACK);

        assertEquals("JACK", cards.getRank().toString());
    }

    @Test
    void testToString() {
        var cards = new Card(Suit.HEARTS, Rank.JACK);

        assertEquals("jack of hearts", cards.toString().toLowerCase());
    }
}