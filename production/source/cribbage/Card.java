package cribbage;

public class Card {
    public String rank;
    public Suite suite;

    public Card(String r, Suite s){
        this.rank = r;
        this.suite = s;
    }

    public String rank() {
        return rank;
    }

    public Suite suite() {
        return suite;
    }
}
