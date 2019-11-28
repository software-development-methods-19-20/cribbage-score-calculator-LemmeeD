package test.cribbage;

import cribbage.*;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ParseHandTest {
    @Test
    void parseOneCard5H() {
        Card card = CardParser.parseCard("5H");
        assertThat(card.rank(), is("5"));
        assertThat(card.suite(), is(Suite.HEART));
    }
    @Test
    void parseOneCard2D() {
        Card card = CardParser.parseCard("2D");
        assertThat(card.rank(), is("2"));
        assertThat(card.suite(), is(Suite.DIAMONDS));
    }
    @Test
    void parseOneCardAC() {
        Card card = CardParser.parseCard("AC");
        assertThat(card.rank(), is("A"));
        assertThat(card.suite(), is(Suite.CLUBS));
    }
    @Test
    void parseOneCardQS() {
        Card card = CardParser.parseCard("QS");
        assertThat(card.rank(), is("Q"));
        assertThat(card.suite(), is(Suite.SPADES));
    }
    @Test
    void parseOneHand1() {
        Hand hand = HandParser.parseHand("ASQH3C7D");
        assertThat(hand.cards[0].toString(), is("AS"));
        assertThat(hand.cards[1].toString(), is("QH"));
        assertThat(hand.cards[2].toString(), is("3C"));
        assertThat(hand.cards[3].toString(), is("7D"));
    }
    @Test
    void parseOneHand2() {
        Hand hand = HandParser.parseHand("JH2C");
        assertThat(hand.cards[0].toString(), is("JH"));
        assertThat(hand.cards[1].toString(), is("2C"));
    }
}
