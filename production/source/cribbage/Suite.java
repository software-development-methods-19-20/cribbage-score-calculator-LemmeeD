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

    public String to1String() {
        if (this.toString() == "SPADES") return "S";
        else if (this.toString() == "CLUBS") return "C";
        else if (this.toString() == "DIAMONDS") return "D";
        else if (this.toString() == "HEART") return "H";
        else return "";
    }

    public static Suite[] allValues() {
        Suite[] s = new Suite[4];
        s[0] = HEART; s[1] = SPADES; s[2] = DIAMONDS; s[3] = CLUBS;
        return s;
    }

    public static String[] allStringValues() {
        String[] s = new String[4];
        s[0] = "HEART"; s[1] = "SPADES"; s[2] = "DIAMONDS"; s[3] = "CLUBS";
        return s;
    }

    public static char[] allCharValues() {
        char[] s = new char[4];
        s[0] = 'H'; s[1] = 'S'; s[2] = 'D'; s[3] = 'C';
        return s;
    }

}
