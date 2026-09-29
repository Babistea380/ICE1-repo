/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
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
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random random = new Random();
            int randomValue = random.nextInt(13)+1; 
            c.setValue(randomValue);
            int randomSuit = random.nextInt(4); 
            c.setSuit(Card.SUITS[randomSuit]);
        }
        
        Scanner read = new Scanner(System.in);
        boolean valueValid = false;
        boolean suitValid = false;
        String getValue;
        String getSuit;
        
        while (!valueValid) {
            System.out.print("Enter Card Value (1-13): ");
            getValue = read.nextLine();
                if (valueValid(getValue)) {
                    valueValid = true;
                }
        }
        
        while (!suitValid) {
            System.out.print("Enter Suit (0 = clubs, 1 = spades, 2 = diamonds, 3 = hearts): ");
            getValue = read.nextLine();
                if (suitValid(getValue)) {
                    suitValid = true;
                }
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
    }
    
}
