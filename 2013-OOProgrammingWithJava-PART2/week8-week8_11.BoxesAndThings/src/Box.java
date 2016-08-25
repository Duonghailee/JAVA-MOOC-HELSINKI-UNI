
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
public class Box implements ToBeStored {
    private double maxWeight;
    private ArrayList<ToBeStored> box;
    
    public Box(double max){
        this.maxWeight = max;
        box = new ArrayList<ToBeStored>();
    }
    
    public void add(ToBeStored thing){
        if((this.weight()+thing.weight())<=this.maxWeight){
            box.add(thing);
        }
    }
    
    public double weight(){
        double weight = 0;
        for(ToBeStored thing : box){
            weight += thing.weight();
        }
        return weight;
    }
    
    public String toString(){
        return "Box: " + box.size() + " things, total weight " + this.weight() + " kg";
    }
}
