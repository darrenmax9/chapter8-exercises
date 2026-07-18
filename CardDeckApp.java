import java.util.Random;

public class CardDeckApp {

    public static void main(String[] args) {

        String[] deck = getDeck();

        System.out.println("DECK");
        displayCards(deck);

        shuffleDeck(deck);

        System.out.println("\nSHUFFLED DECK");
        displayCards(deck);

        String[] hand = dealCards(deck, 2);

        System.out.println("\nHAND OF 2 CARDS");
        displayCards(hand);
    }

    public static String[] getDeck() {

        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] ranks = {
                "Ace", "2", "3", "4", "5", "6", "7",
                "8", "9", "10", "Jack", "Queen", "King"
        };

        String[] deck = new String[52];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }

        return deck;
    }

    public static void displayCards(String[] cards) {
        for (String card : cards) {
            System.out.print("|" + card);
        }
        System.out.println("|");
    }

    public static void shuffleDeck(String[] deck) {
        Random random = new Random();

        for (int i = 0; i < deck.length; i++) {
            int j = random.nextInt(deck.length);

            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    public static String[] dealCards(String[] deck, int numberOfCards) {

        String[] hand = new String[numberOfCards];

        for (int i = 0; i < numberOfCards; i++) {
            hand[i] = deck[i];
        }

        return hand;
    }
}
