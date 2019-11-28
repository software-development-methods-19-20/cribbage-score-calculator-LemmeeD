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
        Hand hand = HandParser.parseHand("ASQH3C7DKC");
        assertThat(hand.cards[0].toString(), is("AS"));
        assertThat(hand.cards[1].toString(), is("QH"));
        assertThat(hand.cards[2].toString(), is("3C"));
        assertThat(hand.cards[3].toString(), is("7D"));
        assertThat(hand.cards[4].toString(), is("KC"));
        assertThat(hand.getStarterCard().toString(), is("KC"));
    }
    @Test
    void parseOneHand2() {
        Hand hand = HandParser.parseHand("JH2CJH2CAH");
        assertThat(hand.cards[0].toString(), is("JH"));
        assertThat(hand.cards[1].toString(), is("2C"));
        assertThat(hand.cards[2].toString(), is("JH"));
        assertThat(hand.cards[3].toString(), is("2C"));
        assertThat(hand.cards[4].toString(), is("AH"));
        assertThat(hand.getStarterCard().toString(), is("AH"));
    }
    @Test
    void parseOneHand3() {
        Hand hand = HandParser.parseHand("JH2C5DQS6S");
        assertThat(hand.cards[0].toString(), is("JH"));
        assertThat(hand.cards[1].toString(), is("2C"));
        assertThat(hand.cards[2].toString(), is("5D"));
        assertThat(hand.cards[3].toString(), is("QS"));
        assertThat(hand.cards[4].toString(), is("6S"));
        assertThat(hand.getStarterCard().toString(), is("6S"));
    }
    @Test
    void scoreFlush1() {
        Hand hand = HandParser.parseHand("JHAC5H6HQH"); //JH AC 5H 6H QH ---> H: 0 / 2 3 4    S: / / / / /    D: / / / / /    C: / 1 / / /
        assertThat(Scorer.Flush(hand), is(0));
    }
    @Test
    void scoreFlush2() {
        Hand hand = HandParser.parseHand("JH2H5H6HAC"); //JH 2H 5H 6H AC ---> H: 0 1 2 3 /    S: / / / / /    D: / / / / /    C: / / / / 4
        assertThat(Scorer.Flush(hand), is(4));
    }
    @Test
    void scoreFlush3() {
        Hand hand = HandParser.parseHand("QC3H6HAHKD"); //QC 3H 6H AH KD ---> H: / 1 2 3 /    S: / / / / /    D: / / / / 4    C: 1 / / / /
        assertThat(Scorer.Flush(hand), is(0));
    }
    @Test
    void scoreFlush4() {
        Hand hand = HandParser.parseHand("AD5D8D3DJD"); //AD 5D 8D 3D JD ---> H: / / / / /    S: / / / / /    D: 0 1 2 3 4     C: / / / / /
        assertThat(Scorer.Flush(hand), is(5));
    }
    @Test
    void score15Twos1() {
        Hand hand = HandParser.parseHand("7D8DACKD2D"); //7+8, 8+7.
        assertThat(Scorer.fifteenTwos(hand), is(2));
    }
    @Test
    void score15Twos2() {
        Hand hand = HandParser.parseHand("KD5H8C7D3D"); //K+5, 5+K, 8+7, 7+8
        assertThat(Scorer.fifteenTwos(hand), is(4));
    }
    @Test
    void score15Twos3() {
        Hand hand = HandParser.parseHand("AD4D8DADJD"); //
        assertThat(Scorer.fifteenTwos(hand), is(0));
    }
    @Test
    void score15Twos4() {
        Hand hand = HandParser.parseHand("JC5D5H9S6S"); //
        assertThat(Scorer.fifteenTwos(hand), is(6));
    }
}
