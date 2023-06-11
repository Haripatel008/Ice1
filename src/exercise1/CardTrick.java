package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card.
 * To be used as starting code in Exercise
 *
 * @author Mehrdad Iravani
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] hand = new Card[7];

        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
        }
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of your card (1-13): ");
        int value = scanner.nextInt();
        System.out.print("Enter the suit of your card (1-4): ");
        int suit = scanner.nextInt();

        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suit - 1]);

        boolean found = false;
        for (Card card : hand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }

        if (found) {
            printInfo();
        } else {
            System.out.println("Sorry, your card was not found in the hand.");
        }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to
     * replace this information with your own.
     */
    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Hari");
        System.out.println();

        System.out.println("My career ambitions: To get hired by multinational IT company");
        System.out.println("Assist users in various tasks");
        System.out.println("Continuously learn and improve my abilities");

        System.out.println();

        System.out.println("My hobbies: ");
        System.out.println("Helping people");
        System.out.println("Answering questions");
        System.out.println("Engaging in conversations");

        System.out.println();
    }

}
