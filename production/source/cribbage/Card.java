package cribbage;

public class Card {
    //CAMPI ------------------------------------------------------------------------------------------------------------
    public String rank;
    public Suite suite;

    //COSTRUTTORI ------------------------------------------------------------------------------------------------------
    public Card(String r, Suite s){
        this.rank = r;
        this.suite = s;
    }

    //METODI -----------------------------------------------------------------------------------------------------------
    public String rank() {
        return rank;
    }

    public int rankNum() {              //J, Q, K valgono tutti 10 ( per fifteenTwos() )
        if (this.rank().equalsIgnoreCase("A")) return 1;
        else if (this.rank().equalsIgnoreCase("2")) return 2;
        else if (this.rank().equalsIgnoreCase("3")) return 3;
        else if (this.rank().equalsIgnoreCase("4")) return 4;
        else if (this.rank().equalsIgnoreCase("5")) return 5;
        else if (this.rank().equalsIgnoreCase("6")) return 6;
        else if (this.rank().equalsIgnoreCase("7")) return 7;
        else if (this.rank().equalsIgnoreCase("8")) return 8;
        else if (this.rank().equalsIgnoreCase("9")) return 9;
        else return 10;
    }

    public Suite suite() {
        return suite;
    }

    public String toString() {
        return this.rank()+this.suite().to1String();
    }
}
