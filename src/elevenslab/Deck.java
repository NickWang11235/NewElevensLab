/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevenslab;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Simulates a deck of card
 * @author 321895
 */
public class Deck {
    
    private List<Card> cards = new ArrayList();
    private int size;
    
    public Deck(String[] cardRank, String[] cardSuit, int[] cardPointValue){
           for(int i = 0; i < cardRank.length; i++)
               for(int j = 0; j < cardSuit.length; j++)
                   cards.add(new Card(cardRank[i], cardSuit[j], cardPointValue[i]));
           size = cards.size();
           shuffle();
    }
    
    public Card deal(){
        Card card = cards.get(size-1);
        cards.remove(size-1);
        size--;
        return card;
    }
                
    public boolean isEmpty(){
        return size == 0;
    }
    
    public int size(){
        return size;
    }   
    
    public void shuffle(){
        
        Random gen = new Random();
        
        for(int i = cards.size()-1; i >0 ; i--){
            int index = gen.nextInt(i);  
            Card temp = cards.get(index);
            cards.set(index, cards.get(i));
            cards.set(i, temp);
        }
        
        size = cards.size();
    }
    
    /**
     * Generates and returns a string representation of this deck.
     * @return a string representation of this deck.
     */
    @Override
    public String toString() {
        String rtn = "size = " + size + "\nUndealt cards: \n";
        for (int k = size - 1; k >= 0; k--) {
            rtn = rtn + cards.get(k);
            if (k != 0) {
            rtn = rtn + ", ";
        }
            if ((size - k) % 2 == 0) {
            // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) {
        rtn = rtn + cards.get(k);
            if (k != size) {
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) {
            // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;
    }
}
