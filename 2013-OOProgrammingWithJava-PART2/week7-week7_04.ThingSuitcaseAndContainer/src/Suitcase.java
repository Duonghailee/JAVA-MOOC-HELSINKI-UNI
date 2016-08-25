
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class Suitcase {
    private ArrayList<Thing> things;
    private int maxWeight;
    
    
    public Suitcase(int weightLimit){
        things = new ArrayList<Thing>();
        this.maxWeight = weightLimit;
        
    }
    
    public void addThing(Thing thing){
            if(this.totalWeight()+thing.getWeight()<=this.maxWeight){
                things.add(thing);
            }
        }
            
    // printThings
    public void printThings(){
        for(Thing thing: things){
            System.out.println(thing);
        }
    }
    
    //total Weight
    
    public int totalWeight(){
       int totalWeight = 0;
       for(Thing thing : things){
           totalWeight += thing.getWeight();
       }
       return totalWeight;
    }
    
    //heaviest thing
    public Thing heaviestThing(){
        Thing heaviest = null;
        for(Thing thing : things){
            if(heaviest == null || heaviest.getWeight()<thing.getWeight()){
                   heaviest = thing;
                }
            }
            return heaviest;  
        }
    
    public String toString(){
        if(things.isEmpty()){
            return "empty (0 kg)";
        }
        if(things.size()==1){
            return  things.size() + " thing " + "(" + this.totalWeight() +"kg)";
        }
        return  things.size() + " things " + "(" + this.totalWeight() +"kg)";
    }
}
