
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class RingingCentre {
    private Map<Bird, List<String>> BirdList;
    
    public RingingCentre(){
        this.BirdList = new HashMap<Bird, List<String>>();
    }
    
    // store info about bird and place
    public void observe(Bird bird, String place){
       if(!this.BirdList.containsKey(bird)){
           this.BirdList.put(bird, new ArrayList<String>());
       }
       
        this.BirdList.get(bird).add(place);
       
    }
    
    // printall INfo
    
    public void observations(Bird bird){
        if(!this.BirdList.containsKey(bird)){
            System.out.println(bird + " observations: 0");
          return ;
        }
        System.out.println(bird + " observations: " + this.BirdList.get(bird).size());
        for(String p : this.BirdList.get(bird)){
              System.out.println(p);
        }
    }    
}
