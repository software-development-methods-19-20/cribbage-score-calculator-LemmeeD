package cribbage;

public enum Suite {
    HEART,
    SPADES,
    DIAMONDS,
    CLUBS;

    public static Suite getSuite(char c){
        if (c == 'H') return HEART;
        else if (c == 'S') return SPADES;
        else if (c == 'D') return DIAMONDS;
        else if (c == 'C') return CLUBS;
        else return null;
    }

    public String to2String() {
        if (this.toString() == "SPADES") return "S";
        else if (this.toString() == "CLUBS") return "C";
        else if (this.toString() == "DIAMONDS") return "D";
        else if (this.toString() == "HEART") return "H";
        else return "";
    }
}
