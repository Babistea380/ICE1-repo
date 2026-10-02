/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardtrick;

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
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner scan = new Scanner(System.in);
        int userValue;
        String userSuit;
        boolean searchResult = false;
        Card userCard = new Card();
        Card luckyCard = new Card();
        luckyCard.setSuit("Hearts");
        luckyCard.setValue(12);
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            int randomnum = ((int)(Math.random() * 13) + 1);
            c.setValue(randomnum);
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            magicHand[i] = c;
        }
       
        
        //insert code to ask the user for Card value and suit, create their card
//        
        
        // and search magicHand here
        for (int i=0; i<magicHand.length; i++)
        {
            if (magicHand[i].getValue() == luckyCard.getValue() && magicHand[i].getSuit().equals(luckyCard.getSuit())){
                searchResult = true;
        }
        }
        //Then report the result here
        System.out.println(searchResult ? "The card is in the deck, You win!" : "The card is not in the deck, You lose.");
    }
    
} 

