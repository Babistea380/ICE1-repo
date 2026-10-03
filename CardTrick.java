/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * Modified by: Baldeep Johal Student ID: 991842603 Date Modified: Oct 2, 2026
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();

            c.setValue((int) (Math.random() * 13) + 1);
            c.setSuit(Card.SUITS[(int) (Math.random() * Card.SUITS.length)]);

            magicHand[i] = c;
        }


        Scanner input = new Scanner(System.in);

        System.out.print("Enter a card value from 1 to 13: ");
        int userValue = input.nextInt();

        input.nextLine();

        System.out.print("Enter a Suit: ");
        String userSuit = input.nextLine();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        boolean found = false;

        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue()
                    && card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                found = true;
            }
        }
        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand!");
        }

    }

}
