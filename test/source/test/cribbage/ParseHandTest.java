package test.cribbage;

import cribbage.Card;
import cribbage.CardParser;
import cribbage.Suite;
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
}
