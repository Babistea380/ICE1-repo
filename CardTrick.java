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
 * @modifier Sharoon Emmanuel
 * @studentNumber 991844885
 * @dateModified September 27, 2026
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random() * 13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            
            magicHand[i] = c;
        }

        //Hard-coded lucky card
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Hearts");
        
        
        // and search magicHand here
        boolean found = false;
        
        for (int i = 0; i < magicHand.length; i++)
        {
            if (magicHand[i].getValue() == luckyCard.getValue()
                    && magicHand[i].getSuit().equalsIgnoreCase(luckyCard.getSuit()))
            {
                found = true;
            }
        }
        //Then report the result here
        if (found)
        {
            System.out.println("You win! The lucky card is in the magic hand!");
        }
        else
        {
            System.out.println("You lose! The lucky card is not in the magic hand.");
        }
    }
    
}
 