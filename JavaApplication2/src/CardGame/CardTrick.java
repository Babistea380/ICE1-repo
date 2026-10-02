package CardGame;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author bakerryl
 */

public class CardTrick {
    
    public static boolean validInt(String s) {
        if (s.isEmpty() == true) {
            System.out.println("Invalid format. Input is empty. Use ABC-1234 format.");
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                if (Character.isLetter(s.charAt(i))) {
                    System.out.println("Invalid format: Input must be a number. No letters needed.");
                }
                else {
                    System.out.println("Invalid format: Input must be a positive whole number. No symbols needed.");
                }
                return false;
            }
        }
        return true;
    }
    
        public static boolean valueValid(String s) {
        if (!validInt(s)) {
            return false;
        }
        int sNum = Integer.parseInt(s);
        if (sNum < 1 || sNum > 13) {
            System.out.println("Invalid format: Input must be greater than 0 or less than 14.");
            return false;
        }

        return true;
    }
        
    public static boolean suitValid(String s) {
        if (!validInt(s)) {
            return false;
        }
        int sNum = Integer.parseInt(s);
        if (sNum < 0 || sNum > 3) {
            System.out.println("Invalid format: Input must be greater than 0 or less than 14.");
            return false;
        }

        return true;
    }
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i < magicHand.length; i++)
        {
            Card c = new Card();
            Random random = new Random();
            int randomValue = random.nextInt(13)+1; 
            c.setValue(randomValue);
            int randomSuit = random.nextInt(4); 
            c.setSuit(Card.SUITS[randomSuit]);
            magicHand[i] = c;
        }
        
        Card luckyCard = new Card();
        luckyCard.setValue(8);
        luckyCard.setSuit("Clubs");
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
        boolean foundCard = false;
        for (int i=0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == luckyCard.getValue() && magicHand[i].getSuit().equals(luckyCard.getSuit())) {
                foundCard = true;
                System.out.println("Found Lucky Card in deck!");
                break;
            }
        }
        if (!foundCard) {
            System.out.println("Could not find Lucky Card in deck...");
        }

      
    }
        
}
    

