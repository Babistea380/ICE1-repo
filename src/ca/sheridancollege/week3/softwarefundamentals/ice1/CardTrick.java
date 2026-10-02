/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

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

    public static void main(String[] args) {
        Card[] magicHand = new Card[HAND_SIZE];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) (Math.random() * TOTAL_RANKS) + 1);
            c.setSuit(Card.SUITS[(int) (Math.random() * TOTAL_SUITS)]);
            magicHand[i] = c;
        }

        // Create lucky card
        Card luckyCard = new Card();
        luckyCard.setSuit("Diamonds");
        luckyCard.setValue(4);

        System.out.printf("The lucky card is the %d of %s\n\n", luckyCard.getValue(), luckyCard.getSuit());

        // Search magic hand for user's card
        int counter = 1;
        boolean matchFound = false;
        for (Card c : magicHand) {
            System.out.println(" - Card " + counter + ": " + c.getValue() + " of " + c.getSuit());

            if (c.getSuit().equalsIgnoreCase(luckyCard.getSuit()) && c.getValue() == luckyCard.getValue()) {
                matchFound = true;
                System.out.println("Match found!");
            }

            counter++;
        }

        if (!matchFound) {
            System.out.println("The lucky card was not in the magic hand :(");
        } else {
            System.out.println("The magic hand includes the lucky card!");
        }
    }

}
