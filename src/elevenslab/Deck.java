/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevenslab;

import java.util.Stack;

/**
 * Simulates a deck of card
 * @author 321895
 */
public class Deck {
    
    private Stack<Card> deck = new Stack();
    
    public Deck(String[] cardRank, String[] cardSuit, int[] cardPointValue){
        
           for(int i = 0; i < cardRank.length; i++)
               for(int j = 0; j < cardSuit.length; j++)
                   deck.push(new Card(cardRank[i], cardSuit[j], cardPointValue[i]));
    }
    
    public Card deal(){
        return deck.pop();
    }
                
}
