/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duonghaily
 */
public class MaxWeightBox extends Box{
    private int maxWeight;
    private List<Thing> list;
    
    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        list = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        
        if(thing.getWeight() <= this.maxWeight){
             list.add(thing);
             this.maxWeight-= thing.getWeight();
        }
        
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        for(Thing th : list){
            if(th.equals(thing)){
                return true;
            } 
        }
        return false;
    }
    
    
}
