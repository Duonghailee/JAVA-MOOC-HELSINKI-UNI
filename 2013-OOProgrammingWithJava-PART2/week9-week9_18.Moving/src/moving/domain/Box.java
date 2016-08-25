/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duonghaily
 */
public class Box implements Thing{
    private int maximumCapacity;
    private List<Thing> list;
    
    public Box(int maxCapacity){
        this.maximumCapacity = maxCapacity;
        list = new ArrayList<Thing>(); 
    }
    
    public boolean addThing(Thing thing){
        if(this.getVolume()+thing.getVolume()>this.maximumCapacity){
            return false;
        }
        else{
            list.add(thing);
            return true;
        }
        
    }
    
    public int getVolume(){
        int volume = 0;
        for(Thing thing : list){
            volume += thing.getVolume();
            
        }
        return volume;
    }
    
    //public String toString(){
    //    return "number of boxes: " + this.getVolume() +
       //         "  things in box"
  //  }
}
