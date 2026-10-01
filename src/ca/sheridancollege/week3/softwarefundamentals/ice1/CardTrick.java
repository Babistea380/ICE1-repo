/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * 
 * @author dancye
 */
public class CardTrick {

    private static final int TOTAL_RANKS = 13;
    private static final int TOTAL_SUITS = 4;
    public static final int HAND_SIZE = 7;

    private static boolean isValidSuit(String suit) {
        for (String s : Card.SUITS) {
            if (suit.equalsIgnoreCase(s)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Card[] magicHand = new Card[HAND_SIZE];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) (Math.random() * TOTAL_RANKS) + 1);
            c.setSuit(Card.SUITS[(int) (Math.random() * TOTAL_SUITS)]);
            magicHand[i] = c;
        }

        // Ask user for Card value and suit
        Scanner scanner = new Scanner(System.in);
        String suit;
        int rank;

        // Get suit from user
        System.out.print("Pick a suit: ");
        suit = scanner.next();

        // Re-prompt if invalid suit entered
        while (!isValidSuit(suit)) {
            System.out.printf("\n%s is not a valid suit.\nSelect Hearts, Diamonds, Spades, or Clubs: ", suit);
            suit = scanner.next();
        }

        // Get rank from user
        System.out.printf("Pick a rank: (1-%d): ", TOTAL_RANKS);
        while (true) {
            if (scanner.hasNextInt()) {
                rank = scanner.nextInt();

                // Exit loop if valid rank entered
                if (rank >= 1 && rank <= TOTAL_RANKS) {
                    break;
                }

                System.out.printf("\n%d is not a valid rank.\nSelect a number from 1 to %d: ", rank, TOTAL_RANKS);

            } else { // Input was not an integer
                System.out.printf("\nInvalid input.\nSelect a number from 1 to %d: ", TOTAL_RANKS);
                scanner.next(); // Clear vlaue
            }
        }
        
        // Create user's selected card
        Card userCard = new Card();
        userCard.setSuit(suit);
        userCard.setValue(rank);

        // Search magic hand for user's card
        int counter = 1;
        boolean matchFound = false;
        for (Card c : magicHand) {
            System.out.println(" - Card " + counter + ": " + c.getValue() + " of " + c.getSuit());

            if (c.getSuit().equalsIgnoreCase(userCard.getSuit()) && c.getValue() == userCard.getValue()) {
                matchFound = true;
                System.out.println("Match found!");
            }

            counter++;
        }

        if (!matchFound) {
            System.out.println("Your card was not in the magic hand :(");
        }

        scanner.close();
    }

}
