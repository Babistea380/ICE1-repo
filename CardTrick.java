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
 * 
 * @author dancye
 * @modifier Mahboubeh Nosratiabarghouei
* @studentID 991848953
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand=new Random();
        
        for(int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(rand.nextInt(13)+1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i]=c;
        }
        
        //  Add luckyCard    
        Card luckyCard = new Card();
        luckyCard.setValue(8);
        luckyCard.setSuit("Spades");


        
        //insert code to ask the user for Card value and suit, create their card
        Scanner input=new Scanner(System.in);
        System.out.println("choose among(\"Hearts\", \"Diamonds\", \"Spades\", \"Clubs\") ");
        String userSuit=input.next();
        
        System.out.println("choose number on Card ");
        int userValue=input.nextInt();
        Card userCard = new Card();
        userCard.setSuit(userSuit);
        userCard.setValue(userValue);
        
        // and search magicHand here
        boolean check=false;
        for (Card c: magicHand){
            if(userCard.getSuit().equals(c.getSuit()) && userCard.getValue()==c.getValue()){
                check=true;
                break;
            }
        }
        
        //Then report the result here
         if (check) {
            System.out.println("Your card is found");
        } else {
            System.out.println("Your card not found.");
        }
        
    }
    
}
