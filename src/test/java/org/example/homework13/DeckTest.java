package org.example.homework13;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @Test
    void drawCard() {
        var deck = new Deck();
        Card result = deck.drawCard();

        assertEquals("TWO of CLUBS", result.toString());
    }

    @Test
    void shuffle() {
        var deck = new Deck();
        List <Card> originalCards = new ArrayList<>(deck.getCards());
        deck.shuffle();
        List<Card> cardsAfterShuffle = deck.getCards();

        assertEquals(originalCards.size(),cardsAfterShuffle.size());
        assertNotEquals(originalCards,cardsAfterShuffle);
        assertTrue(originalCards.containsAll(cardsAfterShuffle));
    }

    @Test
    void size() {
        var deck = new Deck();

        assertEquals(52,deck.size());
    }
}