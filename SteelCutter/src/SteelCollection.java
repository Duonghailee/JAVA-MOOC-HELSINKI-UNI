
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class SteelCollection {
    private Map<Steel, Integer> steelList ;
    private Set<Case> cases;
    
    public SteelCollection(){
        this.steelList = new HashMap<>();
    }
    
    public void addSteel(Steel steel, int numbers){
        if(!this.steelList.containsKey(steel)){
            this.steelList.put(steel, numbers);
        }
    }
    
    public void printAllSteels(){
        for(Steel s : this.steelList.keySet()){
            System.out.print(s) ;
            System.out.println(" . Quanity: " +this.steelList.get(s));
            
        }
        
    }
    
}
