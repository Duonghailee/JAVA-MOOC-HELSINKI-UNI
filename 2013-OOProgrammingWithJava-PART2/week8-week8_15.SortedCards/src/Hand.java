
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hands;
    
    public Hand(){
        hands = new ArrayList<Card>();
    }
    
    public void add(Card card){
        hands.add(card);
    }
    
    public void print(){
        for(Card card : hands){
            System.out.println(card);
        }
    }
    
    // sorting hands
    public void sort(){
        Collections.sort(hands);
    }
    
    // compareTo overriding
    public int compareTo(Hand hand){
        int suitOfThis = 0;
        int valueOfThis= 0;
        
        int suitOfHand = 0;
        int valueOfHand= 0;
        for(Card c : this.hands){
            suitOfThis += c.getSuit();
            valueOfThis += c.getValue();
        }
        
        for(Card c : hand.hands){
            suitOfHand += c.getSuit();
            valueOfHand += c.getValue();
        }
        if(valueOfThis==valueOfHand){
            return 0;
        }
        else{
            return valueOfThis - valueOfHand;
        }  
        // should try only return sumOfValueOfThis- sumOfValueOfHand
    }
    
    // sortAgainstSuit method
    public void sortAgainstSuit(){
        SortAgainstSuitAndValue sort = new SortAgainstSuitAndValue();
        Collections.sort(hands, sort);
    }
}
