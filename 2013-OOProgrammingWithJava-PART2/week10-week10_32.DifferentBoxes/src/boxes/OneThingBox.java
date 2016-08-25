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
public class OneThingBox extends Box {
    private List<Thing> list = new ArrayList<Thing>();
    
    public OneThingBox(){
        
    }

    @Override
    public void add(Thing thing) {
        if(list.isEmpty()){
            list.add(thing);
        }
        
    }
    

    @Override
    public boolean isInTheBox(Thing thing) {
        if(list.isEmpty()){
            return false;
        }
        else{
             return list.get(0).equals(thing);
        }
       
    }
    
   
    
}
