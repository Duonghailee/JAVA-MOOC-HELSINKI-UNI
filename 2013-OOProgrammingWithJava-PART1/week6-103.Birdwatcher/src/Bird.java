/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class Bird {
    private String name;
    private String latinName;
    private int timeObserved;
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.timeObserved = 0;
    }
    
    // getName;
    public String getName(){
        return name;
    }
    
    public String getLatin(){
        return latinName;
    }
    
    public int timeObserved(){
        return timeObserved;
    }
    
    public void timeObservedIncrease(){
        this.timeObserved++;
    }
    
    public String toString(){
        return this.name + " (" +this.latinName +"): " + this.timeObserved + " observations";
    }
}
