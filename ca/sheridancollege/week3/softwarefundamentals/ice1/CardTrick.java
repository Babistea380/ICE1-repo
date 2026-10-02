/*
 * Modified by: Simon Jaramillo
 * Student Number: 991830243
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * Makes a hand of seven random cards and checks whether
 * the card chosen by the user is in the hand.
 *
 * @author dancye
 */

public class CardTrick {

    public static void main(String[] args) {

        Card[] magicHand = new Card[7];

        Random random = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card card = new Card();

            card.setValue(random.nextInt(13) + 1);

            int randomSuit = random.nextInt(Card.SUITS.length);
            card.setSuit(Card.SUITS[randomSuit]);

            magicHand[i] = card;
        }
        
        Card luckyCard = new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit("Hearts");
        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Choose a card value from 1 to 13: ");
        int chosenValue = keyboard.nextInt();
        keyboard.nextLine(); 

        System.out.print("Choose a suit (Hearts, Diamonds, Spades, Clubs): ");
        String chosenSuit = keyboard.nextLine();

        boolean found = false;

        for (int i = 0; i < magicHand.length; i++) {
            Card card = magicHand[i];

            if (card.getValue() == chosenValue
                    && card.getSuit().equalsIgnoreCase(chosenSuit)) {
                found = true;
                break; 
            }
        }

        if (found) {
            System.out.println("You win! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }

        keyboard.close();
    }
}
