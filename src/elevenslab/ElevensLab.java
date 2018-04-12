/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevenslab;

/**
 *
 * @author 321895
 */
public class ElevensLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Deck deck = new Deck(new String[] {"A","B","C"}, new String[]{"Giraffes","Lions"}, new int[]{2,1,6});
        
        System.out.println(deck.getDeck());
        deck.shuffle();
        System.out.println(deck.getDeck());
        deck.shuffle();
        System.out.println(deck.getDeck());     

    }
    
}
