/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*Harneet Kaur
Student Number: 991728683
*/
package card;

import static card.Card.SUITS;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            Random rn=new Random();
            
            c.setValue(rn.nextInt(13)+1);
            c.setSuit(Card.SUITS[rn.nextInt(4)]);
            magicHand[i]=c;
        }
        
        for(Card card:magicHand){
            System.out.print(card.getSuit()+" ");
            System.out.println(card.getValue());
        }

        
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a card value(1-13): ");
        int value=input.nextInt();
        System.out.print("Enter a card suit(0-3 where 0=Hearts, 1=Diamonds, 2=Spades, 3=Clubs): ");
        int suit=input.nextInt();
        
        String userSuit = SUITS[suit];

        boolean found=false;
        for(Card card:magicHand){
            
            if(card.getValue()==value && card.getSuit().equalsIgnoreCase(userSuit)){
                found=true;
            }
        }
        
        if(found){
            System.out.println("Your card is in the magic hand");
        }
        else{
            System.out.println("Sorry, your is not in the magic hand");
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }

}
