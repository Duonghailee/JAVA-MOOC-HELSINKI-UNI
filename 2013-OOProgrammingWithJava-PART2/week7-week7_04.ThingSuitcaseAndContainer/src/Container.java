
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
public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> container;
    
    public Container(int maxLimit){
        this.maxWeight = maxLimit;
        container = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(this.totalWeight()+suitcase.totalWeight()<=this.maxWeight){
            container.add(suitcase);
        }
    }
    
    //total weight of suitcase
    public int totalWeight(){
       int totalWeight = 0;
       for(Suitcase s : container){
           totalWeight += s.totalWeight();
       }
       return totalWeight;
    }
    
    // printThings
    public void printThings(){
        for(Suitcase s: container){
            s.printThings();
        }
    }
    
    //toString overide
    public String toString(){
        if(container.isEmpty()){
            return "empty (0 kg)";
        }
        if(container.size()==1){
            return  container.size() + " suitcase " + "(" + this.totalWeight() +"kg)";
        }
        else{
            return  container.size() + " suitcases " + "(" + this.totalWeight() +"kg)";
        }
    }
}
