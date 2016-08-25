/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit){
        value = 0;
        this.upperLimit = upperLimit;
    }
    
    public void next(){
        value++;
        if(value>upperLimit){
            value = 0;
        }
    }
    
    public String toString(){
        if(value<10){
            return "0" +value;
        }
        return "" + value;
    }
    
    public int getValue(){
        return value;
    }
    
    public void setValue(int val){
        if(val>=0 && val <=upperLimit){
            value = val;
        }
    }
}

