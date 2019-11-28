package cribbage;

public class CardParser {
    public static Card parseCard(String cardAsText) {
        char r = 'a';
        char s = 'a';
        for (int i = 1; i < cardAsText.length(); i += 2) {
            r = cardAsText.charAt(i - 1);
            s = cardAsText.charAt(i);
            break;
        }
        Card newCard = new Card(Character.toString(r), Suite.getSuite(s));
        return newCard;
    }










    /*public static Card parseCard(String cardAsText) {
        for (int i = 0; i < cardAsText.length(); i++) {
            Card[] hand = new Card[cardAsText/2];
            if (cardAsText.length() % 2 == 0) {
                break;
                System.out.println("Stringa lunga dispari...");
            }
            else if (i == 0) {
                System.out.println("i = 0, non si fa niente");
            }
            else if (i % 2 != 1){
                System.out.println("i%2 != 1, non si fa niente");
            }
            else if (i % 2 == 1){
                char r = cardAsText.charAt(i-1);
                char s = cardAsText.charAt(i);
                Card newCard = new Card(Character.toString(r), Suite.getSuite(s));
                hand[i/2] = newCard;
            }
            return hand;
        }
    }*/
}
