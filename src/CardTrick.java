import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * 
 * Files modified by Garrett Holland as part of the 2026 Fall SYST 17796 class
 * 991442405
 * 2026/09/226
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        Card luckyCard = new Card();
        luckyCard.setValue(1);
        luckyCard.setSuit("Spades");
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13) + 1);
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);

        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        /**Scanner scan = new Scanner(System.in);
        System.out.println("Try to guess a card in hand. \n");
        System.out.println("Enter the rank: ");
        
        //input
        int value = scan.nextInt();
        System.out.println("Enter the suit: ");
        
        String suit = scan.nextLine();
        
        Card inputCard = new Card();
        inputCard.setValue(value);
        inputCard.setSuit(suit);
        
        boolean match = false;
        for (Card c : magicHand) {
            // slightly more complex but we have to case match in case player types hearts HEARTS Hearts etc.
            if (c.getValue() == inputCard.getValue() && c.getSuit().equalsIgnoreCase(inputCard.getSuit())) {
                match = true;
                break;
            }
        }
        **/
        
        boolean match = false;
        for (Card c : magicHand) {
            // slightly more complex but we have to case match in case player types hearts HEARTS Hearts etc.
            if (c.getValue() == luckyCard.getValue() && c.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                match = true;
                break;
            }
        }
        
        if (match){
            System.out.println("You did it! You pulled the lucky Card!");
        }
        else{
            System.out.println("Ohh, nice try but no luck!");
        }
    }
    
}
