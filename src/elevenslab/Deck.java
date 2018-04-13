/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevenslab;

import java.util.ArrayList;
import java.util.Random;

/**
 * Simulates a deck of card
 * @author 321895
 */
public class Deck {
    
    private ArrayList<Card> deck = new ArrayList<Card>();
    private int size;
    
    public Deck(String[] cardRank, String[] cardSuit, int[] cardPointValue){
        size = cardRank.length * cardSuit.length;
           for(int i = 0; i < cardRank.length; i++)
               for(int j = 0; j < cardSuit.length; j++)
                   deck.add(new Card(cardRank[i], cardSuit[j], cardPointValue[i]));
           shuffle();
    }
    
    public ArrayList<Card> getDeck(){
        return deck;
    }
    
    public Card deal(){
        Card card = deck.get(deck.size()-1);
        deck.remove(deck.size()-1);
        return card;
    }
                
    public boolean isEmpty(){
        return deck.isEmpty();
    }
    
    public int size(){
        return deck.size();
    }   
    
    public void shuffle(){
        
        Random gen = new Random();
        
        for(int i = deck.size()-1; i >0 ; i--){
            int index = gen.nextInt(i);  
            Card temp = deck.get(index);
            deck.set(index, deck.get(i));
            deck.set(i, temp);
        }
        size = deck.size();
    }
}
