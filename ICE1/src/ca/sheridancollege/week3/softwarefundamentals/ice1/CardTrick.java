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
 * @author dancye
 */

import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[8]; 
        for (int i=0; i<magicHand.length-1; i++) {   
            Card c = new Card();
            c.setValue((int)(Math.random()*13)+1);
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            
            //Comment in for an easier time guessing what cards are in hand.
//            System.out.println(c.getSuit());
//            System.out.println(c.getValue());
            magicHand[i] = c;
        }

        Card luckyCard =  new Card();
        luckyCard.setValue(14); // Ace
        luckyCard.setSuit(Card.SUITS[2]); // Spades
        
        magicHand[7]= luckyCard;
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner s = new Scanner(System.in);
        
        System.out.println("---Pick any card---\n\nEnter value (2-14):");
        int pickedValue = s.nextInt();
        
        System.out.println("\nEnter suit (Spades, Clubs, Diamonds, Hearts):");
        String pickedSuit = s.next();
        
        s.close();
        
        // and search magicHand here
        for (int i=0; i<magicHand.length; i++){
            if (pickedValue == magicHand[i].getValue() && pickedSuit.equals(magicHand[i].getSuit())) {
                //Then report the result here
                System.out.println("\nCard is in hand!");
                break;
            }
            if (i == 6) {
                //Or report the result here
                System.out.println("\nCard is not in hand.");
            }
            // change
        }
    }
}
