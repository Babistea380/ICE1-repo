/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier Lucas Brdar
 * Student ID: 991835135
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Card[] magicHand = new Card[7];

        // Hard-Coded luckycard
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Spades");
        
        for (int i=0; i < magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(random.nextInt(2, 14));
            c.setSuit(Card.SUITS[random.nextInt(0, 4)]);
            
            magicHand[i] = c;
        }
        
        int cardValue = -1;
        int cardSuitInt = -1;
        boolean validInput = false;
        String cardSuitString = "";
        
        // Get Card Value
        while (!validInput) {
            System.out.println("(Note: #'s 2-13 Accepted, 11-13 are equal to the Face Cards");
            System.out.println("Please Input your Lucky Cards Value!: ");
            
            if (scanner.hasNextInt()) {
                cardValue = scanner.nextInt();
                validInput = true;
            }
            else{
                System.out.println("Error: Invalid Input!");
                scanner.next();
            }
        }
        
        validInput = false;
        
        // Get Card Suit
        while (!validInput) {
            System.out.println("(Note: 0 - Hearts, 1 - Diamonds, 2 - Spades, 3 - Clubs");
            System.out.println("Please Input your Lucky Cards Suit! (ints: 0-3): ");
            
            if (scanner.hasNextInt()) {
                cardSuitInt = scanner.nextInt();
                validInput = true;
            }
            else{
                System.out.println("Error: Invalid Input!");
                scanner.next();
            }
        }
        
        // Finalize the Suit String
        if (cardSuitInt == 0) { cardSuitString = "Hearts"; }
        else if (cardSuitInt == 1) { cardSuitString = "Diamonds"; }
        else if (cardSuitInt == 2) { cardSuitString = "Spades"; }
        else { cardSuitString = "Clubs"; }
        
        
        // Lucky Card Creation
        Card luckyCard = new Card();
        luckyCard.setValue(cardValue);
        luckyCard.setSuit(cardSuitString);
        
        System.out.println("Your Card is the " + luckyCard.getValue() + " of " + luckyCard.getSuit());
        
        
        //and search magicHand here
        boolean hitTheJackpot = false;
        for (int i=0; i < magicHand.length; i++) {
            
            // Check Suit
            if (magicHand[i].getSuit().equals(luckyCard.getSuit())) {
                
                // Check Value
                if (magicHand[i].getValue() == luckyCard.getValue()) {
                    // Its Equal!
                    hitTheJackpot = true;
                    break;
                }
                
            }
        }
        
        System.out.println("----------------------------------");
        System.out.println("-----   CARD TRICK RESULTS   -----");
        System.out.println(" ");
        
        //Then report the result here
        if (hitTheJackpot){
            System.out.println("YOUR CARD WAS IN THE MAGIC HAND!!!!!!");
        } else { System.out.println("UNFORTUNATELY. Your lucky card wasn't so lucky after all."); }
    }
}
