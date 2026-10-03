/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then searches the array of cards for a hard-coded lucky card.
 * To be used as starting code in ICE 1
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
        
        Card luckyCard = new Card();
        luckyCard.setValue(3);
        luckyCard.setSuit("Hearts");
        
        boolean found = false;
        for (int i=0; i<magicHand.length; i++)
        {
            if (magicHand[i].getValue() == luckyCard.getValue() && magicHand[i].getSuit().equalsIgnoreCase(luckyCard.getSuit()))
            {
                found = true;
                break;
            }
        }
        
        if (found)
        {
            System.out.println("The lucky card, the " + luckyCard.getValue() + " of " + luckyCard.getSuit() + ", is in the magic hand. You win!");
        }
        else
        {
            System.out.println("The lucky card, the " + luckyCard.getValue() + " of " + luckyCard.getSuit() + ", is not in the magic hand. You lose.");
        }
        System.out.println();
        
        System.out.println("The magic hand was:");
        for (int i=0; i<magicHand.length; i++)
        {
            System.out.println(magicHand[i].getValue() + " of " + magicHand[i].getSuit());
        }
    }
    
}
