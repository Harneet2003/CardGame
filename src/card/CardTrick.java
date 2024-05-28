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

        Card luckyCard=new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");

    
        for(Card card:magicHand){
            boolean found=false;
            if(card.getValue()==luckyCard.getvalue() && card.getSuit().equalsIgnoreCase(luckyCard.getSuit())){
                found=true;
            }
        }
        
        if(found){
            System.out.println("Your card is in the magic hand, You win!");
        }
        else{
            System.out.println("Sorry, your is not in the magic hand, You lose!");
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }

}
