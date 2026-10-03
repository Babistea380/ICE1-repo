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
 * @author dancye
 * Modified by Gurnoor Gill
 * Student Number: 991846294
 * Date Modified: October 2, 2026
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13) + 1);
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            magicHand[i] = c;
        }
        
        Scanner input = new Scanner(System.in);
        System.out.println("Pick any card from the deck.");
        System.out.println();
        
        int userValue = 0;
        while (userValue < 1 || userValue > 13)
        {
            System.out.print("Enter the card value (1-13, Ace = 1, Jack = 11, Queen = 12, King = 13): ");
            userValue = input.nextInt();
            if (userValue < 1 || userValue > 13)
            {
                System.out.println("Invalid value. Please try again.");
            }
        }
        System.out.println();
        
        String userSuit = "";
        boolean validSuit = false;
        while (!validSuit)
        {
            System.out.print("Enter the card suit (Hearts, Diamonds, Spades, or Clubs): ");
            userSuit = input.next();
            for (int i=0; i<Card.SUITS.length; i++)
            {
                if (userSuit.equalsIgnoreCase(Card.SUITS[i]))
                {
                    validSuit = true;
                    userSuit = Card.SUITS[i];
                }
            }
            if (!validSuit)
            {
                System.out.println("Invalid suit. Please try again.");
            }
        }
        System.out.println();
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        Card luckyCard = new Card();
        luckyCard.setValue(3);
        luckyCard.setSuit("Hearts");
        
        boolean found = false;
        for (int i=0; i<magicHand.length; i++)
        {
            if (magicHand[i].getValue() == userCard.getValue() && magicHand[i].getSuit().equalsIgnoreCase(userCard.getSuit()))
            {
                found = true;
                break;
            }
        }
        
        if (found)
        {
            System.out.println("Your card, the " + userCard.getValue() + " of " + userCard.getSuit() + ", is in the magic hand!");
        }
        else
        {
            System.out.println("Sorry, the " + userCard.getValue() + " of " + userCard.getSuit() + " is not in the magic hand.");
        }
        System.out.println();
        
        System.out.println("The magic hand was:");
        for (int i=0; i<magicHand.length; i++)
        {
            System.out.println(magicHand[i].getValue() + " of " + magicHand[i].getSuit());
        }
        
        input.close();
    }
    
}
