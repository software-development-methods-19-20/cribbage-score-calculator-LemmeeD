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

    /*@Override
    public String toString() {
        switch (this) {
            case HEART: return "HEART"; break;
            case SPADES: return "SPADES"; break;
            case DIAMONDS: return "DIAMONDS"; break;
            case CLUBS: return "CLUBS"; break;
        }
    }*/
}
